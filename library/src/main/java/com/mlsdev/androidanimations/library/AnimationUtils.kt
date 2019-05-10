package com.mlsdev.androidanimations.library

import android.view.View
import com.mlsdev.androidanimations.library.zoom.`in`.*
import com.mlsdev.androidanimations.library.zoom.out.*
import java.lang.RuntimeException

class AnimationUtils {
    companion object {
        val animationNames = mutableListOf(
            ZoomOutAnimator::class.java.simpleName,
            ZoomOutDownAnimator::class.java.simpleName,
            ZoomInAnimator::class.java.simpleName,
            ZoomOutLeftAnimator::class.java.simpleName,
            ZoomOutUpAnimator::class.java.simpleName,
            ZoomOutRightAnimator::class.java.simpleName,
            ZoomInDownAnimator::class.java.simpleName,
            ZoomInLeftAnimator::class.java.simpleName,
            ZoomInRightAnimator::class.java.simpleName,
            ZoomInUpAnimator::class.java.simpleName
        )

        fun getAnimation(
            name: String,
            view: View,
            animationParams: AnimationParams = AnimationParams()
        ): BaseViewAnimator {
            return when (name) {
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
                else -> {
                    throw RuntimeException("Unknown animation name")
                }
            }
        }
    }
}