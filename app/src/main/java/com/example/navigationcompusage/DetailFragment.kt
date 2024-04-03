package com.example.navigationcompusage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.navigationcompusage.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailBinding.inflate(inflater, container, false)

        val bundle: DetailFragmentArgs by navArgs()


        val getName = bundle.name
        val getAge = bundle.age
        val getHeight = bundle.height
        val getGender = bundle.gender

        val productId = bundle.product.id
        val productName = bundle.product.name

        binding.textViewNote.text = "$getName -$getAge - $getHeight - $getGender"

        binding.textViewNote.text = "Hello"

        return binding.root
    }



}