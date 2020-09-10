package com.example.calculadora

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //valores de entrada
        button1.setOnClickListener { entrada.text = entrada.text.toString() + "1" }
        button2.setOnClickListener { entrada.text = entrada.text.toString() + "2" }
        button3.setOnClickListener { entrada.text = entrada.text.toString() + "3" }
        button4.setOnClickListener { entrada.text = entrada.text.toString() + "4" }
        button5.setOnClickListener { entrada.text = entrada.text.toString() + "5" }
        button6.setOnClickListener { entrada.text = entrada.text.toString() + "6" }
        button7.setOnClickListener { entrada.text = entrada.text.toString() + "7" }
        button8.setOnClickListener { entrada.text = entrada.text.toString() + "8" }
        button9.setOnClickListener { entrada.text = entrada.text.toString() + "9" }
        button0.setOnClickListener { entrada.text = entrada.text.toString() + "0" }
        ponto.setOnClickListener { entrada.text = entrada.text.toString() + "." }

        //operações
        soma.setOnClickListener { entrada.text = entrada.text.toString() + "+" }
        sub.setOnClickListener { entrada.text = entrada.text.toString() + "-" }
        multi.setOnClickListener { entrada.text = entrada.text.toString() + "*" }
        div.setOnClickListener { entrada.text = entrada.text.toString() + "/" }

        //apaga todos os campos de texto
        clearAll.setOnClickListener {
            entrada.text = ""
            resultado.text = ""
        }

        //backspace/del
        apagar.setOnClickListener {
            val expressao = entrada.text.toString()
            if(expressao.isNotBlank()){ //verifica se a string de entrada não está vazia
                entrada.text = expressao.substring(0, expressao.length-1) //verifica o comprimento da string e retira um elemento do tamanho
            }
            resultado.text = ""
        }
    }
}
