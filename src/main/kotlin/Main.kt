import style.Style
import tornadofx.App
import tornadofx.importStylesheet
import tornadofx.launch
import view.Styles

class MyApp : App(MainView::class, Style::class){
    init {
        // Import a file based stylesheet
        importStylesheet("/style.css")

        // Import a type safe stylesheet
        importStylesheet(Styles::class)
    }
}

fun main(args: Array<String>) {

    launch<MyApp>(args)
}

