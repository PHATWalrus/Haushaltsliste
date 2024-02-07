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
import com.anon15683.haushaltsliste.databinding.FragmentPurchasesBinding
import com.google.firebase.Firebase
import com.google.firebase.database.FirebaseDatabase

class PurchasesFragment : Fragment() {

    private lateinit var navControl: NavController
    private lateinit var binding: FragmentPurchasesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //inflate the layout for this fragment

        binding = FragmentPurchasesBinding.inflate(inflater , container , false)
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
        binding.btnAdd.setOnClickListener {
            val Einkauf = binding.categorie.text.toString().trim()
            val Preis = binding.price.text.toString().trim()
            if (Einkauf.isNotEmpty() && Preis.isNotEmpty()) {

            }
        }

        binding.btnCancel.setOnClickListener {
            if (binding.btnAdd.visibility == View.GONE) {
                binding.btnAdd.visibility = View.VISIBLE
                binding.card1.visibility = View.VISIBLE
                binding.card2.visibility = View.VISIBLE
                binding.btnCancel.animate().rotation(45F).setDuration(5000).start()
            }
            else {
                binding.btnAdd.visibility = View.GONE
                binding.card1.visibility = View.GONE
                binding.card2.visibility = View.GONE
            }
        }
    }
}