fun main() {
    //untuk literal number penunjukan nilai (boxing) pada sebuah variabel tidak akan berpengaruh pada identitas suatu variabel

    //deklarasi variabel a
    val a: Int = 10000
    //tampilkan apakah variabel a identik dengan variabel a
    //menggunakan operator boolean
    println("a apakah identik dengan a atau a === a : " + (a === a))

    //deklarasi variabel boxedA dan anotherBoxedA
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    //tampilkan apakah variabel boxedA identik dan apakah nilainya sama dengan anotherBoxedA
    println("boxedA apakah identik dengan anotherBoxedA atau boxedA === anotherBoxedA : " + (boxedA === anotherBoxedA))
    println("boxedA apakah memiliki nilai yang sama dengan anotherBoxedA atau boxedA == anotherBoxedA : " + (boxedA == anotherBoxedA))
}