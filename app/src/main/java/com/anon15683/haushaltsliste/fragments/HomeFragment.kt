package com.anon15683.haushaltsliste.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.FragmentContainer
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.anon15683.haushaltsliste.R
import com.anon15683.haushaltsliste.databinding.FragmentHomeBinding
import com.google.firebase.Firebase
import com.google.firebase.database.FirebaseDatabase

class HomeFragment : Fragment() {

    private lateinit var navControl: NavController
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //inflate the layout for this fragment

        binding = FragmentHomeBinding.inflate(inflater , container , false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init(view)
        main(view)
    }

    private fun init(view:View) {
        navControl = Navigation.findNavController(view)
    }

    private fun main(view: View) {
        binding.btnLebensmittel.setOnClickListener {
            navControl.navigate(R.id.action_homeFragment_to_purchasesFragment)
        }
        binding.btnFreizeit.setOnClickListener {
            navControl.navigate(R.id.action_homeFragment_to_purchasesFragment)
        }
        binding.btnKlammotten.setOnClickListener {
            navControl.navigate(R.id.action_homeFragment_to_purchasesFragment)
        }
        binding.btnDiverses.setOnClickListener {
            navControl.navigate(R.id.action_homeFragment_to_purchasesFragment)
        }
    }
}