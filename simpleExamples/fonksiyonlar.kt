import java.util.ArrayList

fun toplama(a:Int, b:Int,s:String="DefaultParam"):Int{
    println(s)
    val sonuc=a+b
    return sonuc //return Int
}

//overloadign
fun toplama(a:Int, b:Int,c:Int):Int{
    var sonuc=a+b
    sonuc=sonuc+c
    return sonuc//return Int
}

fun returnArray():Array<Int>{
    val retVal= arrayOf(1,2,3,4)
    return retVal//return int array
}

fun paramArrayFunc(a:Array<String>){
    println(a[0])
    println(a[1])
//nonReturn
}

fun returnList():List<Int>{
    val retVal= arrayListOf(1,2,3,4)
    return retVal//return List
}

fun main(args: Array<String>) {
    println(toplama(25,15))
    println(toplama(25,15,"Set Param"))
    println(toplama(1,2,3))//func overloading
    val retValArray=returnArray()
    println(retValArray[2])
    val setParamString= arrayOf("Merhaba","Kotlin")
    paramArrayFunc(setParamString)//pass array arg
    val retValList=returnList()
    println(retValList[2])
}
