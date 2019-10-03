package com.example.customnavigation.auth


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.customnavigation.R


/**
 * A simple [Fragment] subclass.
 */
class ComfirmEmail : Fragment() {

    private lateinit var callBack: OnBackPressedCallback


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_comfirm_email, container, false)

        callBack = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                findNavController().navigate(R.id.action_confirm_to_login)
            }
        }


        requireActivity().onBackPressedDispatcher.addCallback(this, callBack)


        return rootView
    }


}