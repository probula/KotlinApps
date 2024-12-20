package com.example.kotlinapps

import kotlin.random.Random

interface Weather{
    fun wyswietl(): String;
}

class Sunny : Weather{
    override fun wyswietl(): String {
        return "słonecznie"
    }
}

class Rainy : Weather{
    override fun wyswietl(): String {
        return "pada deszcz"
    }
}

class Clody : Weather{
    override fun wyswietl(): String {
        return "pochmurno"
    }
}

fun losujPogode() : Weather{
    return when(Random.nextInt(3)) { //losuje od 0 do 2 włącznie
        0 -> Sunny()
        1 -> Rainy()
        else -> Clody()
    }
}


fun main(){

}