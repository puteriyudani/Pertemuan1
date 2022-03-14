fun main() {
    //template string diawali dengan tanda dollar ($)
    //diikuti oleh nama variabel yang akan digabungkan kedalam suatu string
    val a = 7
    val b = 8
    val c = a + b
    val s = "When we add $a and $b, we get $c"
    println(s)

    //tampilkan menggunakan string templates
    println("When we add $a and $b, we get ${a+b}")

    //contoh menggunakan triple quotes
    //karakter dolar ('$') tidak bisa dicetak menggunakan escape character
    val price = """
        ${'$'}9.99
    """
    println(price)
}