package com.example.myapplication

import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.BaseAdapter
import android.widget.ImageView
import com.example.mainactivity.R

class ImageAdapter : BaseAdapter() {
    override fun getCount(): Int {
        return mThumbIds.size
    }

    override fun getItem(position: Int): Any {
        return mThumbIds[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val imageView: ImageView
        if (convertView == null) {
            imageView = ImageView(parent!!.context)
            imageView.layoutParams = AbsListView.LayoutParams(200, 200)
            imageView.scaleType = ImageView.ScaleType.CENTER_CROP
            imageView.setPadding(8, 8, 8, 8)
        } else {
            imageView = convertView as ImageView
        }
        imageView.setImageResource(mThumbIds.get(position))
        return imageView
    }

    private val mThumbIds = arrayOf<Int>(
        R.drawable.ast, R.drawable.beachboy,
        R.drawable.beer, R.drawable.desk,
        R.drawable.dj, R.drawable.dino,
        R.drawable.run, R.drawable.snowman,
        R.drawable.sittingdown, R.drawable.santacostum,
        R.drawable.rose, R.drawable.me,
        R.drawable.lgbtq, R.drawable.jump,
        R.drawable.ic_member_test, R.drawable.heart,
        R.drawable.kingsejong, R.drawable.ragemode
    )
}