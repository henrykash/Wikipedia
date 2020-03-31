package com.example.wikipedia

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.wikipedia.R
import fragments.ExploreFragment
import fragments.FavoriteFragment
import fragments.HistoryFragment

class MainActivity : AppCompatActivity() {

    private val exploreFragment : ExploreFragment
    private val favoriteFragment : FavoriteFragment
    private val historyFragment : HistoryFragment

    init {
        exploreFragment = ExploreFragment()
        favoriteFragment = FavoriteFragment()
        historyFragment = HistoryFragment()
    }
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->

        val transaction = supportFragmentManager.beginTransaction()
        transaction.setCustomAnimation(android.R.anim.fade_in,android.R.anim.fade_out)

        when(item.itemId){
            R.id.navigation_explore -> transaction.replace(R.id.fragment_container,exploreFragment)
            R.id.navigation_favorite -> transaction.replace(R.id.fragment_container,favoriteFragment)
            R.id.navigation_history -> transaction.replace(R.id.fragment_container,historyFragment)
        }
        transaction.commit()

        true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        selectContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment_container, exploreFragment)
        transaction.commit()


    }
}
