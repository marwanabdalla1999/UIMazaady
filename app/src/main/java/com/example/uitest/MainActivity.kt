package com.example.uitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uitest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val stories:ArrayList<Int> = ArrayList()

        stories.add(R.drawable.ava1)
        stories.add(R.drawable.ava2)
        stories.add(R.drawable.ava4)
        stories.add(R.drawable.ava1)
        stories.add(R.drawable.ava2)
        stories.add(R.drawable.ava4)

        val storiesAdapter= StoriesAdapter(stories)
        binding.stories.adapter=storiesAdapter

        val courses:ArrayList<String> = ArrayList()

        courses.add("All")
        courses.add("UI/UX")
        courses.add("Illustration")
        courses.add("3D Animation")
        courses.add("Gaming Dev")
        courses.add("Android Dev")
        courses.add("Ios Dev")
        val coursesTopicsAdapter=CoursesTopicsAdapter(courses)
        binding.coursesTopics.adapter=coursesTopicsAdapter

       val coursesAdapter = CoursesAdapter(courses)
        binding.carouselRecyclerview.adapter = coursesAdapter
        binding.carouselRecyclerview.apply {
            set3DItem(false)
            setAlpha(true)
            setInfinite(false)


        }






    }
}