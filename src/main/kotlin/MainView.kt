import tornadofx.*

class MainView : View() {
    override val root = borderpane {
        title = "JSON Viewer"
        setPrefSize(900.0, 620.0)
    }
}

