package com.mlsdev.androidanimations.library

import android.animation.ValueAnimator
import android.view.animation.Interpolator

data class AnimationParams(
    val duration: Long = 1000L,
    val startDelay: Long = 0,
    val interpolator: Interpolator? = null,
    val repeatTimes: Int = 0,
    val repeatMode: Int = ValueAnimator.RESTART
) {
}