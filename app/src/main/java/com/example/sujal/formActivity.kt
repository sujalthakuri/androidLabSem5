package com.example.sujal

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class formActivity : AppCompatActivity() {
    private lateinit var etName : EditText
    private lateinit var etAddress : EditText
    private lateinit var etMobile : EditText
    private lateinit var rMale : RadioButton
    private lateinit var rFemale : RadioButton
    private lateinit var btnSumit : Button
    var gender : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)
        retrieveValues()
        rMale.setOnClickListener{
            gender = "male"
        }

        rFemale.setOnClickListener{
            gender = "female"
        }

        btnSumit.setOnClickListener{
            Toast.makeText(this,"$gender",Toast.LENGTH_SHORT).show()

        }



    }

    private fun retrieveValues()
    {
        etName = findViewById(R.id.etName)
        etAddress = findViewById(R.id.etAddress)
        etMobile = findViewById(R.id.etMobile)
        rMale = findViewById(R.id.rMale)
        rFemale = findViewById(R.id.rFemale)
        btnSumit = findViewById(R.id.btnSubmit)
    }
}
