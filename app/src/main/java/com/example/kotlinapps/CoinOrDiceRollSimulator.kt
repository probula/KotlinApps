interface RollingTool {
    fun roll()
}

class Coin : RollingTool{
    override fun roll() {
        val arr = arrayOf("Heads", "Tails")
        val randomArr = arr.random()
        println("Wylosowano: "+randomArr)
    }
}

class Dice : RollingTool{
    override fun roll() {
        val liczba = (1..6).random()
        println("Wylosowano: "+liczba)
    }
}

fun main(){

}