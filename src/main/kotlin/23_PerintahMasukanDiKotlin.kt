fun main() {
    //sebuah fungsi readLine()!!
    //akan mengembalikan nilai string kedalam variabel penampung
    println("Hi I'm Lora,the virtual parrot, adn i love to repeat!")
    println("Type something in: ")

    //memasukkan string
    var input: String
    input = readLine()!!

    //keluaran
    var output: String
    output = input + ", " + input + "!"

    //tampilkan program
    println(output)
}