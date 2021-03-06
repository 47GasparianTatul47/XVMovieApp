package com.example.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.Adapter.VerticalRVAdapter
import com.example.Models.Models
import com.example.xmovieapp.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragmentVerticalRV.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragmentVerticalRV : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: VerticalRVAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_blank_vertical_r_v, container, false)

        requireActivity().window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION



        val list = listOf(
            Models("The Nun", R.drawable.the_nun, "Horror/Thriller"),
            Models("Incredibles two", R.drawable.incredibles_two, "Anime/Family"),
            Models("Fight Club", R.drawable.fight_club, "Thriller/Drama"),
            Models("Centurion", R.drawable.centurion),
            Models("Oceans Thirtheen", R.drawable.ocenas_thirtheen),
            Models("Venom", R.drawable.venom_imax),
            Models("Kill Bill", R.drawable.kill_bill),
            Models("Fight Club", R.drawable.fight_club),
            Models("Centurion", R.drawable.centurion),
            Models("Oceans Thirtheen", R.drawable.ocenas_thirtheen),
        )

        recyclerView = view.findViewById(R.id.verticalRv)
        adapter = VerticalRVAdapter(requireActivity(), list)
        recyclerView.layoutManager = LinearLayoutManager(requireActivity())

        recyclerView.adapter = adapter

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragmentVerticalRV.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragmentVerticalRV().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}