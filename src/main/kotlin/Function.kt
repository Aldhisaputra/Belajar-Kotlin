/*
Function sendiri bisa diartikan sebagai cara sederhana untuk mengatur program buatan kita.
Pendeklarasian fungsi pada Kotlin diawali dengan kata kunci (fun) kemudian dilanjutkan dengan nama fungsinya
*/

// Deklarasi fungsi
fun main() {
    greet("John") // Output: Hello, John!
}

fun greet(name: String) {
    println("Hello, $name!")
}
