package com.example.mente

class constant {

    companion object{

        const val userTypeSpecialist = "specialist"
        const val userTypeParent = "parent"


     //  فئات الاسئلة ف الاخصائي
        const val quizTypeSpeNeural = "الفرز العصبى "
        const val quizTypeSpeIIIIinoi = "الينوي "
        const val quizTypeSpeFathyElZayat = "بطاريات فتحى الزيات "
        const val quizTypeSpeMichaelBest = "مايكل بست"


        // go To Page From btn name
        const val btnGoToNeuralQuestions = "NeuralQuestions"
        const val btnGoToElioniQuestions = "ElinoiQuestions"
        const val btnGoToFathyElZayatQuestions = "FathyElZayatQuestions"
        const val btnGoToMichaelBestQuestions = "MichaelBestQuestions"





        // in neural go to show q
        var neuralCategoryList = mutableListOf<String>(
            " ﻣﮭﺎرة اﻟﯾد " ,
            " اﻟﺗﻌرف ﻋﻠﻰ ﺷﻛل و ﻧﺳﺧﮫ " ,
            "اﻟﺗﻌرف ﻋﻠﻰ اﻟﺷﻛل ﺣﯾن ﯾرﺳم ﺑﺎﻟﻣس ﻋﻠﻰ راﺣﺔ اﻟﯾد " ,
            " ﻣﺗﺎﺑﻌﺔ ﺷﯾﺊ ﻣﺗﺣرك ﺑﺎﻟﻌﯾن" ,
            " محاكاة الاصوات " ,
            "ﻟﻣس اﻷﻧف ﺑﺎﻷﺻﺑﻊ " ,
            " ﻋﻣل داﺋرة ﺑﺈﺻﺑﻊ اﻹﺑﮭﺎم و ﺑﻘﯾﺔ اﻷﺻﺎﺑﻊ" ,
            "ﻟﻣس اﻟﯾد و اﻟﺧد ﻓﻰ ﻧﻔس اﻟوﻗت " ,
            "اﻟﺣرﻛﺎت اﻟﺳرﯾﻌﺔ اﻟﻣﺗﻛررة و اﻟﻌﻛﺳﯾﺔ ﻟﻠﯾدﯾن" ,
            " ﻓرد اﻟذراﻋﯾن و اﻟرﺟﻠﯾن " ,
            " اﻟﻣﺷﻰ اﻟﺗﺑﺎدﻟﻰ " ,
            "اﻟوﻗوف ﻋﻠﻰ رﺟل واﺣدة " ,
            "اﻟوﺛب ﻋﻠﻰ ﻗدم واﺣدة اﻟﺣﺟل" ,
            "اﻟﺗﻣﯾﯾز ﺑﯾن اﻟﯾﺳﺎر و اﻟﯾﻣﯾن " ,
            "أﻧﻣﺎط اﻟﺳﻠوك اﻟﺷﺎذ "
        )





        // in ElIIinoi go to show
        var elIIinoiCategoryList = mutableListOf<String>(
          // فئات الينوى
           "الاستقبال السمعي",
           "الاستقبال البصري",
           "التداعي السمعي",
           "الذاكرة السمعية المتتالية",
           "التداعي البصري",
           "الإغلاق البصري",
           "الإغلاق اللغوي",
           "التعبير اليدوي",
           "الإغلاق السمعي",
           "مزج الأصوات"

        )


        // in fathy Elzayat go to show q4

        var fathyElZayatCategoryList = mutableListOf<String>(
            "الانتباه" ,
            "الإدراك السمعي" ,
            "الإدراك البصري" ,
            "الإدراك الحركي" ,
            "الذاكرة",
            "التقدير التشخيصي لصعوبات تعلم القراءة",
            "التقدير التشخيصي لصعوبات تعلم الكتابة",
            "التقدير التشخيصي لصعوبات تعلم الرياضيات",
            "التقدير التشخيصي لصعوبات السلوك الانفعالي"
        )

        var MichaelBestCategoryList = mutableListOf<String>(
            "الاستيعاب السمعي والتذكر",
            "اللغة",
            "المعرفة العامة",
            "التناسق الحركي",
            "السلوك الشخصي والاجتماعي",
        )



//        الاجابة الصح في اختبار الينوي

        const val givenAnsYes ="Yes"
        const val givenAnsNo ="No"





    }

}