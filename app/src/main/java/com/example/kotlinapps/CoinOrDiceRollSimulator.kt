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

fun main(){

}