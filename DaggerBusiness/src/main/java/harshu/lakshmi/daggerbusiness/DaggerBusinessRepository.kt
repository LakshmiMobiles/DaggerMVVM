package harshu.lakshmi.daggerbusiness

class DaggerBusinessRepository {

    fun getQuestions() : List<String>{
        val questionArray = listOf<String>("question1" , "question2","question3")
        return questionArray
    }
}