fun main() {
    //membaca atau mengkonversi sebuah input text String berbentuk sandi Morse kedalam plain teks

    //split() dan joinToString()
    //morse dan decoder
    //string yang ingin kita decode
    val s = ".. -.-. - ... --- -.-. .. .- .-.."
    println("The original message: $s")

    //string dengan pesan yang diterjemahkan (decoded)
    var message = ""

    //deklarasi variabel alphabet dan morse
    val alphabetChars = "abcdefjhijklmnopqrstuvwxyz"
    val morseChars = arrayOf(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..")

    //split (membelah) string menjadi karakter morse
    val characters = s.split(" ")

    //mengulangi karakter morse
    for (morseChar in characters) {
        val index = morseChars.indexOf(morseChar)
        //karakter ditemukan
        if (index != -1) {
            message += alphabetChars[index]
        }
    }

    //tampilkan program
    println("The decoded message: $message")
}