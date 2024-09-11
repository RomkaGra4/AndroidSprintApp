package com.example.androidsprintapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidsprintapp.databinding.FragmentListCategoriesBinding

class CategoriesListFragment : Fragment() {

    private var binding: FragmentListCategoriesBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListCategoriesBinding.inflate(inflater, container, false)
        return binding!!.root
    }
}