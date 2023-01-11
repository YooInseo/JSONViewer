package view

import javafx.scene.paint.Color
import tornadofx.Stylesheet
import tornadofx.c

class Styles : Stylesheet() {
    companion object {
        val dangerColor = c("#a94442")
        val hoverColor = c("#d49942")

    }

    init {

        root {
            button {
                backgroundColor += Color.GRAY

            }
        }
    }
}