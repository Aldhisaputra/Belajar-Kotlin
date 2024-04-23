/*
String merupakan tipe data yang mirip dengan Char.
Ia dapat digunakan untuk menyimpan nilai berupa teks.
Perbedaannya, String bisa menampung beberapa karakter di dalamnya
Kita bisa mendefinisikan variabel tersebut dengan tanda petik ganda (" ")
*/

fun main() {
    val text  = "Kotlin"
    for (char in text){
        print("$char ")
    }

    /*raw string
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    print(line)

     */

    //string tamplate
    val name = "Kotlin"
    val old = 19
    print("My name is $name, im $old years old")
}