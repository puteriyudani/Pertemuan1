fun main() {
    //menerima 2 masukkan bilangan dan akan melakukan operasi tambah, kurang, kali dan bagi dari kedua bilangan yang dimasukkan
    println("Welcome to calculator")

    //input angka pertama
    println("Enter the first number: ")
    val a = readLine()!!.toDouble() //merubah input string menjadi double

    //input angka kedua
    println("Enter the second number: ")
    val b = readLine()!!.toDouble()

    //operasi
    val sum = a + b
    val difference = a - b
    val product = a * b
    val quotient = a / b

    //tampilkan program
    println("Sum: ${sum}")
    println("Difference: ${difference}")
    println("Product: ${product}")
    println("Quotient: ${quotient}")
    println("Thank you for using calculator.")
}