package com.mlsdev.androidanimations.library

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.view.View
import android.view.animation.Interpolator

abstract class BaseViewAnimator(
    private val target: View,
    protected var animationParams: AnimationParams
) {

    private var animatorSet: AnimatorSet = AnimatorSet()

    protected abstract fun prepare(target: View, animatorSet: AnimatorSet)

    fun start() {
        reset(target)
        prepare(target, animatorSet)
        animate()
    }

    private fun reset(target: View) {
        with(target){
            alpha = 1.0f
            scaleX = 1.0f
            scaleY = 1.0f
            translationX = 0.0f
            translationY = 0.0f
            rotation = 0.0f
            rotationX = 0.0f
            rotationY = 0.0f
        }
    }

    private fun animate() {
        for (animator in animatorSet.childAnimations) {
            if (animator is ValueAnimator) {
                animator.repeatCount = animationParams.repeatTimes
                animator.repeatMode = animationParams.repeatMode
            }
        }

        with(animatorSet){
            duration = animationParams.duration
            startDelay = animationParams.startDelay
            interpolator = animationParams.interpolator
            start()
        }
    }

    fun addAnimatorListener(l: Animator.AnimatorListener) {
        animatorSet.addListener(l)
    }

    fun cancel() {
        animatorSet.cancel()
    }

    fun removeAnimatorListener(l: Animator.AnimatorListener) {
        animatorSet.removeListener(l)
    }

    fun removeAllListener() {
        animatorSet.removeAllListeners()
    }

    fun getAnimatorSet(): AnimatorSet {
        return animatorSet
    }
}