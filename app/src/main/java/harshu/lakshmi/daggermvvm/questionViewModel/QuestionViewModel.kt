package harshu.lakshmi.daggermvvm.questionViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuestionViewModel : ViewModel() {

    fun getQuestions() : MutableLiveData<List<String>>{
        val questionMutableList = MutableLiveData<List<String>>()
        val questionArray = listOf<String>("question1" , "question2","question3")
        questionMutableList.value =questionArray
        return questionMutableList
    }
}