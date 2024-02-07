package com.anon15683.haushaltsliste.fragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.anon15683.haushaltsliste.R

class SplashFragment : Fragment() {
    private lateinit var navControl: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_spash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init(view)

        Handler(Looper.myLooper()!!).postDelayed(kotlinx.coroutines.Runnable {
            navControl.navigate(R.id.action_splashFragment_to_homeFragment)
        }, 2000)
    }
    private fun init(view: View) {
        navControl = Navigation.findNavController(view)
    }
}