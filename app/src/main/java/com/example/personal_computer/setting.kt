package com.example.personal_computer

import android.content.Context
import android.content.res.Resources.Theme
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import androidx.annotation.Nullable
import com.example.personal_computer.databinding.ActivityMainBinding.inflate

// TODO: Rename parameter arguments, choose names that match


/**
 * A simple [Fragment] subclass.
 * Use the [setting.newInstance] factory method to
 * create an instance of this fragment.
 */
class setting : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewOfLayout = inflater!!.inflate(R.layout.fragment_setting, container, false)
        return viewOfLayout
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val root:ViewGroup = inflater.inflate(R.layout.fragment_setting, null)
        val lightRadioButton : RadioButton = activity().findViewById(R.id.light_theme)
        super.onViewCreated(view, savedInstanceState)
    }
 
    companion object {

        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
            setting().apply {
                arguments = Bundle().apply {

                }
            }
    }
}