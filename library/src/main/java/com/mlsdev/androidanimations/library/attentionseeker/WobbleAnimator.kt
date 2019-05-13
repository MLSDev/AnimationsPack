package com.mlsdev.androidanimations.library.attentionseeker

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnimator

class WobbleAnimator(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnimator(view, animationParams) {
    override fun prepare(target: View, animatorSet: AnimatorSet) {
        val width = target.width.toFloat()
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(target, "translationX",
                0.0f,
                getPercentage(-25, width),
                getPercentage(20, width),
                getPercentage(-15, width),
                getPercentage(10, width),
                getPercentage(-5, width),
                0.0f
            ),
            ObjectAnimator.ofFloat(target, "rotation",
                0.0f,
                -5.0f,
                3.0f,
                -3.0f,
                2.0f,
                -1.0f,
                0.0f
            )
        )
    }

    private fun getPercentage(percent: Int, width: Float) : Float{
        return percent.toFloat() / 100 * width
    }
}