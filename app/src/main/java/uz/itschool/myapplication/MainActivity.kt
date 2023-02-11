package uz.itschool.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var images:MutableList<ImageView> = mutableListOf()
    var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        images.add(img1)
        images.add(img2)
        images.add(img3)
        images.add(img4)
        images.add(img5)
        images.add(img6)
        images.add(img7)
        images.add(img8)
        images.add(img9)

        img1.setOnClickListener(this)
        img2.setOnClickListener(this)
        img3.setOnClickListener(this)
        img4.setOnClickListener(this)
        img5.setOnClickListener(this)
        img6.setOnClickListener(this)
        img7.setOnClickListener(this)
        img8.setOnClickListener(this)
        img9.setOnClickListener(this)

        next.setOnClickListener {
            if (index < images.size - 1) {
                index++
            } else {
                index = 0
            }
            img.setImageResource(images[index])
        }

        previous.setOnClickListener {
            if (index == 0){
                index = images.size
            }
            index--
            img.setImageResource(images[index])
        }

    }

    @SuppressLint("ResourceType")
    override fun onClick(p0: View?) {
        val img = findViewById<ImageView>(p0!!.id)
        val tag = img.tag.toString().toInt()
        image_layout.visibility = View.GONE
        action_layout.visibility = View.VISIBLE
        img.setImageResource(images[tag])

    }
}


