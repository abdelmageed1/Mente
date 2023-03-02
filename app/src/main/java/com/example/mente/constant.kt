package com.example.mente

class constant {

    companion object{

        const val userTypeSpecialist = "specialist"
        const val userTypeParent = "parent"


     //  فئات الاسئلة ف الاخصائي
        const val quizTypeSpeNeural = "الفرز العصبى "
        const val quizTypeSpeIIIIinoi = "الينوي "
        const val quizTypeSpeFathyElZayat = "بطاريات فتحى الزيات "


        // go To Page From btn name
        const val btnGoToNeuralQuestions = "NeuralQuestions"
        const val btnGoToElioniQuestions = "ElinoiQuestions"
        const val btnGoToFathyElZayatQuestions = "FathyElZayatQuestions"





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
        )


        // in fathy Elzayat go to show q4

        var fathyElZayatCategoryList = mutableListOf<String>(
            "الانتباه" ,
            "الإدراك السمعي" ,
            "الإدراك البصري" ,
            "الإدراك الحركي" ,
            "الذاكرة"
        )




    }

}