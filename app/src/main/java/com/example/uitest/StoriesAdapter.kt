package com.example.uitest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.uitest.databinding.StoryItemBinding

class StoriesAdapter(private var stories : ArrayList<Int>) : RecyclerView.Adapter<StoriesAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding :StoryItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context), R.layout.story_item, parent, false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
            return stories.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.imageView4.setImageResource(stories[position])
    }



    class ViewHolder(val binding: StoryItemBinding) : RecyclerView.ViewHolder(binding.root)


}