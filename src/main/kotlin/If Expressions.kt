/*
If expression direpresentasikan dengan kata kunci if.
If akan kita perlukan untuk menyelesaikan kasus di atas,
dimana if akan digunakan untuk menguji suatu kondisi untuk menjalankan sebuah proses
If akan mengeksekusi sebuah statement atau expression jika hasil evaluasi dari expressions yang
diberikan pada blok if bernilai true. Sebaliknya,
jika bernilai false maka proses yang ditentukan akan dilewatkan.
*/

fun main(){
    val openHours = 7
    val now = 7
    val office: String
    office = if (now > 7) {
        "Office already open"
    } else if (now == openHours){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    print(office)
}