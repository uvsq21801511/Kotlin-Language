package uvsq21801511

import java.io.IOException

class InterpreterLs(internal var i: Interpreter) : Command {
    override fun execute() {
        i.Ls()
    }
}
