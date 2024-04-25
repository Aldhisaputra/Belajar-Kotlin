/*
* sebuah variabel yang belum diinisialisasi atau variabel yang bernilai null
* tanda ? menentukan tipe dari objek tersebut.
* kompiler akan mengizinkan kita untuk mengelola nilai dari sebuah variabel yang kita tandai sebagai nullable dengan if/else
*/

fun main(){

    var obj: Any = "Dicoding"

    if(obj is String) {
        // Tidak membutuhkan casting secara eksplisit.
        println("String length is ${obj.length}")
    }
}