/*Enum sınıfları, yönler, durumlar, modlar vb. Gibi sonlu bir farklı değerler kümesini temsil
eden türleri modellemek için kullanılır.
Aşagıdaki örnekte projenin tüm sınıflarında kullanılmak üzere geçereli bir State tanımı yapılmıştır


*/

enum class State {
    IDLE, RUNNING, FINISHED                           // 1
}

fun main() {
    val state = State.IDLE                         // 2
    val message = when (state) {                      // 3
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)
}