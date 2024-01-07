package com.example.lesson1410.presenter.day

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson1410.R
import com.example.lesson1410.WeekScheduleData
import com.example.lesson1410.data.LessonData
import com.example.lesson1410.databinding.FragmentDayBinding
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

class DayScheduleFragment : Fragment() {

    private var binding: FragmentDayBinding? = null
    private var adapter = DayItemAdapter()

    val lessons = mutableListOf<LessonData>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDayBinding.inflate(inflater, container, false)

        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = binding!!.myFirstRecycler
        val emptyTextView: TextView = view.findViewById(R.id.text_for_empty)

        if (lessons.size === 0) {
            recyclerView.visibility = View.GONE
            emptyTextView.visibility = View.VISIBLE
        } else {
            recyclerView.visibility = View.VISIBLE
            emptyTextView.visibility = View.GONE

            recyclerView.adapter = this.adapter
            recyclerView.layoutManager = LinearLayoutManager(requireContext())

            lessons.addAll(WeekScheduleData.dayScheduleList[getDayIndex()].lessons)

            setCurrentLessonIfExists()

            adapter.submitLessonsList(lessons)
        }
    }

    private fun getDayIndex(): Int {
        val calendar: Calendar = Calendar.getInstance()
        val day = calendar.get(Calendar.DAY_OF_WEEK)

        return when (day) {
            Calendar.SUNDAY -> 6
            Calendar.MONDAY -> 0
            Calendar.TUESDAY -> 1
            Calendar.WEDNESDAY -> 2
            Calendar.THURSDAY -> 3
            Calendar.FRIDAY -> 4
            Calendar.SATURDAY -> 5

            else -> -1
        }
    }

    private fun setCurrentLessonIfExists() {
        val curTime = Date()
        val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd-hh-mm", Locale("ru"))

        for (elem in lessons) {
            val dateStart = simpleDateFormat.parse("${curTime.year + 1900}-${curTime.month + 1}-${curTime.date}-" + elem.timeStart)
            val dateEnd = simpleDateFormat.parse("${curTime.year + 1900}-${curTime.month + 1}-${curTime.date}-" + elem.timeEnd)

            if (curTime.after(dateStart) && dateEnd.after(curTime)) {
                elem.isCurrentLesson = true
            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            DayScheduleFragment()
    }
}