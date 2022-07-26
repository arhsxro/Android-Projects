package com.arhsxro.recordkeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arhsxro.recordkeeper.databinding.ActivityEditCyclingRecordBinding
import com.arhsxro.recordkeeper.databinding.ActivityEditRunningRecordBinding

class EditCyclingRecordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditCyclingRecordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditCyclingRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val temp = intent.getStringExtra("cycl")
        title = " $temp Record "
    }
}