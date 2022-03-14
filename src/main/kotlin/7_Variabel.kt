fun main() {
    //variabel di deklarasikan agar dapat di operasikan
    //variabel memiliki nilai didalamnya
    //variabel terdiri dari statis dan dinamis

    //tipe dinamis bisa di ubah
    var dinamis = "hore"
    println(dinamis)

    //tipe statis sudah ditetapkan, tidak bisa di ubah
    //tipe statis tidak disarankan
    var statiss: Double = 2.0
    println(statiss)

    var statis = 2.0
    println(statis)

    //tipe variabel harus sama, jika beda maka akan error
    statis = 3.0
    println(statis)
    //statis = 5 -> error
}