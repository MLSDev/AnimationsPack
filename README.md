# AnimationsPack

Another implementation of animations inspired by [animate.css](https://github.com/daneden/animate.css) and [AndroidAnimations](https://github.com/daimajia/AndroidViewAnimations)

## Setup
To use this library your ` minSdkVersion` must be >= 16.

In your build.gradle :
```gradle
dependencies {
    implementation 'com.mlsdev.androidanimations.library:library:1.0.1'
}
```

## Example
```kotlin
val animationParams = AnimationParams(
            repeatTimes = 0,
            duration = 1000L
)
//animationName is one of AnimationUtils.animationNames
val animation  = AnimationUtils.getAnimation(animationName, targetView, animationParams)
animation.start()
```

## Authors
* [Slava Fir][github-fir], MLSDev 

## License
AnimationsPack is released under the MIT license. See LICENSE for details.

## About MLSDev

[<img src="https://raw.githubusercontent.com/MLSDev/development-standards/master/mlsdev-logo.png" alt="MLSDev.com">][mlsdev]

[AnimationsPack](https://github.com/MLSDev/AnimationsPack) is maintained by MLSDev, Inc. We specialize in providing all-in-one solution in mobile and web development. Our team follows Lean principles and works according to agile methodologies to deliver the best results reducing the budget for development and its timeline. 

Find out more [here][mlsdev] and don't hesitate to [contact us][contact]!

[mlsdev]: https://mlsdev.com
[contact]: https://mlsdev.com/contact-us
[github-fir]: https://github.com/SlavaFir
