package com.example.ah_lms.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ah_lms.R
import com.example.ah_lms.adapter.MyLeaveAdapter
import com.example.ah_lms.dataclass.myLeave


class LeaveFragment : Fragment() {
    //lateinit var myAdapter: MyLeaveAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?, ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_leave, container, false)

    }


}