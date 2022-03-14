fun main() {
    //bilangan bulat

    //8 bit
    val minByte: Byte = -128
    val maxByte: Byte = 127
    //nilai maksimal tipe data Byte adalah 127, jika lebih maka akan terjadi error
    //val maxByte: Byte = 128 -> error

    //16 bit
    val minShort: Short = -32768
    val maxShort: Short = 32767

    //32 bit
    val minInt: Int = -2147483648
    val maxInt: Int = 2147483647

    //64 bit
    val minLong: Long = -9223372036854775807
    val maxLong: Long = 9223372036854775807

    //tampilkan variabel menggunakan string template
    println("minByte:$minByte")
    println("maxByte:$maxByte")
    println("minShort:$minShort")
    println("maxShort:$maxShort")
    println("minInt:$minInt")
    println("maxInt:$maxInt")
    println("minLong:$minLong")
    println("maxLong:$maxLong")

    //bilangan desimal

    //float
    val maxFloat: Float = 9.123456789f

    //double
    val maxDouble: Double = 9.123456789

    //tampilkan variabel menggunakan string template
    println("maxFloat:$maxFloat")
    println("maxDouble:$maxDouble")
}