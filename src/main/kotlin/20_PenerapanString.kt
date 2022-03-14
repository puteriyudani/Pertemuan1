fun main() {
    //program untuk mencari huruf konsonan, huruf vokal dan karakter lainnya dalam sebuah string

    //kalimat yang mau di analisis
    var s = "A programmer gets stuck in the shower because the instructions on the shampoo were: Lather, Wash, and Repeat."
    println(s)
    s = s.toLowerCase()

    //inisialisasi penghitung
    var vowelCount = 0
    var consonantCount = 0

    //deklarasi huruf vokal dan konsonan
    val vowels = "aeiouy"
    val consonants = "bcdfghjklmnpqrstvwxz"

    //pengulangan
    for (c in s){
        if (vowels.contains(c)) {
            vowelCount++
        } else if (consonants.contains(c)) {
            consonantCount++
        }
    }

    //tampilkan jumlah huruf vokal dan konsonan
    println("Vowels: $vowelCount")
    println("Consonants: $consonantCount")

    //tampilkan jumlah huruf lainnya (selain konsonan dan vokal)
    println("Other characters: ${s.length - (vowelCount + consonantCount)}")
}