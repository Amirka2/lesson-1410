package com.example.lesson1410.presenter.week

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson1410.R
import com.example.lesson1410.data.DaySchedule
import com.example.lesson1410.databinding.WeekScheduleItemBinding
import com.example.lesson1410.presenter.day.DayItemAdapter

class WeekItemsAdapter : RecyclerView.Adapter<WeekItemsAdapter.WeekItemViewHolder>() {

    private val list = mutableListOf<DaySchedule>()

    class WeekItemViewHolder(
        private val binding: WeekScheduleItemBinding
    ) :RecyclerView.ViewHolder(binding.root) {
        private val adapter = DayItemAdapter()

        fun bind(data: DaySchedule) {
            val context = binding.root.context

            if (data.lessonAmount === 0) {
                binding.dayOfWeek.text = context.getString(data.dayOfTheWeek.dayOfWeekStringId)
                binding.lessonAmount.text = context.getString(R.string.no_lesson_text)
            } else {
                binding.lessonAmount.text = context.getString(
                    R.string.lesson_amount_additional_text,
                    data.lessonAmount.toString()
                )
                binding.timeOfLessons.text = context.getString(
                    R.string.time_interval,
                    data.lessonsTimeStart,
                    data.lessonsTimeEnd
                )

                binding.dayOfWeek.text = context.getString(data.dayOfTheWeek.dayOfWeekStringId)
                binding.dayScheduleRecycler.adapter = this.adapter
                binding.dayScheduleRecycler.layoutManager = LinearLayoutManager(context)
            }

            adapter.submitLessonsList(data.lessons)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeekItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = WeekScheduleItemBinding.inflate(
            inflater,
            parent,
            false
        )

        return WeekItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: WeekItemViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    fun submitList(list: List<DaySchedule>) {
        this.list.addAll(list)
        notifyDataSetChanged()
    }

}