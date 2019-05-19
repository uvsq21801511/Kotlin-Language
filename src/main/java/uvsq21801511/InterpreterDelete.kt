package uvsq21801511

import java.io.IOException

class InterpreterDelete(internal var i: Interpreter, ent: Entrance) : Command {

    internal var fileName = ""

    init {
        this.fileName = ent.fileName
    }

    override fun execute() {
        i.DeleteFile(this)
    }
}
