package com.example.navigationcompusage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.navigationcompusage.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {

    private lateinit var binding:FragmentDetailBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)

        val bundle:DetailFragmentArgs by navArgs()

        val transferredName = bundle.name
        val transferredAge = bundle.age
        val transferredHeight = bundle.height
        val transferredStudent = bundle.student
        val productId = bundle.product.id
        val productName = bundle.product.name


        binding.textViewNote.text = "$transferredName - $transferredAge - $transferredHeight - $transferredStudent - $productId - $productName"

        return binding.root
    }


}