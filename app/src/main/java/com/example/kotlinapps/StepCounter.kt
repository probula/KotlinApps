package com.example.kotlinapps

class Krokomkierz{

    companion object{
        var liczba = 0 //val - stała
    }

    fun krok(){
        println("Aby zliczac kroki wpisz SPACJE i kliknij ENTER, aby zakonczyc liczenie wpisz 'koniec'")
        while (true){
            val input = readln()

            if(input == " "){
                liczba+=1
                println("liczba kroków: " + liczba)
            }
            else if(input.lowercase() == "koniec"){
                println("Zakończono zliczanie, łączna liczba kroków:  " + liczba)

            }
        }
    }

}

fun main(){

}