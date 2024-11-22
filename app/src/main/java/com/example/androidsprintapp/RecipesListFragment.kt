package com.example.androidsprintapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class RecipesListFragment: Fragment() {

    companion object {
        private const val ARG_CATEGORY_ID = "category_id"

        fun newInstance(categoryId: String): RecipesListFragment {
            val fragment = RecipesListFragment()
            val args = Bundle()
            args.putString(ARG_CATEGORY_ID, categoryId)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val categoryId = arguments?.getString(ARG_CATEGORY_ID)
        return inflater.inflate(R.layout.fragment_recipes_list, container, false)
    }
}