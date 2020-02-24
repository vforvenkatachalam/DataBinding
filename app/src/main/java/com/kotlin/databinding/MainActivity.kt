package com.kotlin.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.kotlin.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    val myname:MyName = MyName("venkatachalam")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.myName = myname
        binding.button.setOnClickListener { onClicked(it) }
    }

    private fun onClicked(it: View?) {
        binding.apply {
            myName?.nickname=nicknameEdittext.text.toString()
            nicknameEdittext.visibility = View.GONE
            invalidateAll()
            button.visibility = View.GONE
            nicknameTview.visibility = View.VISIBLE
        }
    }
}
