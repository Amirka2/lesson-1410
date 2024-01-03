package com.example.lesson1410

import com.example.lesson1410.data.LessonData
import com.example.lesson1410.data.Week
import com.example.lesson1410.data.WeekDays

object WeekScheduleData {
    val list
        get() = listOf<Week>(
            Week(
                dayOfTheWeek = WeekDays.MONDAY,
                lessonAmount = 0,
                lessons = listOf<LessonData>(),
                startsWith = 0
            ),
            Week(
                dayOfTheWeek = WeekDays.TUESDAY,
                lessonAmount = 3,
                startsWith = 5,
                lessons = listOf<LessonData>(
                    LessonData(
                        lessonNumber = "5",
                        timeStart = "15:00",
                        timeEnd = "16:30",
                        disciplineName = "Экономика",
                        lessonAudience = "304",
                        isCurrentLesson = false,
                        lecturerName = "Елена Ткач",
                    ),
                    LessonData(
                        lessonNumber = "6",
                        timeStart = "16:40",
                        timeEnd = "18:10",
                        disciplineName = "БД",
                        lessonAudience = "А-13",
                        isCurrentLesson = false,
                        lecturerName = "Барабан",
                    ),
                    LessonData(
                        lessonNumber = "7",
                        timeStart = "18:20",
                        timeEnd = "19:50",
                        disciplineName = "БД",
                        lessonAudience = "А-13",
                        isCurrentLesson = false,
                        lecturerName = "Барабан",
                    )
                )
            ),
            Week(
                dayOfTheWeek = WeekDays.WEDNESDAY,
                lessonAmount = 2,
                startsWith = 7,
                lessons = listOf<LessonData>(
                    LessonData(
                        lessonNumber = "7",
                        timeStart = "18:20",
                        timeEnd = "19:50",
                        disciplineName = "Управление ЖЦ ПО",
                        lessonAudience = "200",
                        isCurrentLesson = false,
                        lecturerName = "Точка банкер",
                    ),
                    LessonData(
                        lessonNumber = "8",
                        timeStart = "19:55",
                        timeEnd = "21:25",
                        disciplineName = "Управление ЖЦ ПО",
                        lessonAudience = "200",
                        isCurrentLesson = false,
                        lecturerName = "Точка банкер",
                    )
                )
            ),
            Week(
                dayOfTheWeek = WeekDays.THURSDAY,
                lessonAmount = 2,
                startsWith = 5,
                lessons = listOf<LessonData>(
                    LessonData(
                        lessonNumber = "5",
                        timeStart = "15:00",
                        timeEnd = "16:30",
                        disciplineName = "Анализ данных",
                        lessonAudience = "132-а",
                        isCurrentLesson = false,
                        lecturerName = "Алюков",
                    ),
                    LessonData(
                        lessonNumber = "6",
                        timeStart = "16:40",
                        timeEnd = "18:10",
                        disciplineName = "Анализ данных",
                        lessonAudience = "А-13",
                        isCurrentLesson = false,
                        lecturerName = "Алюков",
                    )
                )
            ),
            Week(
                dayOfTheWeek = WeekDays.FRIDAY,
                lessonAmount = 1,
                startsWith = 5,
                lessons = listOf<LessonData>(
                    LessonData(
                        lessonNumber = "5",
                        timeStart = "19:30",
                        timeEnd = "21:30",
                        disciplineName = "Разработка веб-приложений",
                        lessonAudience = "Online",
                        isCurrentLesson = false,
                            lecturerName = "Mr. Pavlichenkov",
                    )
                )
            ),
            Week(
                dayOfTheWeek = WeekDays.SATURDAY,
                lessonAmount = 4,
                startsWith = 2,
                lessons = listOf<LessonData>(
                    LessonData(
                        lessonNumber = "2",
                        timeStart = "9:40",
                        timeEnd = "11:10",
                        disciplineName = "Android",
                        lessonAudience = "132",
                        isCurrentLesson = false,
                        lecturerName = "Никита",
                    ),
                    LessonData(
                        lessonNumber = "3",
                        timeStart = "11:20",
                        timeEnd = "12:50",
                        disciplineName = "Android",
                        lessonAudience = "132",
                        isCurrentLesson = false,
                        lecturerName = "Никита",
                    ),
                    LessonData(
                        lessonNumber = "4",
                        timeStart = "13:15",
                        timeEnd = "14:45",
                        disciplineName = "Android",
                        lessonAudience = "132",
                        isCurrentLesson = false,
                        lecturerName = "Никита",
                    ),
                    LessonData(
                        lessonNumber = "5",
                        timeStart = "15:00",
                        timeEnd = "16:30",
                        disciplineName = "Android",
                        lessonAudience = "132",
                        isCurrentLesson = false,
                        lecturerName = "Никита",
                    ),
                )
            )
        )
}