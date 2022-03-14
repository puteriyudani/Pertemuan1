fun main() {
    //string merupakan kumpulan karakter (array dari karakter) dan bersifat statis
    //elemen string dapat diakses dengan operasi indeks array
    val myName: String = "Puteri Yudani"
    for (chr in myName){
        print(chr)
    }
    print('\n')

    //menggabungkan string dengan tipe data lain dengan menggunakan operator +
    val s = "abc" + 1
    println(s + "def")

    //raw string dengan triple quotes (""") untuk menyimpan data string yang memuat keywords Kotlin
    var text = """
        for (c in "foo)
            print(c)
    """
    println(text)

    //menghapus spasi yang tidak diperlukan dalam raw string
    var kalimat = """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Benjamin Franklin)
    """.trimMargin()
    println(kalimat)
}