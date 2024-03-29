//Kumpulan data yang jenisnya sama
fun main(){
    val name: Array<String> = arrayOf("adi","ali","abi","ari")
    name.set(1,"ubi")
    println(name[1])
    println(name[0])

    val age: Array<Int> = arrayOf(15,16,17,18)
    age.set(2,24)
    println(age[0])
    println(age[2])


}