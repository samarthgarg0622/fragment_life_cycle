package com.example.fragment_life_cycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("Fragment Tag","Fragment 1 attached")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Fragment Tag","Fragment 1 created")
    }

//    override fun onCreateView(savedInstanceState: Bundle?){
//        super.onCreateView(savedInstanceState)
//        Log.i("Fragment Tag", "Fragment 1 view creation")
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("Fragment Tag","Fragment 1 view created")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Fragment Tag","Fragment 1 started")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Fragment Tag","Fragment 1 resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Fragment Tag","Fragment 1 paused")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Fragment Tag","Fragment 1 stopped")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("Fragment Tag","Fragment 1 view destroyed")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("Fragment Tag","Fragment 1 detached")
    }

}