package com.example.personal_computer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction
import com.example.personal_computer.databinding.ActivityMainBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment : Fragment() {
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
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val mat : Button = view.findViewById(R.id.button_moth)
        mat.setOnClickListener {
            val fragment: Fragment = Fragment(R.layout.fragment_mother_board)
            if (fragment != null) {
                val transaction: FragmentTransaction? = getFragmentManager()?.beginTransaction()
                transaction?.replace(R.id.placeholder1, motherBoard.newInstance())
                transaction?.addToBackStack(null)
                transaction?.commit()
            }
        }
        super.onViewCreated(view, savedInstanceState)
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
            BlankFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}