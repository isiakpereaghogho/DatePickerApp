package com.example.datepickerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.DatePickerDialog
import android.app.DatePickerDialog.OnDateSetListener
import android.icu.util.Calendar
import android.view.View
import android.widget.Button




class MainActivity : AppCompatActivity(), View.OnClickListener {
    var btnDatePicker: Button? = null
    private var mYear = 0
    private var mMonth = 0
    private var mDay = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnDatePicker = findViewById<View>(R.id.imageButton);
         = findViewById<View>(R.id.in_date);
        btnDatePicker!!.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v === btnDatePicker) {

            // Get Current Date
            val c = Calendar.getInstance()
            mYear = c[Calendar.YEAR]
            mMonth = c[Calendar.MONTH]
            mDay = c[Calendar.DAY_OF_MONTH]
            val datePickerDialog = DatePickerDialog(this,
                { view, year, monthOfYear, dayOfMonth -> txtDate!!.setText(dayOfMonth.toString() + "-" + (monthOfYear + 1) + "-" + year) },
                mYear,
                mMonth,
                mDay
            )
            datePickerDialog.show()
        }

    }
}