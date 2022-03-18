package com.example.android.quizapp

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String ="total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<Question>{
        val questionsList= ArrayList<Question>()

        val que1 = Question(
            1,
            "Where is Kazakhstan located?",
            R.drawable.kzmap,
            "Eurasia",
            "In Asia",
            "In Europe",
            "Africa",
            1)
        questionsList.add(que1)

        val que2 = Question(
            2, "What does the word Kazakhstan mean?",
            R.drawable.kzword,
            "Kazakh dessert", "Kazakh country",
            "Kazakh Land", "Kazakh steppe", 3
        )

        questionsList.add(que2)

        val que3 = Question(
            3, "What is the capital of Kazakhstan?",
            R.drawable.nursultan,
            "Akmola", "Almaty",
            "Kostanay", "Nur-Sultan", 4
     )

        questionsList.add(que3)

        val que4 = Question(
            4, "What is Kazakhstan like?",
            R.drawable.kz444,
            "Traditional", "All of above",
            "Historical", "Modern", 2
        )

        questionsList.add(que4)

        val que5 = Question(
            5, "Who is in the picture?",
            R.drawable.konaev,
            "Toktar Aubakirov", "Shokan Ualikhanov",
            "Dinmukhamed Kunaev", "Abish Nazarbayev", 3
        )

        questionsList.add(que5)

        val que6 = Question(
            6, "When Kazakhstan became independent?",
            R.drawable.independence,
            "16 December 1991", "1 December 1991",
            "16 December 1986", "31 December 1986", 1
        )

        questionsList.add(que6)

        val que7 = Question(
            7, "Which of the following nations does NOT share part of its border with Kazakhstan?",
            R.drawable.kzmap,
            "Russia", "China",
            "Afganistan", "Turkmenistan", 3
        )

        questionsList.add(que7)

        val que8 = Question(
            8, "Who is in the picture?",
            R.drawable.toktar,
            "Aidyn Aimbetov", "Talgat Musabayev",
            "Olzhas Suleimenov", "Toktar Aubakirov", 4
        )

        questionsList.add(que8)

        val que9 = Question(
            9, "What is the name of Kazakhstan money?",
            R.drawable.tenge,
            "Ruble", "Tenge",
            "Euro", "Won", 2
        )

        questionsList.add(que9)

        val que10 = Question(
            10, "Which fruit originally comes from Kazakhstan?",
            R.drawable.appple,
            "The apple", "The orange",
            "Pineapple", "Banana", 1
        )

        questionsList.add(que10)


        return questionsList
    }
}