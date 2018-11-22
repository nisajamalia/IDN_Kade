package com.nisa.idn_kade

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import org.jetbrains.anko.*

class DetailActivity : AppCompatActivity() {
    companion object {
        const val DESCRIPTION ="descriptions"
        const val TITLE = "title"
        const val IMAGE = "image"
    }

    private var title : String = ""
    private  var logo : Int = 0
    private var description : String = ""

    lateinit var titleTextView : TextView
    lateinit var logoImageView : ImageView
    lateinit var descriptionTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        verticalLayout {
            padding = dip(15)
            logoImageView = imageView().lparams(width = dip(110), height = wrapContent) {
                gravity = Gravity.CENTER
                bottomMargin = dip(10)
            }
            titleTextView = textView().lparams(width = wrapContent) {
                gravity = Gravity.CENTER
                bottomMargin = dip(10)
            }
            descriptionTextView = textView().lparams(width = wrapContent) {
                gravity = Gravity.CENTER
                rightMargin = dip(20)
                leftMargin = dip(20)
            }
        }
        logo = intent.getIntExtra(IMAGE, 0)
        title = intent.getStringExtra(TITLE)
        description = intent.getStringExtra(DESCRIPTION)

        Glide.with(logoImageView).load(logo).into(logoImageView)
        titleTextView.text = title
        descriptionTextView.text = description
    }
}
