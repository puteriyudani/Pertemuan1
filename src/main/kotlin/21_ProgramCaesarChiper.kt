fun main() {
    //mengenkripsi sebuah input text String yang diberikan kedalam karakter yang dinaikan atau diturunkan

    //deklarasi (inisiasi) variabel
    val s = "blackholesarewheregoddividedbyzero"
    println("Original message:$s")
    var message = ""
    var shift = 1

    //pengulangan iterasi di atas karakter
    for (c in s) {
        var i = c.toInt()
        i += shift
        if (i > 'z'.toInt()) {
            i -= 26
        }
        val char = i.toChar()
        message += char
    }

    //tampilkan program
    println("Encrypted message: $message")
}