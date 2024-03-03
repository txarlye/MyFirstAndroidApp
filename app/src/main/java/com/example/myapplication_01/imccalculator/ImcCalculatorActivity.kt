package com.example.myapplication_01.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.example.myapplication_01.R
import com.google.android.material.slider.RangeSlider
import java.text.DecimalFormat

class ImcCalculatorActivity : AppCompatActivity() {


    private lateinit var viewMale:CardView
    private lateinit var viewFemale:CardView

    private var isMaleSelected:Boolean = true
    private var isFemaleSelected:Boolean = false
    private lateinit var tvHeight:TextView
    private lateinit var rsHeight:RangeSlider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_calculator)
        iniciaComponentes()
        iniciaListeners()
        initUI()
    }

    private fun initUI() {
       setGenderColor()
    }


    private fun iniciaComponentes() {
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)
        tvHeight = findViewById(R.id.textViewHeight)
        rsHeight = findViewById(R.id.rs_height)
    }
    private fun iniciaListeners() {
        viewMale.setOnClickListener{
            changeGender()
            setGenderColor()
        }
        viewFemale.setOnClickListener{
            changeGender()
            setGenderColor()
        }
        rsHeight.addOnChangeListener { _, value, _ ->
            val df = DecimalFormat("#.##")
            val result = df.format(value)
            tvHeight.text="$result cm"
        }
    }

    private fun changeGender(){
        isMaleSelected = !isMaleSelected
        isFemaleSelected = !isFemaleSelected
    }


    private fun setGenderColor(){
        viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))
        viewFemale.setCardBackgroundColor(getBackgroundColor(isFemaleSelected))
    }
private fun getBackgroundColor(isSelectedComponent: Boolean): Int {
    val colorReference = if(isSelectedComponent){
        R.color.Background_comnponent_selected
    }else{
        R.color.Background_component
    }
    return ContextCompat.getColor(this, colorReference)
}
}