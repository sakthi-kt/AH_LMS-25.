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


class MyLeaveFragment : Fragment() {
    lateinit var newRecyclerView: RecyclerView
    lateinit var newLeaveList: ArrayList<myLeave>

    lateinit var profileImage:Array<Int>
    lateinit var heading:Array<String>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?, ): View? {

        val view = inflater.inflate(R.layout.fragment_my_leave, container, false)
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        profileImage = arrayOf(
            R.drawable.profile,
            R.drawable.profile,
            R.drawable.profile,
            R.drawable.profile,
            R.drawable.profile,
            R.drawable.profile,
            R.drawable.profile,
            R.drawable.profile,
            R.drawable.profile


        )
        heading = arrayOf(
            "Sakthivel",
            "Sakthivel",
            "Sakthivel",
            "Sakthivel",
            "Sakthivel",
            "Sakthivel",
            "Sakthivel",
            "Sakthivel",
            "Sakthivel"
        )


        newRecyclerView = view.findViewById(R.id.leave_recyc)
        newRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        newRecyclerView.setHasFixedSize(true)
        newLeaveList = arrayListOf<myLeave>()
        getUserData()
    }

    private fun getUserData() {
        for (i in profileImage.indices){

            val leaves = myLeave(profileImage[i],heading[i])
            newLeaveList.add(leaves)
        }
        newRecyclerView.adapter = MyLeaveAdapter(newLeaveList)
    }


}