/*
Boolean adalah sebuah tipe data yang hanya memiliki dua nilai, yaitu true dan false.
*/

fun main(){
    val officeOpen = 7
    val officeClosed = 16
    val now = 10

    val isOpen = if (now >= officeOpen && now <= officeClosed){
        true
    } else {
        false
    }

    print("Office is open : $isOpen")
}