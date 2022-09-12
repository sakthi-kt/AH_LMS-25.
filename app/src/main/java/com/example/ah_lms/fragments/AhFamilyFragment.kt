package com.example.ah_lms.fragments

import  android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ah_lms.R
import com.example.ah_lms.adapter.AhFamilyAdapter
import com.example.ah_lms.dataclass.ahFamily
import com.example.ah_lms.dataclass.myLeave

class AhFamilyFragment : Fragment() {
    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newFamilyList: ArrayList<ahFamily>
    lateinit var name:Array<String>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?, ): View? {
        val view = inflater.inflate(R.layout.fragment_ah_family, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        name = arrayOf(
            "Management",
            "HRD",
            "Finance",
            "Ar&Ap",
            "Sales",
            "PMO",
            ".Net",
            "UI",
            "Java",
            "Node",
            "QA",
            "Ios",
            "Android",
            "Innov & Tech",
            "Infra",
            "Data Research",
            "Cross Platform"
        )
        newRecyclerView = view.findViewById(R.id.ahFamilyRecycler)
        newRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        newRecyclerView.setHasFixedSize(true)
        newFamilyList = arrayListOf<ahFamily>()
        getFamilyData()
    }

    private fun getFamilyData() {
        for(i in name.indices){
            val family = ahFamily(name[i])
            newFamilyList.add(family)
        }
        newRecyclerView.adapter = AhFamilyAdapter(newFamilyList)
    }
}