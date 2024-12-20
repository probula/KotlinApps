package com.example.kotlinapps

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

fun main(){

}