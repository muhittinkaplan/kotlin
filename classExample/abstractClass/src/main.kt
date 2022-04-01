abstract class MyAbstractClass(){
    abstract var name:String
    abstract var age:Int

    var location:String="Adana"//abstract yoksa tanımlama başlangıç değeri olmalı

    init {
        println("abstractClass")
    }

    fun bilgileriYazdir(){//abstrack sınıf içinde normal fonksiyonlar normal şekilde oluşturulurur
        println("adi $name , yas $age , memleket $location")
    }

    abstract fun son()

}

//Soyut bir sınıfı override etmek
class MainClass(override var name:String,override var age:Int):MyAbstractClass(){

    //soyut sınıf içindeki fonksiyonu override etmek
    override fun son(){
        println("Yakarsa Dünyayı Garipler yakar")
    }
}

fun main(args: Array<String>) {
    var myStartClass=MainClass("muhittin",42)
    myStartClass.bilgileriYazdir()//Kalıtımdan dolayı abstracct olan sınıf içindeki fonksiyonu çağırdık
    myStartClass.son()//main class içindeki override edilmiş fonksiyonu çağırdık
}