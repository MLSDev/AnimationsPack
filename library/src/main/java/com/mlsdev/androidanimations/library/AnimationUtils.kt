package com.mlsdev.androidanimations.library

import android.view.View
import com.mlsdev.androidanimations.library.attentionseeker.*
import com.mlsdev.androidanimations.library.bounce.`in`.*
import com.mlsdev.androidanimations.library.bounce.out.*
import com.mlsdev.androidanimations.library.fade.`in`.*
import com.mlsdev.androidanimations.library.fade.out.*
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
            BounceInLeftAnimator::class.java.simpleName,
            BounceInRightAnimator::class.java.simpleName,
            BounceInUpAnimator::class.java.simpleName,

            BounceOutAnimator::class.java.simpleName,
            BounceOutDownAnimator::class.java.simpleName,
            BounceOutLeftAnimator::class.java.simpleName,
            BounceOutRightAnimator::class.java.simpleName,
            BounceOutUpAnimator::class.java.simpleName,

            FadeInAnimator::class.java.simpleName,
            FadeInDownAnimator::class.java.simpleName,
            FadeInDownBigAnimator::class.java.simpleName,
            FadeInLeftAnimator::class.java.simpleName,
            FadeInLeftBigAnimator::class.java.simpleName,
            FadeInRightAnimator::class.java.simpleName,
            FadeInRightBigAnimator::class.java.simpleName,
            FadeInUpAnimator::class.java.simpleName,
            FadeInUpBigAnimator::class.java.simpleName,

            FadeOutAnimator::class.java.simpleName,
            FadeOutDownAnimator::class.java.simpleName,
            FadeOutDownBigAnimator::class.java.simpleName,
            FadeOutLeftAnimator::class.java.simpleName,
            FadeOutLeftBigAnimator::class.java.simpleName,
            FadeOutRightAnimator::class.java.simpleName,
            FadeOutRightBigAnimator::class.java.simpleName,
            FadeOutUpAnimator::class.java.simpleName,
            FadeOutUpBigAnimator::class.java.simpleName,


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
                //attention
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

                //bounce in
                BounceInAnimator::class.java.simpleName -> {
                    BounceInAnimator(view, animationParams)
                }
                BounceInDownAnimator::class.java.simpleName -> {
                    BounceInDownAnimator(view, animationParams)
                }
                BounceInLeftAnimator::class.java.simpleName -> {
                    BounceInLeftAnimator(view, animationParams)
                }
                BounceInRightAnimator::class.java.simpleName -> {
                    BounceInRightAnimator(view, animationParams)
                }

                BounceInUpAnimator::class.java.simpleName -> {
                    BounceInUpAnimator(view, animationParams)
                }

                //bounce out
                BounceOutAnimator::class.java.simpleName -> {
                    BounceOutAnimator(view, animationParams)
                }
                BounceOutDownAnimator::class.java.simpleName -> {
                    BounceOutDownAnimator(view, animationParams)
                }
                BounceOutLeftAnimator::class.java.simpleName -> {
                    BounceOutLeftAnimator(view, animationParams)
                }
                BounceOutRightAnimator::class.java.simpleName -> {
                    BounceOutRightAnimator(view, animationParams)
                }
                BounceOutUpAnimator::class.java.simpleName -> {
                    BounceOutUpAnimator(view, animationParams)
                }

                //fade in
                FadeInAnimator::class.java.simpleName -> {
                    FadeInAnimator(view, animationParams)
                }
                FadeInDownAnimator::class.java.simpleName -> {
                    FadeInDownAnimator(view, animationParams)
                }
                FadeInDownBigAnimator::class.java.simpleName -> {
                    FadeInDownBigAnimator(view, animationParams)
                }
                FadeInLeftAnimator::class.java.simpleName -> {
                    FadeInLeftAnimator(view, animationParams)
                }
                FadeInLeftBigAnimator::class.java.simpleName -> {
                    FadeInLeftBigAnimator(view, animationParams)
                }
                FadeInRightAnimator::class.java.simpleName -> {
                    FadeInRightAnimator(view, animationParams)
                }
                FadeInRightBigAnimator::class.java.simpleName -> {
                    FadeInRightBigAnimator(view, animationParams)
                }
                FadeInUpAnimator::class.java.simpleName -> {
                    FadeInUpAnimator(view, animationParams)
                }
                FadeInUpBigAnimator::class.java.simpleName -> {
                    FadeInUpBigAnimator(view, animationParams)
                }

                //fade out
                FadeOutAnimator::class.java.simpleName -> {
                    FadeOutAnimator(view, animationParams)
                }
                FadeOutDownAnimator::class.java.simpleName -> {
                    FadeOutDownAnimator(view, animationParams)
                }
                FadeOutDownBigAnimator::class.java.simpleName ->{
                    FadeOutDownBigAnimator(view, animationParams)
                }
                FadeOutLeftAnimator::class.java.simpleName -> {
                    FadeOutLeftAnimator(view, animationParams)
                }
                FadeOutLeftBigAnimator::class.java.simpleName -> {
                    FadeOutLeftBigAnimator(view, animationParams)
                }
                FadeOutRightAnimator::class.java.simpleName -> {
                    FadeOutRightAnimator(view, animationParams)
                }
                FadeOutRightBigAnimator::class.java.simpleName -> {
                    FadeOutRightBigAnimator(view, animationParams)
                }
                FadeOutUpAnimator::class.java.simpleName -> {
                    FadeOutUpAnimator(view, animationParams)
                }
                FadeOutUpBigAnimator::class.java.simpleName -> {
                    FadeOutUpBigAnimator(view, animationParams)
                }

                //zoom
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
                //slider
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