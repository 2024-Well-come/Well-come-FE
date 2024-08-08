package com.example.wellcome.travel_plan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.wellcome.databinding.FragmentTravelBinding

class TravelFragment : Fragment() {

    lateinit var binding: FragmentTravelBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTravelBinding.inflate(inflater, container, false)
        return binding.root
    }
}