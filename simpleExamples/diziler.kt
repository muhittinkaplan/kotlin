import java.util.ArrayList

fun main(args: Array<String>) {
        //Array
        val diziBoyutu:Int=10
        val myArray=Array<Int>(diziBoyutu){0}//Dizi Boyutu sonradan değiştirilemez, Tip veri tip tutabilir.
        for (i in myArray){
            println(i)
        }
        val size=myArray.size
        myArray[4]=5217// değeri değiştirelim
        myArray.set(9,11)
        val e4=myArray.get(4)

        println("Dizi Boyutu :$size")
        println("5.(4.index) eleman :$e4")
        val intArr = IntArray(5)// Int Türünde 5 elemanlı bir dizi [0, 0, 0, 0, 0]
        println(intArr[3])

        //arrayOf
        //Öneri ArrayOf un kullanılmasıdır
        val myArrayOf = arrayOf(1, 2, 3)
        //val nums = intArrayOf(1, 2, 3, 4, 5) türkçe kullanımda bu komutta hatavar -- https://youtrack.jetbrains.com/issue/KT-43405
        val myDoubleArray= doubleArrayOf(12.8,11.5)
        println(myArrayOf[2]+myDoubleArray[1])

        //iki boyutlu dizi
        val r1= arrayOf(2, 4, 6)
        val r2= arrayOf(1, 3, 5)
        val r3=arrayOf("T")
        val my2DArray= arrayOf(r1, r2,r3)
        println(my2DArray.size)
        println(my2DArray[2][0])
}
