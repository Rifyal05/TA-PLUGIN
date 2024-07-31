fun main() {
    val mataPelajaran = listOf("Bahasa Indonesia", "Bahasa Inggris", "Matematika", "IPA")
    val nilaiMap = mutableMapOf<String, Int>()

    println("Masukan Nilai Untuk Setiap Matkul")
    println("---------------------------------")
    for (mapel in mataPelajaran) {
        var nilai: Int?
        do {
            print("Nilai $mapel: ")
            nilai = readLine()?.toIntOrNull()
            print("---------------------------------\n")

            if (nilai == null) {
                println("Input tidak valid. Masukkan angka.")
            }
        } while (nilai == null)
        nilaiMap[mapel] = nilai
    }

    // Hitung rata-rata
    val totalNilai = nilaiMap.values.sum()
    val rataRata = totalNilai.toDouble() / nilaiMap.size

    // Tentukan grade
    val grade = when {
        rataRata >= 90 -> "A"
        rataRata >= 80 -> "B"
        rataRata >= 70 -> "C"
        rataRata >= 60 -> "D"
        else -> "E"
    }

    // Output hasil
    println("---------------------------------")
    println("Hasil UN:")
    println("---------------------------------")
    nilaiMap.forEach { (mataPelajaran, nilai) ->
        println("$mataPelajaran:$nilai")
    }
    println("---------------------------------")
    print("Rata-rata : $rataRata")
    println("Grade: $grade")
    println("---------------------------------")
}
