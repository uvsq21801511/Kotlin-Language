package uvsq21801511

import java.io.IOException

class InterpreterView(internal var i: Interpreter, ent: Entrance) : Command {
    internal var fileName: String


    init {
        this.fileName = ent.fileName
    }

    override fun execute() {
        try {
            i.View(this)
        } catch (e: IOException) {
            e.printStackTrace()
        }

    }
}

