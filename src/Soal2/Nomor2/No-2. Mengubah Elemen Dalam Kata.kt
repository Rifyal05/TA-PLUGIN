package Soal2.Nomor2

fun mengubahELemenKata(kata: String): String {
    return kata.replace(Regex("o"),"a")
}

fun main() {
    val kataAsli = "Purwokerto"
    val kataBaru = mengubahELemenKata(kataAsli)
    println("Kata Sebelumnya: $kataAsli")
    println("Kata Setelah Di Ubah: $kataBaru")
}
