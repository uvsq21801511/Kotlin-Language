package uvsq21801511

import java.io.IOException

class InterpreterSearch(internal var i: Interpreter, ent: Entrance) : Command {
    internal var fileName: String

    init {
        this.fileName = ent.fileName
    }

    override fun execute() {
        i.SearchFile(this)
    }
}
