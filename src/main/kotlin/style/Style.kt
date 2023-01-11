package style

import tornadofx.*

class Style : Stylesheet() {

    companion object {
        val leftBox by cssclass()
        val rightBox by cssclass()
    }

    init {
        leftBox {
            backgroundColor += c("#cecece")
            borderColor += box(c("#a1a1a1"))
        }

    }
}