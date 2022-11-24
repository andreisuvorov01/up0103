package com.example.personal_computer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import com.example.personal_computer.databinding.FragmentPokupkaMotherBoardBinding

class pokupka_motherBoard : Fragment() {

    lateinit var binding : FragmentPokupkaMotherBoardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPokupkaMotherBoardBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        lateinit var dataModels: ArrayList<dataModel>
        lateinit var listView: ListView
        lateinit var adapter: CustomAdapter
        listView = view.findViewById<View>(R.id.list) as ListView
        dataModels = ArrayList()
        dataModels.add(
            dataModel(
                R.drawable.moth1_buy,
                "Материнская плата GIGABYTE H510M H",
                "5 199 ₽",
                "LGA 1200"
            )
        )
        adapter = CustomAdapter(dataModels!!, requireActivity().application)
        listView.adapter = adapter
        listView.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->

                val toast = Toast.makeText(context,"Товар добавлен в корзину",Toast.LENGTH_LONG)
                val dataModel = dataModels!![position]
                 val ViewModels : ViewModel1 by activityViewModels()
                ViewModels.name.value = "Материнская плата GIGABYTE H510M H"
                ViewModels.cena.value = "5 199 ₽"
                ViewModels.Spec.value = "LGA 1200"
                ViewModels.img.value =  R.drawable.moth1_buy
            }
        super.onViewCreated(view, savedInstanceState)
    }
    companion object {

        fun newInstance() =
            pokupka_motherBoard().apply {
                arguments = Bundle().apply {
                }
            }
    }
}