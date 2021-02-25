package com.warriorsdev.android.example_sdk

import android.graphics.Point
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import com.warriorsdev.android.components.tooltip.SimpleTooltip

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

    }
}