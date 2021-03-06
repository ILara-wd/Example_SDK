# Tooltips

Simple to use library for android, Enabling to add a tooltip near any view with ease


[![](https://jitpack.io/v/ILara-wd/Example_SDK.svg)](https://jitpack.io/#ILara-wd/Example_SDK)

## Installation

Add it in your root build.gradle at the end of repositories:

```bash
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Add the dependency
```bash
	dependencies {
	        implementation 'com.github.ILara-wd:Example_SDK:Tag'
	}
```

## Usage

```kotlin
        val tvTitleToolTip :TextView = findViewById(R.id.tvTitleToolTip)
        val display = this.windowManager.defaultDisplay
        val size = Point()
        display.getSize(size)
        val width = size.x

        tvTitleToolTip.setOnClickListener {
                val tooltip = SimpleTooltip.Builder(this)
                    .anchorView(it)
                    .text( getString(R.string.text_lorem) )
                    .gravity(Gravity.TOP)
                    .modal(true)
                    .setWidth(width)
                    .contentView(R.layout.tooltip_custom, R.id.tv_text)
                    .focusable(true)
                    .build()

                tooltip.show()
            }
```


### License
```
Copyright 2016 Tomer Goldstein

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
