package com.example.kotlinapps

class Program {
    val ksiazki = mutableListOf("")

    fun dodaj() {
        while (true) {
            println("\npodaj nazwe ksiazki, autora, oraz rok wydania, lub wpisz 'koniec' aby zakonczyc dodawanie: ")
            val ksiazka = readln()

            if (ksiazka.lowercase() == "koniec") {
                break
            } else {
                ksiazki.add(ksiazka)
                println("Twoja lista zawiera ksiazki: " + ksiazki)

            }
        }
    }

    fun filtrujRok() {
        println("Podaj rok z ktorego maja byc ksiazki")
        val rok = readln()
        println(ksiazki.filter { rKsiazki -> rKsiazki.contains(rok) })

    }


}

fun main(){
    val program = Program()
}