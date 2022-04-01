
class SimpleThread: Thread() {
    public override fun run() {
        var i=0;
        while (true) {
            sleep(100)
            i++;
            println("$i,thread çalisti")
        }
    }
}