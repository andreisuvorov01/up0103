package com.example.personal_computer

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.fragment.app.Fragment

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
        val radioGroup = view.findViewById<RadioGroup>(R.id.radioGroup)
        val lightRadioButton: RadioButton = view.findViewById(R.id.light_theme)
        val nightRadioButton: RadioButton = view.findViewById(R.id.night_theme)
        val bundle = Bundle()
        radioGroup.setOnCheckedChangeListener{ _, checkedId ->
            when (checkedId){
                R.id.light_theme ->{
                    val bundle = Bundle()
                    bundle.putInt("theme",1)
                }
                R.id.night_theme->{
                    val bundle = Bundle()
                    bundle.putInt("theme",2)
                }
            }
        }

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