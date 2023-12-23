package com.example.lesson1410.presenter.day

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson1410.R
import com.example.lesson1410.data.LessonData
import com.example.lesson1410.databinding.DayScheduleItemBinding

class DayItemAdapter: RecyclerView.Adapter<DayItemAdapter.DayItemViewHolder>() {

    private val list = mutableListOf<LessonData>()

    class DayItemViewHolder(
        private val binding: DayScheduleItemBinding
    ): RecyclerView.ViewHolder(binding.root) {
        fun bind(data: LessonData) {
            if (data.isCurrentLesson) {
                binding.lessonId.setBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.currentLesson))
            }
            binding.lessonNumber.text = data.lessonNumber
            binding.lessonEndTimeId.text = data.timeEnd
            binding.lessonStartTimeId.text = data.timeStart
            binding.lessonName.text = data.disciplineName
            binding.lessonAudience.text = data.lessonAudience
            binding.lessonLecturer.text = data.lecturerName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DayScheduleItemBinding.inflate(inflater, parent, false)
        return DayItemViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: DayItemViewHolder, position: Int) {
        holder.bind(list[position])
    }

    fun submitList(list: List<LessonData>) {
        this.list.addAll(list)
        notifyDataSetChanged()
    }
}