package com.mlsdev.androidanimations.library

import android.view.View
import com.mlsdev.androidanimations.library.attentionseeker.*
import com.mlsdev.androidanimations.library.bounce.BounceInAnimator
import com.mlsdev.androidanimations.library.bounce.BounceInDownAnimator
import com.mlsdev.androidanimations.library.slider.SlideInDownAnimator
import com.mlsdev.androidanimations.library.slider.`in`.SlideInLeftAnimator
import com.mlsdev.androidanimations.library.slider.`in`.SlideInRightAnimator
import com.mlsdev.androidanimations.library.slider.`in`.SlideInUpAnimator
import com.mlsdev.androidanimations.library.zoom.`in`.*
import com.mlsdev.androidanimations.library.zoom.out.*
import java.lang.RuntimeException

class AnimationUtils {
    companion object {
        val animationNames = mutableListOf(
            BounceAnimator::class.java.simpleName,
            FlashAnimator::class.java.simpleName,
            PulseAnimator::class.java.simpleName,
            RubberBandAnimator::class.java.simpleName,
            ShakeAnimator::class.java.simpleName,
            SwingAnimator::class.java.simpleName,
            TadaAnimator::class.java.simpleName,
            WobbleAnimator::class.java.simpleName,
            HeartbeatAnimator::class.java.simpleName,

            BounceInAnimator::class.java.simpleName,
            BounceInDownAnimator::class.java.simpleName,


            ZoomOutAnimator::class.java.simpleName,
            ZoomOutDownAnimator::class.java.simpleName,
            ZoomInAnimator::class.java.simpleName,
            ZoomOutLeftAnimator::class.java.simpleName,
            ZoomOutUpAnimator::class.java.simpleName,
            ZoomOutRightAnimator::class.java.simpleName,
            ZoomInDownAnimator::class.java.simpleName,
            ZoomInLeftAnimator::class.java.simpleName,
            ZoomInRightAnimator::class.java.simpleName,
            ZoomInUpAnimator::class.java.simpleName,
            SlideInDownAnimator::class.java.simpleName,
            SlideInLeftAnimator::class.java.simpleName,
            SlideInRightAnimator::class.java.simpleName,
            SlideInUpAnimator::class.java.simpleName
        )

        fun getAnimation(
            name: String,
            view: View,
            animationParams: AnimationParams = AnimationParams()
        ): BaseViewAnimator {
            return when (name) {
                BounceAnimator::class.java.simpleName -> {
                    BounceAnimator(view, animationParams)
                }
                FlashAnimator::class.java.simpleName -> {
                    FlashAnimator(view, animationParams)
                }
                PulseAnimator::class.java.simpleName -> {
                    PulseAnimator(view, animationParams)
                }
                RubberBandAnimator::class.java.simpleName -> {
                    RubberBandAnimator(view, animationParams)
                }
                ShakeAnimator::class.java.simpleName -> {
                    ShakeAnimator(view, animationParams)
                }
                SwingAnimator::class.java.simpleName -> {
                    SwingAnimator(view, animationParams)
                }
                TadaAnimator::class.java.simpleName -> {
                    TadaAnimator(view, animationParams)
                }
                WobbleAnimator::class.java.simpleName -> {
                    WobbleAnimator(view, animationParams)
                }
                HeartbeatAnimator::class.java.simpleName -> {
                    HeartbeatAnimator(view, animationParams)
                }

                BounceInAnimator::class.java.simpleName -> {
                    BounceInAnimator(view, animationParams)
                }
                BounceInDownAnimator::class.java.simpleName -> {
                    BounceInDownAnimator(view, animationParams)
                }

                ZoomOutAnimator::class.java.simpleName -> {
                    ZoomOutAnimator(view, animationParams)
                }
                ZoomOutDownAnimator::class.java.simpleName -> {
                    ZoomOutDownAnimator(view, animationParams)
                }
                ZoomInAnimator::class.java.simpleName -> {
                    ZoomInAnimator(view, animationParams)
                }
                ZoomOutLeftAnimator::class.java.simpleName -> {
                    ZoomOutLeftAnimator(view, animationParams)
                }
                ZoomOutUpAnimator::class.java.simpleName -> {
                    ZoomOutUpAnimator(view, animationParams)
                }
                ZoomOutRightAnimator::class.java.simpleName -> {
                    ZoomOutRightAnimator(view, animationParams)
                }
                ZoomInDownAnimator::class.java.simpleName -> {
                    ZoomInDownAnimator(view, animationParams)
                }
                ZoomInLeftAnimator::class.java.simpleName -> {
                    ZoomInLeftAnimator(view, animationParams)
                }
                ZoomInRightAnimator::class.java.simpleName -> {
                    ZoomInRightAnimator(view, animationParams)
                }
                ZoomInUpAnimator::class.java.simpleName -> {
                    ZoomInUpAnimator(view, animationParams)
                }
                SlideInDownAnimator::class.java.simpleName -> {
                    SlideInDownAnimator(view, animationParams)
                }
                SlideInLeftAnimator::class.java.simpleName -> {
                    SlideInLeftAnimator(view, animationParams)
                }
                SlideInRightAnimator::class.java.simpleName -> {
                    SlideInRightAnimator(view, animationParams)
                }
                SlideInUpAnimator::class.java.simpleName -> {
                    SlideInUpAnimator(view, animationParams)
                }
                else -> {
                    throw RuntimeException("Unknown animation name")
                }
            }
        }
    }
}