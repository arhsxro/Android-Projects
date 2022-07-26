package com.arhsxro.recordkeeper

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.arhsxro.recordkeeper.databinding.FragmentCyclingBinding
import com.arhsxro.recordkeeper.databinding.FragmentRunningBinding

class CyclingFragment: Fragment() {

    private lateinit var binding: FragmentCyclingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCyclingBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupClickListeners()
    }

    private fun setupClickListeners() {

        binding.containerLongestRide.setOnClickListener {
            lunchCyclingRecordScreen("Longest Ride")
        }
        binding.containerBiggestClimb.setOnClickListener {
            lunchCyclingRecordScreen("Biggest Climb")
        }
        binding.containerBestAverageSpeed.setOnClickListener {
            lunchCyclingRecordScreen("Best Average Speed")
        }

    }

    private fun lunchCyclingRecordScreen(temp: String) {

        val intent = Intent(context, EditCyclingRecordActivity::class.java)
        intent.putExtra("cycl", temp)
        startActivity(intent)

    }

}