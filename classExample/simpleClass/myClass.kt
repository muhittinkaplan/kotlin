class myClass(uzunluk:Int) {
    var stringLeght=uzunluk

    init {
        println("MyClass Dosyası çalıştı")

    }
    fun stringManiplation(par:String):String{
        var localString=par.substring(0,this.stringLeght)
        return (localString)
    }
}