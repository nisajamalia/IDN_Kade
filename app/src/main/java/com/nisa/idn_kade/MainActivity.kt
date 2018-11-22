package com.nisa.idn_kade

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.nisa.idn_kade.R.array.*
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {
    private var items: MutableList<FootballItem> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //unutuk list view dan memanggil list
        rv_footballclub.layoutManager = LinearLayoutManager(this)
        rv_footballclub.adapter = FootballAdapter(this, items){itemClicked(it)}

        initData()


    }

    private fun itemClicked(items: FootballItem) {
        //buat start tapi bukan yg intent
        startActivity<DetailActivity>(DetailActivity.TITLE to items.name, DetailActivity.IMAGE to items.image,
                DetailActivity.DESCRIPTION to items.description)

    }

    private fun initData() {
        //manggil yg dari string
        val name = resources.getStringArray(club_name)
        val image = resources.obtainTypedArray(club_image)
        val description = resources.getStringArray(club_description)
        items.clear()
        for (i in name.indices){
            items.add(FootballItem(name[i],
            image.getResourceId(i, 0), description[i]))
        }


    }
}
