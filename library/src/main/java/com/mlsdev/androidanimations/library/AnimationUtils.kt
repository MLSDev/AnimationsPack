package com.mlsdev.androidanimations.library

import android.view.View
import com.mlsdev.androidanimations.library.attentionseeker.*
import com.mlsdev.androidanimations.library.bounce.`in`.*
import com.mlsdev.androidanimations.library.bounce.out.*
import com.mlsdev.androidanimations.library.fade.`in`.*
import com.mlsdev.androidanimations.library.fade.out.*
import com.mlsdev.androidanimations.library.flipper.*
import com.mlsdev.androidanimations.library.rotate.`in`.*
import com.mlsdev.androidanimations.library.rotate.out.*
import com.mlsdev.androidanimations.library.slider.`in`.SlideInDownAnim
import com.mlsdev.androidanimations.library.slider.`in`.SlideInLeftAnim
import com.mlsdev.androidanimations.library.slider.`in`.SlideInRightAnim
import com.mlsdev.androidanimations.library.slider.`in`.SlideInUpAnim
import com.mlsdev.androidanimations.library.slider.out.SlideOutDownAnim
import com.mlsdev.androidanimations.library.slider.out.SlideOutLeftAnim
import com.mlsdev.androidanimations.library.slider.out.SlideOutRightAnim
import com.mlsdev.androidanimations.library.slider.out.SlideOutUpAnim
import com.mlsdev.androidanimations.library.special.HingeAnim
import com.mlsdev.androidanimations.library.special.JackInTheBoxAnim
import com.mlsdev.androidanimations.library.special.RollInAnim
import com.mlsdev.androidanimations.library.special.RollOutAnim
import com.mlsdev.androidanimations.library.zoom.`in`.*
import com.mlsdev.androidanimations.library.zoom.out.*
import java.lang.RuntimeException

