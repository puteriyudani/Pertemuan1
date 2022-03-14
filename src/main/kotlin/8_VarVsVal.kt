fun main() {
    //deklarasi variabel menggunakan var, variabel bisa diubah
    var varVariabel: Int
    varVariabel = 56 //nilai pertama
    println("Pemberian nilai pertama pada varVariabel = $varVariabel")
    varVariabel = 78 //nilai kedua
    println("Pemberian nilai kedua pada varVariabel = $varVariabel")

    //deklarasi variabel menggunakan val, variabel tidak bisa diubah
    val PHI = 3.14
    //PHI = 22.9 -> error
    println(PHI)
}