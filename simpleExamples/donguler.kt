fun main(){
    //for dongusu
    for(i in 0..15){
        println(i)
    }
    //for dongusu dizilerle kullanmak
    val myArray= arrayOf("A","B","C","D","E")
    for (i in myArray){
        print(i+" ")
    }

    //while döngüsü
    println("")
    var myValue:Int=0
    while (myValue<100){
        print(myValue)
        myValue +=1
    }

    //repeat    
    repeat(3) {
        println("Selam Sana Büyük Adam")
    }

}
