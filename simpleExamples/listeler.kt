fun main(args: Array<String>) {
        /* içerisinde farklı türlerden veri barındırabilen listelerdir*/
    //unMutable Listeler -yapısı Değiştirilemez
        //listOf
        val myListOf= listOf(2,3,"Ahmet","Veli",25.5f,null)
        println(myListOf)
        println(myListOf.size)
        //myListOf[2]=5 içeriğinde değişiklik yapılamaz.

        //null değer yok sayılıyor
        val myListOfNotNull= listOfNotNull(2,3,"Ahmet","Veli",25.5f,null)
        println(myListOfNotNull)
        println(myListOfNotNull.size)

    //Mutable Listeler -yapısı Değiştirilebilir
        val myArrayListOf= arrayListOf("Ahmet", 1, 3.14,'A')
        myArrayListOf[0]="Mehmet" //Değişiklik yapılabilir
        myArrayListOf.add(25518.2F)//ekleme yapılabilir
        myArrayListOf.remove(3.14)//silme yapılabilir
        myArrayListOf.removeAt(0)
        println(myArrayListOf)

        val myMutableListOf= mutableListOf("Ahmet", 1, 3.14,'A')
        //arrayListOf ile ilgili tüm işlevleri aynıdır.

    //Ikı boyutlu Listeler
        val r0= arrayListOf("Ahmet", 1, 3.14,'A')
        val r1= arrayListOf("Mehmet", 10, 3,'A')
        val r2= arrayListOf("Veli", 8, 1.73,'z')

        val my2dList= arrayListOf(r0,r1,r2)
        my2dList[0].add("Sonradan Eklendi")
        println(my2dList)
}