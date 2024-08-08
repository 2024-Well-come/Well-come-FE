package com.example.wellcome

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.wellcome.community.CommunityFragment
import com.example.wellcome.databinding.ActivityMainBinding
import com.example.wellcome.main.MainFragment
import com.example.wellcome.travel_plan.TravelFragment


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //바인딩 객체 획득
        val binding = ActivityMainBinding.inflate(layoutInflater)
        //액티비티 화면 출력
        setContentView(binding.root)

        binding.bottomNavigation.selectedItemId = R.id.tab1
        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.tab1 -> {
                    supportFragmentManager.beginTransaction().replace(R.id.container,
                        MainFragment()
                    ).commit()
                    true
                }
                R.id.tab2 -> {
                    supportFragmentManager.beginTransaction().replace(R.id.container, CommunityFragment()).commit()
                    true
                }
                R.id.tab3 -> {
                    supportFragmentManager.beginTransaction().replace(R.id.container, TravelFragment()).commit()
                    true
                }
                else -> false
            }
        }


    }
}

