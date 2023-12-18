package com.example.uitest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.uitest.databinding.CourseTopicsItemBinding
import com.example.uitest.databinding.CoursesItemBinding

class CoursesAdapter(private val courses : List<String>) : RecyclerView.Adapter<CoursesAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding :CoursesItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context), R.layout.courses_item, parent, false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
            return courses.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {



    }



    class ViewHolder(private val binding: CoursesItemBinding) : RecyclerView.ViewHolder(binding.root)


}