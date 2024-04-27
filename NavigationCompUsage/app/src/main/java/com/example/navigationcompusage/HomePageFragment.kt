package com.example.navigationcompusage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationcompusage.databinding.FragmentHomePageBinding
import com.google.android.material.snackbar.Snackbar


class HomePageFragment : Fragment() {
    private lateinit var binding: FragmentHomePageBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomePageBinding.inflate(inflater, container, false)

        //Your code
        binding.buttonDetail.setOnClickListener{
            Snackbar.make(it, "Hello", Snackbar.LENGTH_SHORT).show()
            binding.textView.text = "How are you?"
        }

        return binding.root
    }


}