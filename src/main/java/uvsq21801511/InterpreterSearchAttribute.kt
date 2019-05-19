package uvsq21801511

import java.io.IOException

class InterpreterSearchAttribute(internal var i: Interpreter, ent: Entrance) : Command {
    internal var fileName: String
    internal var setSearchStr: String

    init {
        this.fileName = ent.fileName
        this.setSearchStr = ent.searchStr

    }

    override fun execute() {
        i.SearchAtr(this)
    }
}
