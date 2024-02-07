package com.anon15683.haushaltsliste

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.anon15683.haushaltsliste.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
