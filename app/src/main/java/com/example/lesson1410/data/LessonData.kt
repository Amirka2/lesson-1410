package com.example.lesson1410.data

data class LessonData (
    val lessonNumber: String,
    val timeStart: String,
    val timeEnd: String,
    val disciplineName: String,
    val lessonAudience: String,
    val lecturerName: String,
    var isCurrentLesson: Boolean
)