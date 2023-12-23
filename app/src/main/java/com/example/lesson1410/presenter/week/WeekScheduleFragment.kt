package com.example.lesson1410.presenter.week

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lesson1410.WeekScheduleData
import com.example.lesson1410.databinding.FragmentWeekScheduleBinding

class WeekScheduleFragment: Fragment() {

    private var binding: FragmentWeekScheduleBinding? = null
    private val adapter: WeekItemsAdapter = WeekItemsAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWeekScheduleBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.weekFragmentRecycler?.adapter = this.adapter
        binding?.weekFragmentRecycler?.layoutManager = LinearLayoutManager(requireContext())
        adapter.submitList(WeekScheduleData.list)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            WeekScheduleFragment()
    }
}