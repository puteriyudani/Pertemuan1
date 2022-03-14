fun main() {
    //underscore membantu programmer untuk memudahkan dalam membaca digit angka
    var angka = 100_000_000_000
    println(angka)

    //contoh lain
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    //tampilkan variabel menggunakan string template
    println("oneMillion = $oneMillion")
    println("creditCardNumber = $creditCardNumber")
    println("socialSecurityNumber = $socialSecurityNumber")
    println("hexBytes = $hexBytes")
    println("bytes = $bytes")
}