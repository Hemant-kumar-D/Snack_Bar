package com.example.snack_bar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import android.widget.Toast
import com.example.snack_bar.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import java.util.Objects

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.snacbarBtn.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
       val snack= Snackbar.make(binding.root,"hello SnackBar",Snackbar.LENGTH_LONG)
            .setAction("Retry",object :View.OnClickListener{
                override fun onClick(p0: View?) {
                    Toast.makeText(this@MainActivity, "check snack bar", Toast.LENGTH_SHORT).show()
                }

            })
//               val v=snack.view
//                       val params=v.layoutParams as FrameLayout
//                       v.setBackgroundColor(resources.getColor(R.color.purple_200))
//        params.foregroundGravity=Gravity.TOP
//
//            snack.show()
           .show()



    }
}