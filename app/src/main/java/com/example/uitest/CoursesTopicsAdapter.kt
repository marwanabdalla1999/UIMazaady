package com.example.uitest

import android.graphics.Color
import android.provider.CalendarContract.Colors
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.uitest.databinding.CourseTopicsItemBinding

class CoursesTopicsAdapter(private val courses : List<String>) : RecyclerView.Adapter<CoursesTopicsAdapter.ViewHolder>() {

    private var selectedItem:ViewHolder?=null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding :CourseTopicsItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context), R.layout.course_topics_item, parent, false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
            return courses.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
                holder.binding.imageView4.text=courses[position]
        holder.itemView.setOnClickListener {
                if (selectedItem!=null) {

                    selectedItem!!.binding.cardView.setCardBackgroundColor(Color.rgb(246,247,250))
                    selectedItem!!.binding.imageView4.setTextColor(Color.rgb(157,159,160))

                }
            holder.binding.cardView.setCardBackgroundColor(Color.rgb(236,95,95))
            holder.binding.imageView4.setTextColor(Color.WHITE)

            selectedItem=holder


        }


    }



    class ViewHolder(val binding: CourseTopicsItemBinding) : RecyclerView.ViewHolder(binding.root){

    }


}