package Soal1.Source

class Nomor5<T, U, V> (val Toko: T, val Barang: U, val Harga: V) {
    fun welcome(sapapelanggan: String = "Halo, selamat datang "): String {
        return "$sapapelanggan di $Toko, Toko kami menjual $Barang berkualitas tinggi yang dijual mulai dari harga Rp %.2f".format(Harga)
    }
}