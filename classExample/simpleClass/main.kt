class MainClass {
    init {

    }
    fun faktoriyel(a:Int):Long{
        var f:Long=1
        for (i in 1..a){
            f=f*i
        }
        return (f)
    }
}
fun main(args: Array<String>) {
    var myMainClass=MainClass()
    val sonuc=myMainClass.faktoriyel(10)
    println(sonuc)

    var myStringManiplator=myClass(3)
    val myString=myStringManiplator.stringManiplation("StringArg")
    println(myString)
}
