package com.example.lesson1410.presenter.day

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson1410.R
import com.example.lesson1410.data.LessonData
import com.example.lesson1410.databinding.DayScheduleItemBinding

class DayItemAdapter: RecyclerView.Adapter<DayItemAdapter.DayItemViewHolder>() {

    private val lessonsList = mutableListOf<LessonData>()

    class DayItemViewHolder(
        private val binding: DayScheduleItemBinding
    ): RecyclerView.ViewHolder(binding.root) {
        fun bind(data: LessonData) {
            binding.lessonNumber.text = data.lessonNumber
            binding.lessonTimeEnd.text = data.timeEnd
            binding.lessonTimeStart.text = data.timeStart
            binding.subject.text = data.disciplineName
            binding.auditorium.text = data.lessonAudience
            binding.lecturer.text = data.lecturerName
            if (data.isCurrentLesson) {
                binding.root.setBackground(ContextCompat.getDrawable(binding.root.context, R.drawable.current_lesson_wrapper))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DayScheduleItemBinding.inflate(inflater, parent, false)

        return DayItemViewHolder(binding)
    }

    override fun getItemCount(): Int = lessonsList.size

    override fun onBindViewHolder(holder: DayItemViewHolder, position: Int) {
        val item = lessonsList[position]

//        if (!item.isCurrentLesson) {
//            holder.itemView.background = (R.drawable.current_lesson_wrapper.toDrawable())
//        } else {
//            holder.itemView.setBackgroundResource(R.color.new_message)
//        }

        holder.bind(item)
    }

    fun submitLessonsList(list: List<LessonData>) {
        this.lessonsList.addAll(list)

        notifyDataSetChanged()
    }
}