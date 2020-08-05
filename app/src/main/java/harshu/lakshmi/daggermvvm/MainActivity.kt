package harshu.lakshmi.daggermvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import harshu.lakshmi.daggermvvm.questionViewModel.QuestionViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var questionViewModel: QuestionViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        questionViewModel = ViewModelProviders.of(this).get(QuestionViewModel::class.java)
        questionViewModel.getQuestions().observe(this, Observer {
            questions.text = it[0]
        })
    }
}