class AnimationUtils {
    companion object {
        val animationNames = mutableListOf(
            BounceAnim::class.java.simpleName,
            FlashAnim::class.java.simpleName,
            PulseAnim::class.java.simpleName,
            RubberBandAnim::class.java.simpleName,
            ShakeAnim::class.java.simpleName,
            SwingAnim::class.java.simpleName,
            TadaAnim::class.java.simpleName,
            WobbleAnim::class.java.simpleName,
            HeartbeatAnim::class.java.simpleName,

            BounceInAnim::class.java.simpleName,
            BounceInDownAnim::class.java.simpleName,
            BounceInLeftAnim::class.java.simpleName,
            BounceInRightAnim::class.java.simpleName,
            BounceInUpAnim::class.java.simpleName,

            BounceOutAnim::class.java.simpleName,
            BounceOutDownAnim::class.java.simpleName,
            BounceOutLeftAnim::class.java.simpleName,
            BounceOutRightAnim::class.java.simpleName,
            BounceOutUpAnim::class.java.simpleName,

            FadeInAnim::class.java.simpleName,
            FadeInDownAnim::class.java.simpleName,
            FadeInDownBigAnim::class.java.simpleName,
            FadeInLeftAnim::class.java.simpleName,
            FadeInLeftBigAnim::class.java.simpleName,
            FadeInRightAnim::class.java.simpleName,
            FadeInRightBigAnim::class.java.simpleName,
            FadeInUpAnim::class.java.simpleName,
            FadeInUpBigAnim::class.java.simpleName,

            FadeOutAnim::class.java.simpleName,
            FadeOutDownAnim::class.java.simpleName,
            FadeOutDownBigAnim::class.java.simpleName,
            FadeOutLeftAnim::class.java.simpleName,
            FadeOutLeftBigAnim::class.java.simpleName,
            FadeOutRightAnim::class.java.simpleName,
            FadeOutRightBigAnim::class.java.simpleName,
            FadeOutUpAnim::class.java.simpleName,
            FadeOutUpBigAnim::class.java.simpleName,

            FlipAnim::class.java.simpleName,
            FlipInXAnim::class.java.simpleName,
            FlipInYAnim::class.java.simpleName,
            FlipOutXAnim::class.java.simpleName,
            FlipOutYAnim::class.java.simpleName,

            RotateInAnim::class.java.simpleName,
            RotateInDownLeftAnim::class.java.simpleName,
            RotateInDownRightAnim::class.java.simpleName,
            RotateInUpLeftAnim::class.java.simpleName,
            RotateInUpRightAnim::class.java.simpleName,
            RotateInScaleAnim::class.java.simpleName,

            RotateOutAnim::class.java.simpleName,
            RotateOutDownLeftAnim::class.java.simpleName,
            RotateOutDownRightAnim::class.java.simpleName,
            RotateOutUpLeftAnim::class.java.simpleName,
            RotateOutUpRightAnim::class.java.simpleName,
            RotateOutScaleAnim::class.java.simpleName,


            SlideInUpAnim::class.java.simpleName,
            SlideInDownAnim::class.java.simpleName,
            SlideInLeftAnim::class.java.simpleName,
            SlideInRightAnim::class.java.simpleName,

            SlideOutUpAnim::class.java.simpleName,
            SlideOutDownAnim::class.java.simpleName,
            SlideOutLeftAnim::class.java.simpleName,
            SlideOutRightAnim::class.java.simpleName,

            ZoomInAnim::class.java.simpleName,
            ZoomInDownAnim::class.java.simpleName,
            ZoomInLeftAnim::class.java.simpleName,
            ZoomInRightAnim::class.java.simpleName,
            ZoomInUpAnim::class.java.simpleName,
            ZoomOutAnim::class.java.simpleName,
            ZoomOutDownAnim::class.java.simpleName,
            ZoomOutLeftAnim::class.java.simpleName,
            ZoomOutRightAnim::class.java.simpleName,
            ZoomOutUpAnim::class.java.simpleName,

            HingeAnim::class.java.simpleName,
            JackInTheBoxAnim::class.java.simpleName,
            RollInAnim::class.java.simpleName,
            RollOutAnim::class.java.simpleName
        )

        fun getAnimation(
            name: String,
            view: View,
            animationParams: AnimationParams = AnimationParams()
        ): BaseViewAnim {
            return when (name) {
                //attention
                BounceAnim::class.java.simpleName -> {
                    BounceAnim(view, animationParams)
                }
                FlashAnim::class.java.simpleName -> {
                    FlashAnim(view, animationParams)
                }
                PulseAnim::class.java.simpleName -> {
                    PulseAnim(view, animationParams)
                }
                RubberBandAnim::class.java.simpleName -> {
                    RubberBandAnim(view, animationParams)
                }
                ShakeAnim::class.java.simpleName -> {
                    ShakeAnim(view, animationParams)
                }
                SwingAnim::class.java.simpleName -> {
                    SwingAnim(view, animationParams)
                }
                TadaAnim::class.java.simpleName -> {
                    TadaAnim(view, animationParams)
                }
                WobbleAnim::class.java.simpleName -> {
                    WobbleAnim(view, animationParams)
                }
                HeartbeatAnim::class.java.simpleName -> {
                    HeartbeatAnim(view, animationParams)
                }

                //bounce in
                BounceInAnim::class.java.simpleName -> {
                    BounceInAnim(view, animationParams)
                }
                BounceInDownAnim::class.java.simpleName -> {
                    BounceInDownAnim(view, animationParams)
                }
                BounceInLeftAnim::class.java.simpleName -> {
                    BounceInLeftAnim(view, animationParams)
                }
                BounceInRightAnim::class.java.simpleName -> {
                    BounceInRightAnim(view, animationParams)
                }

                BounceInUpAnim::class.java.simpleName -> {
                    BounceInUpAnim(view, animationParams)
                }

                //bounce out
                BounceOutAnim::class.java.simpleName -> {
                    BounceOutAnim(view, animationParams)
                }
                BounceOutDownAnim::class.java.simpleName -> {
                    BounceOutDownAnim(view, animationParams)
                }
                BounceOutLeftAnim::class.java.simpleName -> {
                    BounceOutLeftAnim(view, animationParams)
                }
                BounceOutRightAnim::class.java.simpleName -> {
                    BounceOutRightAnim(view, animationParams)
                }
                BounceOutUpAnim::class.java.simpleName -> {
                    BounceOutUpAnim(view, animationParams)
                }

                //fade in
                FadeInAnim::class.java.simpleName -> {
                    FadeInAnim(view, animationParams)
                }
                FadeInDownAnim::class.java.simpleName -> {
                    FadeInDownAnim(view, animationParams)
                }
                FadeInDownBigAnim::class.java.simpleName -> {
                    FadeInDownBigAnim(view, animationParams)
                }
                FadeInLeftAnim::class.java.simpleName -> {
                    FadeInLeftAnim(view, animationParams)
                }
                FadeInLeftBigAnim::class.java.simpleName -> {
                    FadeInLeftBigAnim(view, animationParams)
                }
                FadeInRightAnim::class.java.simpleName -> {
                    FadeInRightAnim(view, animationParams)
                }
                FadeInRightBigAnim::class.java.simpleName -> {
                    FadeInRightBigAnim(view, animationParams)
                }
                FadeInUpAnim::class.java.simpleName -> {
                    FadeInUpAnim(view, animationParams)
                }
                FadeInUpBigAnim::class.java.simpleName -> {
                    FadeInUpBigAnim(view, animationParams)
                }

                //fade out
                FadeOutAnim::class.java.simpleName -> {
                    FadeOutAnim(view, animationParams)
                }
                FadeOutDownAnim::class.java.simpleName -> {
                    FadeOutDownAnim(view, animationParams)
                }
                FadeOutDownBigAnim::class.java.simpleName ->{
                    FadeOutDownBigAnim(view, animationParams)
                }
                FadeOutLeftAnim::class.java.simpleName -> {
                    FadeOutLeftAnim(view, animationParams)
                }
                FadeOutLeftBigAnim::class.java.simpleName -> {
                    FadeOutLeftBigAnim(view, animationParams)
                }
                FadeOutRightAnim::class.java.simpleName -> {
                    FadeOutRightAnim(view, animationParams)
                }
                FadeOutRightBigAnim::class.java.simpleName -> {
                    FadeOutRightBigAnim(view, animationParams)
                }
                FadeOutUpAnim::class.java.simpleName -> {
                    FadeOutUpAnim(view, animationParams)
                }
                FadeOutUpBigAnim::class.java.simpleName -> {
                    FadeOutUpBigAnim(view, animationParams)
                }

                //flippers
                FlipAnim::class.java.simpleName -> {
                    FlipAnim(view, animationParams)
                }
                FlipInXAnim::class.java.simpleName -> {
                    FlipInXAnim(view, animationParams)
                }
                FlipInYAnim::class.java.simpleName -> {
                    FlipInYAnim(view, animationParams)
                }
                FlipOutXAnim::class.java.simpleName -> {
                    FlipOutXAnim(view, animationParams)
                }
                FlipOutYAnim::class.java.simpleName -> {
                    FlipOutYAnim(view, animationParams)
                }

                //rotate
                RotateInAnim::class.java.simpleName -> {
                    RotateInAnim(view, animationParams)
                }
                RotateInDownLeftAnim::class.java.simpleName -> {
                    RotateInDownLeftAnim(view, animationParams)
                }
                RotateInDownRightAnim::class.java.simpleName -> {
                    RotateInDownRightAnim(view, animationParams)
                }
                RotateInUpLeftAnim::class.java.simpleName -> {
                    RotateInUpLeftAnim(view, animationParams)
                }
                RotateInUpRightAnim::class.java.simpleName -> {
                    RotateInUpRightAnim(view, animationParams)
                }
                RotateOutAnim::class.java.simpleName -> {
                    RotateOutAnim(view, animationParams)
                }
                RotateOutDownLeftAnim::class.java.simpleName -> {
                    RotateOutDownLeftAnim(view, animationParams)
                }
                RotateOutDownRightAnim::class.java.simpleName -> {
                    RotateOutDownRightAnim(view, animationParams)
                }
                RotateOutUpLeftAnim::class.java.simpleName -> {
                    RotateOutUpLeftAnim(view, animationParams)
                }
                RotateOutUpRightAnim::class.java.simpleName -> {
                    RotateOutUpRightAnim(view, animationParams)
                }
                RotateInScaleAnim::class.java.simpleName -> {
                    RotateInScaleAnim(view, animationParams)
                }
                RotateOutScaleAnim::class.java.simpleName -> {
                    RotateOutScaleAnim(view, animationParams)
                }

                //special
                HingeAnim::class.java.simpleName -> {
                    HingeAnim(view, animationParams)
                }
                JackInTheBoxAnim::class.java.simpleName -> {
                    JackInTheBoxAnim(view, animationParams)
                }

                RollInAnim::class.java.simpleName -> {
                    RollInAnim(view, animationParams)
                }
                RollOutAnim::class.java.simpleName -> {
                    RollOutAnim(view, animationParams)
                }

                //zoom
                ZoomOutAnim::class.java.simpleName -> {
                    ZoomOutAnim(view, animationParams)
                }
                ZoomOutDownAnim::class.java.simpleName -> {
                    ZoomOutDownAnim(view, animationParams)
                }
                ZoomInAnim::class.java.simpleName -> {
                    ZoomInAnim(view, animationParams)
                }
                ZoomOutLeftAnim::class.java.simpleName -> {
                    ZoomOutLeftAnim(view, animationParams)
                }
                ZoomOutUpAnim::class.java.simpleName -> {
                    ZoomOutUpAnim(view, animationParams)
                }
                ZoomOutRightAnim::class.java.simpleName -> {
                    ZoomOutRightAnim(view, animationParams)
                }
                ZoomInDownAnim::class.java.simpleName -> {
                    ZoomInDownAnim(view, animationParams)
                }
                ZoomInLeftAnim::class.java.simpleName -> {
                    ZoomInLeftAnim(view, animationParams)
                }
                ZoomInRightAnim::class.java.simpleName -> {
                    ZoomInRightAnim(view, animationParams)
                }
                ZoomInUpAnim::class.java.simpleName -> {
                    ZoomInUpAnim(view, animationParams)
                }
                //slider
                SlideInDownAnim::class.java.simpleName -> {
                    SlideInDownAnim(view, animationParams)
                }
                SlideInLeftAnim::class.java.simpleName -> {
                    SlideInLeftAnim(view, animationParams)
                }
                SlideInRightAnim::class.java.simpleName -> {
                    SlideInRightAnim(view, animationParams)
                }
                SlideInUpAnim::class.java.simpleName -> {
                    SlideInUpAnim(view, animationParams)
                }
                SlideOutDownAnim::class.java.simpleName -> {
                    SlideOutDownAnim(view, animationParams)
                }
                SlideOutLeftAnim::class.java.simpleName -> {
                    SlideOutLeftAnim(view, animationParams)
                }
                SlideOutRightAnim::class.java.simpleName -> {
                    SlideOutRightAnim(view, animationParams)
                }
                SlideOutUpAnim::class.java.simpleName -> {
                    SlideOutUpAnim(view, animationParams)
                }
                else -> {
                    throw RuntimeException("Unknown animation name")
                }
            }
        }
    }
}