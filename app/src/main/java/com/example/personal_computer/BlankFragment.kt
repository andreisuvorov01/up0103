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
        val mat: Button = view.findViewById(R.id.button_moth)
        val proc: Button = view.findViewById(R.id.button_proc)
        val hard : Button = view.findViewById(R.id.hard_btn)
        val mem: Button = view.findViewById(R.id.memory_btn)
        val video: Button = view.findViewById(R.id.videocard_btn)
        val casef: Button = view.findViewById(R.id.case_btn)
        mat.setOnClickListener {
            val fragment: Fragment = Fragment(R.layout.fragment_mother_board)
            if (fragment != null) {
                val transaction: FragmentTransaction? = getFragmentManager()?.beginTransaction()
                transaction?.replace(R.id.placeholder1, motherBoard.newInstance())
                transaction?.addToBackStack(null)
                transaction?.commit()
            }
        }
        proc.setOnClickListener {
            val fragment: Fragment = Fragment(R.layout.fragment_processor)
            if (fragment != null) {
                val transaction: FragmentTransaction? = getFragmentManager()?.beginTransaction()
                transaction?.replace(R.id.placeholder1, processor.newInstance())
                transaction?.addToBackStack(null)
                transaction?.commit()
            }

        }
        hard.setOnClickListener{
            val fragment: Fragment = Fragment(R.layout.fragment_hard_drive)
            if (fragment != null) {
                val transaction: FragmentTransaction? = getFragmentManager()?.beginTransaction()
                transaction?.replace(R.id.placeholder1, hard_drive.newInstance())
                transaction?.addToBackStack(null)
                transaction?.commit()
            }
        }
        mem.setOnClickListener {
            val fragment: Fragment = Fragment(R.layout.fragment_memory)
            if (fragment != null) {
                val transaction: FragmentTransaction? = getFragmentManager()?.beginTransaction()
                transaction?.replace(R.id.placeholder1, memory.newInstance())
                transaction?.addToBackStack(null)
                transaction?.commit()
            }
        }
        video.setOnClickListener {
            val fragment: Fragment = Fragment(R.layout.fragment_hard_drive)
            if (fragment != null) {
                val transaction: FragmentTransaction? = getFragmentManager()?.beginTransaction()
                transaction?.replace(R.id.placeholder1, videocard.newInstance())
                transaction?.addToBackStack(null)
                transaction?.commit()
            }
        }
        casef.setOnClickListener {
            val fragment: Fragment = Fragment(R.layout.fragment_case_frag)
            if (fragment != null) {
                val transaction: FragmentTransaction? = getFragmentManager()?.beginTransaction()
                transaction?.replace(R.id.placeholder1, case_frag.newInstance())
                transaction?.addToBackStack(null)
                transaction?.commit()
            }
        }

        super.onViewCreated(view, savedInstanceState)
    }
    companion object {
        fun newInstance() =
            BlankFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}