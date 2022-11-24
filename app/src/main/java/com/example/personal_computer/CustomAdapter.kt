package com.example.personal_computer

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class CustomAdapter(dataSet: ArrayList<dataModel>, context: Context) :
    ArrayAdapter<dataModel>(context,R.layout.activity_maket_list_view,dataSet),View.OnClickListener {
    private var mContext: Context

    private class ViewHolder {
        var img: ImageView? = null
        var txtName: TextView? = null
        var txtCena: TextView? = null
        var txtSpec: TextView? = null
    }

    override fun onClick(v: View) {
        val position = v.tag as Int
        val `object`: Any? = getItem(position)
        val dataModel = `object` as dataModel?
        when (v.id) {
            R.id.list -> {
            }
        }
    }

    private var lastPosition = -1

    init {
        mContext = context
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView: View? = convertView
        val dataModel = getItem(position)
        val viewHolder: ViewHolder
        val result: View?
        if (convertView == null) {
            viewHolder = ViewHolder()
            val inflater = LayoutInflater.from(context)
            convertView = inflater.inflate(R.layout.activity_maket_list_view, parent, false)
            viewHolder.txtName = convertView.findViewById(R.id.item_name)
            viewHolder.txtCena = convertView.findViewById(R.id.item_cena)
            viewHolder.txtSpec = convertView.findViewById(R.id.item_spec)
            viewHolder.img = convertView.findViewById<ImageView?>(R.id.item_photo) as ImageView
            result = convertView
            convertView.tag = viewHolder
        } else {
            viewHolder = convertView.tag as ViewHolder
            result = convertView
        }

        lastPosition = position
        viewHolder.txtName!!.text = dataModel!!.name
        viewHolder.txtCena!!.text = dataModel.cena
        viewHolder.txtSpec!!.text = dataModel.spec
        viewHolder.img?.setImageResource(dataModel.img)
        viewHolder.img?.tag = position
        return convertView!!
    }
}