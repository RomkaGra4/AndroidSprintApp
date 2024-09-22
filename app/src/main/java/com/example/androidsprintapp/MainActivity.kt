package com.example.androidsprintapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.androidsprintapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val categoriesButton = findViewById<Button>(R.id.categories_button)
        val favoriteButton = findViewById<Button>(R.id.favorite_button)

        categoriesButton.setOnClickListener {
            supportFragmentManager.commit {
                replace<CategoriesListFragment>(R.id.categories_button)
                setReorderingAllowed(true)
                addToBackStack("")
            }
        }

        favoriteButton.setOnClickListener {
            supportFragmentManager.commit {
                replace<FavoritesFragment>(R.id.favorite_button)
                setReorderingAllowed(true)
                addToBackStack("")
            }
        }

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<CategoriesListFragment>(R.id.mainContainer)
        }
    }
}