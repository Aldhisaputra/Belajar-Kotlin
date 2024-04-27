/*
safe call akan menjamin kode yang kita tulis aman dari NullPointerException.
Dalam menggunakan safe call, kita akan mengganti tanda titik (.) dengan tanda (?.)
saat mengakses atau mengelola nilai dari objek nullable
*/

/*
Elvis operator memungkinkan kita untuk menetapkan default
value atau nilai dasar jika objek bernilai null.
*/

fun main() {
    val str: String? = null
    //safe call
    val length: Int? = str?.length
    //elvis operator
    val lengt = str?.length?: -1
    println("Panjang string: $length")
    println("Panjang string: $lengt")

}

