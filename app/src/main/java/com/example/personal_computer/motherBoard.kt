package com.example.personal_computer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Paths


class motherBoard : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mother_board, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val buy: Button = view.findViewById(R.id.button_pokupka)
        buy.setOnClickListener {
            val fragment: Fragment = Fragment(R.layout.fragment_mother_board)
            if (fragment != null) {
                val transaction: FragmentTransaction? = getFragmentManager()?.beginTransaction()
                transaction?.replace(R.id.placeholder1, pokupka_motherBoard.newInstance())
                transaction?.addToBackStack(null)
                transaction?.commit()
            }
        }
        super.onViewCreated(view, savedInstanceState)
    }
    companion object {
        fun newInstance() =
            motherBoard().apply {
                arguments = Bundle().apply {

                }
            }
    }
}