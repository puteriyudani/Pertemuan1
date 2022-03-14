fun main() {
    //character di kotlin ditandai dengan memberikan single quotes ('') pada nilai sebuah variabel
    var chara : Char = 'a'
    //println(charA == 65) -> character tidak bisa diperlakukan secara langsung sebagai number

    //character memiliki fungsi anggota seperti isLowerCase(), isDigit(),toUpperCase(), toLowerCase(), toString() dan lainnya
    var charA : Char = 'A'
    println(charA.isUpperCase())
    println(charA.isLowerCase())
    println(charA.isDigit())
    println(charA.toLowerCase())

    //toString
    val strA : String = charA.toString()
    println("Kini charA sudah menjadi String = $strA")
}