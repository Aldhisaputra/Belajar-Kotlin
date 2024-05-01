/*
Varargs (Variable Arguments) adalah sebuah fitur dalam beberapa bahasa pemrograman yang
memungkinkan sebuah fungsi atau metode menerima jumlah argumen yang berubah-ubah saat dipanggil.
*/

fun printNames(vararg names: String) {
    println("Names:")
    for (name in names) {
        println(name)
    }
}

fun main() {
    // Memanggil fungsi printNames dengan jumlah argumen yang bervariasi
    printNames("John", "Doe", "Jane")
    printNames("Alice", "Bob", "Charlie", "David")
}
