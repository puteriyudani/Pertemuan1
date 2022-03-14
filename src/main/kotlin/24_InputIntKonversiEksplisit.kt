fun main() {
    //merubah nilai String yang dikembalikan oleh fungsi readLine()!! kedalam nilai yang diinginkan bisa dilakukan dengan menggunakan konversi secara eksplisit
    //input angka yang awalnya adalah String lalu di ubah menjadi Int dengan konversi eksplisit

    //tampilkan kalimat
    println("Enter a number and I'll double it: ")

    //masukkan angka
    val input = readLine()!!
    var a = input.toInt()

    //proses menggandakan angka
    a = a * 2

    //tampilkan
    println(a)

    //contoh lain
    println("Enter a number, and I'll square it: ")
    val number = readLine()!!.toInt()
    val square = number * number
    println("Result: $square")
}