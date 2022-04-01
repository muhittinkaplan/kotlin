import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JOptionPane
class myFrame2(){

    var jFrame: JFrame = JFrame("Pencere Basligi 2")
    var jButton: JButton =JButton()

    init {

        this.jButton.addActionListener { _butonClick("Merhaba", this.jFrame) }
        this.jButton.setBounds(10, 100, 100, 50)
        this.jButton.setText("Merhaba")
        this.jFrame.defaultCloseOperation = JFrame.DISPOSE_ON_CLOSE
        this.jFrame.add(jButton)
        this.jFrame.setSize(400, 400)
        this.jFrame.setLayout(null)
        this.jFrame.setVisible(true)
    }
    fun _butonClick(a: String, frame: JFrame){
        println("$a Butona Tıklandı")
        JOptionPane.showMessageDialog(frame, "Eggs are not supposed to be green.")



        //println(result.toString())
    }
}


class myFrame1(){

        var jFrame: JFrame = JFrame("Pencere Basligi 1")
        var jButton: JButton =JButton()

    init {

        this.jButton.addActionListener { _butonClick("Merhaba", this.jFrame) }
        this.jButton.setBounds(10, 100, 100, 50)
        this.jButton.setText("Merhaba")
        this.jFrame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        this.jFrame.add(jButton)
        this.jFrame.setSize(400, 400)
        this.jFrame.setLayout(null)
        this.jFrame.setVisible(true)
    }
    fun _butonClick(a: String, frame: JFrame){
        println("$a Butona Tıklandı")

        val n = JOptionPane.showConfirmDialog(frame,"Yeni Pencere Açılsın mı?", "Soru Penceresi", JOptionPane.YES_NO_OPTION)
        if (n==0){
            var pencere2=myFrame2()
        }else{
            println("hayır a basıldı")
        }
    }
}

fun main(args: Array<String>) {
    var myGui=myFrame1()

}
