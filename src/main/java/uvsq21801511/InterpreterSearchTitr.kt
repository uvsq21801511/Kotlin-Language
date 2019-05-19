package uvsq21801511

import java.io.IOException

class InterpreterSearchTitr(internal var i: Interpreter, internal var fileName: String) : Command {
    override fun execute() {
        i.SearchTitr(fileName)

    }
}
