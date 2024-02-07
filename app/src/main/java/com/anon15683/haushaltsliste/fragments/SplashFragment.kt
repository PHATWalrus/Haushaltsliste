package com.anon15683.haushaltsliste.fragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import com.anon15683.haushaltsliste.R
import com.anon15683.haushaltsliste.databinding.FragmentPurchasesBinding

class SplashFragment : Fragment() {
    private lateinit var navControl: NavController
    private lateinit var binding: FragmentPurchasesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //inflate the layout for this fragment

        binding = FragmentPurchasesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Handler(Looper.myLooper()!!).postDelayed(kotlinx.coroutines.Runnable {
            navControl.navigate(R.id.action_splashFragment_to_homeFragment)
        }, 2000)
    }
}