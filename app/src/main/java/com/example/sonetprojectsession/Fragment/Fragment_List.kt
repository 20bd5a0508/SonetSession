package com.example.sonetprojectsession.Fragment

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.sonetprojectsession.R
import com.example.sonetprojectsession.data.User
import com.example.sonetprojectsession.utility.UserListAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Fragment_List :Fragment(R.layout.fragment_list){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var add_btn = activity?.findViewById<FloatingActionButton>(R.id.floatingbtn_add)
        add_btn?.setOnClickListener(View.OnClickListener {
            val fm=activity?.supportFragmentManager
            val ft=fm?.beginTransaction()
            ft?.replace(R.id.fragmet,FragmentAdd())
            ft?.commit()
        })
        var rcv=activity?.findViewById<RecyclerView>(R.id.rcv)
        var userListAdapter=UserListAdapter()
        Log.i("------>","test")
        var user= User(12,"Ram","Reddy",23)



        userListAdapter.setUserData(listOf<User>(user))

        rcv?.adapter=UserListAdapter()


    }
}