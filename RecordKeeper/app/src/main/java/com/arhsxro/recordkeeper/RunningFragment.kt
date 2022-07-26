package com.arhsxro.recordkeeper

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.arhsxro.recordkeeper.databinding.FragmentRunningBinding

class RunningFragment : Fragment() {

    private lateinit var binding: FragmentRunningBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRunningBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupClickListeners()
    }

    private fun setupClickListeners() {

        binding.container5km.setOnClickListener {
            lunchRunningRecordScreen("5km")
        }
        binding.container10km.setOnClickListener {
            lunchRunningRecordScreen("10km")
        }
        binding.containerHalfMarathon.setOnClickListener {
            lunchRunningRecordScreen("Half Marathon")
        }
        binding.containerMarathon.setOnClickListener {
            lunchRunningRecordScreen("Marathon")
        }

    }

    private fun lunchRunningRecordScreen(distance:String) {

        val intent = Intent(context, EditRunningRecordActivity::class.java)
        intent.putExtra("Distance", distance)
        startActivity(intent)

    }

}