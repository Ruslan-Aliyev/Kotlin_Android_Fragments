package com.example.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Fragment2 : Fragment() {

    private var vFragment2: View? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        vFragment2 = inflater.inflate(R.layout.fragment2, container, false)

        return vFragment2
    }
}