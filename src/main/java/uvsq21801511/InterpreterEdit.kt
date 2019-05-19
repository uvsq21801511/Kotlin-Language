package uvsq21801511

import java.io.IOException

class InterpreterEdit(internal var i: Interpreter, ent: Entrance) : Command {
    internal var fileName: String
    internal var name: String
    internal var mail: String
    internal var project: String
    internal var context: String

    init {
        this.fileName = ent.fileName
        this.name = ent.name
        this.mail = ent.mail
        this.project = ent.project
        this.context = ent.context
    }

    override fun execute() {
        try {
            i.edit(this)
        } catch (e: IOException) {
            e.printStackTrace()
        }

    }
}
