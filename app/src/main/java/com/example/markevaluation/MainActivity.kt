package com.example.markevaluation

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.markevaluation.ui.theme.MarkEvaluationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val marksInput = findViewById<EditText>(R.id.editMarks)
        val resultsText = findViewById<TextView>(R.id.textTextView)
        val button = findViewById<Button>(R.id.button2)
        val resetButton = findViewById<Button>(R.id.btnReset)

        button.setOnClickListener {

            val marks = marksInput.text.toString().toInt()

            if (marks >= 88){
                resultsText.text = "Symbol : A"
            }
            else if (marks >= 70){
                resultsText.text = "Symbol : B"
            }
            else if (marks >= 60){
                resultsText.text = "Symbol : C"
            }
            else if (marks >= 50){
                resultsText.text = "Symbol : D"
            }
            else {
                resultsText.text = "Symbol : E"
            }
        }

        //Reset Button
        resetButton.setOnClickListener {
            marksInput.text.clear()
            resultsText.text = "Results will appear here"
        }


    }

}