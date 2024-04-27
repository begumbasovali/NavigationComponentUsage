package com.example.navigationcompusage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationcompusage.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {

    private lateinit var binding:FragmentDetailBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)

        binding.textViewNote.text = "Welcome"

        return binding.root
    }


}