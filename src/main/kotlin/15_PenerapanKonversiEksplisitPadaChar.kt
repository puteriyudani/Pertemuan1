fun main() {
    //konversi sebuah character kedalam nilai ASCII
    var c : Char
    var i : Int
    c = 'a'
    i = c.toInt()

    //tampilkan bahwa character sudah dikonversikan kedalam nilai ASCII
    println("The character $c was converted to its ASCII value of $i")

    //konversi nilai ASCII kedalam character
    i = 98
    c = i.toChar()

    //tampilkan bahwa nilai ASCII sudah dikonversikan kedalam character
    println("The ASCII value of $i was converted to its textual value of $c")
}