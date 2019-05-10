package com.mlsdev.androidanimations.library

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.view.View
import android.view.animation.Interpolator

abstract class BaseViewAnimator(
    private val target: View,
    private val animationParams: AnimationParams = AnimationParams()
) {

    private var animatorSet: AnimatorSet = AnimatorSet()


    protected abstract fun prepare(target: View)

    fun start() {
        reset(target)
        prepare(target)
        animate()
    }

    fun restart() {
        animatorSet = animatorSet.clone()
        animate()
    }

    private fun reset(target: View) {
        target.alpha = 1.0f
        target.scaleX = 1.0f
        target.scaleY = 1.0f
        target.translationX = 0.0f
        target.translationY = 0.0f
        target.rotation = 0.0f
        target.rotationX = 0.0f
        target.rotationY = 0.0f
    }

    private fun animate() {
        for (animator in animatorSet.childAnimations) {
            if (animator is ValueAnimator) {
                animator.repeatCount = animationParams.repeatTimes
                animator.repeatMode = animationParams.repeatMode
            }
        }

        animatorSet.duration = animationParams.duration
        animatorSet.startDelay = animationParams.startDelay
        animatorSet.interpolator = animationParams.interpolator
        animatorSet.start()
    }

    fun getStartDelay(): Long {
        return animatorSet.startDelay
    }

    fun addAnimatorListener(l: Animator.AnimatorListener) {
        animatorSet.addListener(l)
    }

    fun cancel() {
        animatorSet.cancel()
    }

    fun isRunning(): Boolean {
        return animatorSet.isRunning
    }

    fun isStarted(): Boolean {
        return animatorSet.isStarted
    }

    fun removeAnimatorListener(l: Animator.AnimatorListener) {
        animatorSet.removeListener(l)
    }

    fun removeAllListener() {
        animatorSet.removeAllListeners()
    }

    fun getDuration(): Long {
        return animationParams.duration
    }

    fun getAnimatorSet(): AnimatorSet {
        return animatorSet
    }
}