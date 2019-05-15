package com.mlsdev.androidanimations.library.attentionseeker

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnim

class HeartbeatAnim(view: View, animationParams: AnimationParams = AnimationParams()) :  BaseViewAnim(view, animationParams) {
    override fun prepare(target: View, animatorSet: AnimatorSet) {
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(target, "scaleX", 1.0f, 1.3f, 1.0f, 1.3f, 1.0f),
            ObjectAnimator.ofFloat(target, "scaleY", 1.0f, 1.3f, 1.0f, 1.3f, 1.0f)
        )
    }
}