package com.mlsdev.androidanimations.library

import android.animation.ValueAnimator
import android.view.animation.Interpolator

data class AnimationParams(
    var duration: Long = 1000L,
    var startDelay: Long = 0,
    var interpolator: Interpolator? = null,
    var repeatTimes: Int = 0,
    var repeatMode: Int = ValueAnimator.RESTART
) {
}