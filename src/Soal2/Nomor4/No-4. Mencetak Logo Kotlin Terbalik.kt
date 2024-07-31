package Soal2.Nomor4

fun main() {
    val jumlah = 6

    for (i in 0..<jumlah) {
        for (j in 0..<jumlah) {
            if (j >= i) {
                print("* ")
            } else {
                print("  ")
            }
        }
        println()
    }

    for (i in 0..<jumlah) {
        for (j in 0..<jumlah) {
            if (j >= jumlah - i - 1) {
                print("* ")
            } else {
                print("  ")
            }
        }
        println()
    }
}
