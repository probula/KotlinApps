class sportsResultAnalyzer{

    var wyniki = mutableListOf<Int>()

    fun dodajWynik(){
        println("Podaj wynik meczu:")
        val wynik = readln().toIntOrNull()
        if(wynik != null){
            wyniki.add(wynik)
            println("Dodano wynik: $wynik")
        }
        else{
            println("Błędny wynik!")
        }
    }

    fun wynikPowyzejProgu(){
        println("Podaj próg:")
        val prog = readln().toIntOrNull()
        if(prog != null) {
            val powyzejProgu = wyniki.filter { it > prog }
            println("Wyniki powyżej $prog: $powyzejProgu")
        }else{
            println("Błąd!")
        }
    }

    fun bonusowePunkty(){
        println("Podaj liczbę punktów do dodania do każdego wyniku:")
        val bonus = readln().toIntOrNull()
        if(bonus != null) {
            wyniki = wyniki.map { it + bonus }.toMutableList()
            println("Dodano $bonus puntów do każdego wyniku.")
        }else{
            println("Błąd")
        }
    }

    fun menu(){
        while (true){
            println("\nWybierz opcję:")
            println("1. Dodaj wynik meczu")
            println("2. Pokaż wynik powyżej progu")
            println("3. Dodaj bonusowe punkty do wyników")

            when(readln().toIntOrNull()) {
                1 -> dodajWynik()
                2 -> wynikPowyzejProgu()
                3 -> bonusowePunkty()
                else -> println("Błąd!")
            }
        }
    }
}
fun main(){
    val analyzer = sportsResultAnalyzer()
    analyzer.menu()
}