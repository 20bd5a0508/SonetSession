package com.example.sonetprojectsession

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import com.example.sonetprojectsession.Fragment.Fragment_List
import com.example.sonetprojectsession.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


       val fm= supportFragmentManager
        val ft=fm.beginTransaction()
        ft.replace(R.id.fragmet,Fragment_List())
        ft.commit()
    }
}