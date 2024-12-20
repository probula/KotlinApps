package com.example.kotlinapps

interface Weather{
    fun wyswietl(): String;
}

class Sunny : Weather{
    override fun wyswietl(): String {
        return "słonecznie"
    }
}

fun main(){

}