package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

const val KEY_RESULT_IMC = "ResultActivity.KEY_IMC"

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_result)

        val result = intent.getFloatExtra(KEY_RESULT_IMC, 0f)

        val tvResult = findViewById<TextView>(R.id.tv_result)
        val tvClassificacao = findViewById<TextView>(R.id.tv_classificacao)

        tvResult.text = result.toString()

        val classificacao: String = if(result <= 18.5f){
            "Magreza"
        }else if(result > 18.5f && result <= 24.9f){
            "Normal"
        }else if(result > 24.9f && result <= 29.9f){
            "Sobrepeso"
        }else if(result > 29.9f && result <= 39.9f){
            "Obesidade"
        }else {
            "Obesidade Grave"
        }
        tvClassificacao.text = classificacao
    }
}