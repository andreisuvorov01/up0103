package com.example.personal_computer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.activityViewModels

class type_hardware : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_type_hardware, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        lateinit var dataModels: ArrayList<dataModel>
        lateinit var listView: ListView
        lateinit var adapter: CustomAdapter
        val ViewModels : ViewModel1 by activityViewModels()
        val name : String? = ViewModels.name?.value.toString()
        val cena : String? = ViewModels.cena?.value.toString()
        val spec : String? = ViewModels.Spec?.value.toString()
        val img : Int? = ViewModels.img.value?.toInt()
        listView = view.findViewById<View>(R.id.spisok_pokupok) as ListView
        dataModels = ArrayList()
        if ((name != null) && (cena != null) && (spec != null) && (img != null)) {
            dataModels.add(
                dataModel(
                    img,
                    name,
                    cena,
                    spec
                )
            )
        }
        adapter = CustomAdapter(dataModels!!, requireActivity().application)
        listView.adapter = adapter
        super.onViewCreated(view, savedInstanceState)
    }
    companion object {
        fun newInstance() =
            type_hardware().apply {
                arguments = Bundle().apply {

                }
            }
    }
}