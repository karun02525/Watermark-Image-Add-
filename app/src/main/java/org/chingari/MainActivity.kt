package org.chingari

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myLogo = BitmapFactory.decodeResource(this.resources, R.drawable.pic)

        img.setImageBitmap(myLogo)

        imgCon.setImageBitmap(addWatermark(myLogo,"karun Kumar"))
    }
}