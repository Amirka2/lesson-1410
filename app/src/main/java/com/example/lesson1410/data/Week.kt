package com.example.lesson1410.data

import androidx.annotation.StringRes
import com.example.lesson1410.R

data class Week (
    val dayOfTheWeek: WeekDays,
    val lessonAmount: Int,
    val startsWith: Int,
    val lessons: List<LessonData>
) {
    val lessonsTimeStart = lessons.firstOrNull()?.timeStart ?: ""
    val lessonsTimeEnd = lessons.lastOrNull()?.timeEnd ?: ""
}

enum class WeekDays(@StringRes val dayOfWeekStringId: Int) {
    MONDAY(R.string.Monday),
    TUESDAY(R.string.Tuesday),
    WEDNESDAY(R.string.Wednesday),
    THURSDAY(R.string.Thursday),
    FRIDAY(R.string.Friday),
    SATURDAY(R.string.Saturday),
    SUNDAY(R.string.Sunday)
}