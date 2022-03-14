fun main() {
    //boolean merupakan tipe data yang memiliki nilai true atau false
    var varBool : Boolean = true
    if (varBool)
        println("varBool bernilai $varBool")

    //nilai 1 pada variabel varInt tidak berlaku untuk menunjuk nilai pada sebuah variabel bertipe Boolean
    var varInt : Int = 1
    //if (varInt) -> error
    println("varInt bernilai $varInt")
}