package com.example.a410621209hw1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.a410621209hw1.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private  lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.add.setOnClickListener(){
            add(it)
        }
        binding.sub.setOnClickListener(){
            sub(it)
        }
        binding.mul.setOnClickListener(){
            mul(it)
        }
        binding.dev.setOnClickListener(){
            dev(it)
        }
    }
    private fun add(view: View){
        //c = (f-32)*5/9

        var num1 = binding.enterNum1.text.toString()
        var num2 = binding.enternum2.text.toString()
        var num_1 = num1.toFloat()
        var num_2 = num2.toFloat()
        var con = num_1 + num_2


        var ans = con.toString()
        binding.ANS.text = ans

        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken,0)
    }
    private fun sub(view: View){
        //c = (f-32)*5/9

        var num1 = binding.enterNum1.text.toString()
        var num2 = binding.enternum2.text.toString()
        var num_1 = num1.toFloat()
        var num_2 = num2.toFloat()
        var con = num_1 - num_2

        var ans = con.toString()
        binding.ANS.text = ans

        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken,0)
    }
    private fun mul(view: View){
        //c = (f-32)*5/9

        var num1 = binding.enterNum1.text.toString()
        var num2 = binding.enternum2.text.toString()
        var num_1 = num1.toFloat()
        var num_2 = num2.toFloat()
        var con = num_1 * num_2

        var ans = con.toString()
        binding.ANS.text = ans

        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken,0)
    }
    private fun dev(view: View){
        //c = (f-32)*5/9

        var num1 = binding.enterNum1.text.toString()
        var num2 = binding.enternum2.text.toString()
        var num_1 = num1.toFloat()
        var num_2 = num2.toFloat()
        var con = num_1 / num_2

        var ans = con.toString()
        binding.ANS.text = ans

        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken,0)
    }


}