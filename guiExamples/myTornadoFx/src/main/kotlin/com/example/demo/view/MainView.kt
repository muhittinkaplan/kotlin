package com.example.demo.view

import com.example.demo.app.Styles
import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*

class MainView : View("Hello TornadoFX") {
    override val root = hbox {
        label(title) {
            addClass(Styles.heading)
        }
        button("Click Me") {
            addClass(Styles.heading)
            //inline CSS
            style {
                fontWeight = FontWeight.EXTRA_BOLD
                borderColor += box(
                        top = Color.RED,
                        right = Color.DARKGREEN,
                        left = Color.ORANGE,
                        bottom = Color.PURPLE
                )
                //rotate = 45.deg
            }
            setOnAction { println("You pressed the button") }
        }
    }
}