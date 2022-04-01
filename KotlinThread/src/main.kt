import java.lang.Thread.sleep

class SimpleRunnable: Runnable {
    public override fun run() {
        var i=0;
        while (true){
            i++
            println("$i, ----Runnable çalıştı")
            sleep(50)
        }
    }
}
fun main(){
    val thread = SimpleThread()
    thread.start()

    val threadWithRunnable = SimpleRunnable()
    threadWithRunnable.run()

    println("Main Çalıştı")
}
