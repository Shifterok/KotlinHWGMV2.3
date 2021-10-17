fun main(){
    println("Наш пользователь каждый месяц покупает пластинки? (да/нет)")
    val areHeSheMusicLover = readLine()

    val discount = true
    when(areHeSheMusicLover == "да"){
        false -> val discountPrice = 10
        true -> val discountPrice = 1.01
    }
    println ("Ваша сикдка - ${discountPrice}")
}