fun main(){
    //IF
    val a:Int=20
    if (a<15){
        println("Sayı 15 den güçük")
    }else if (a==15){
        println("Sayı 15 eeşit")
    }else{
        println("Sayı 15 eşit yada küçük değil")
    }

    //When  like selectCase, switch case
    when (a) {
        9 -> println("Sayı 9")
        1 -> println("sayi 1")
        in (10..20)->println("sayi 10 ile 20 arasında")
        else -> println("multiple digits")
    }

}