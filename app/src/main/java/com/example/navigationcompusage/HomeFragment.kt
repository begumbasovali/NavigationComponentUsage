package com.example.navigationcompusage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcompusage.databinding.FragmentHomeBinding
import com.google.android.material.snackbar.Snackbar


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding =  FragmentHomeBinding.inflate(inflater, container, false)

        binding.buttonDetail.setOnClickListener{
            //Snackbar.make(it, "Hello",Snackbar.LENGTH_SHORT).show()
            //binding.textView.text = "How are you?"

           val product = Products(100, "TV")
            val switch = HomeFragmentDirections.switchToDetail(product= product, name = "Begum",
                 age= 22, height = 1.57f, gender = "Female")

            Navigation.findNavController(it).navigate(R.id.switchToDetail)
            //id is worked with button and page transition occured via same activity
        }
        return binding.root
    }



}