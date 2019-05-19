package uvsq21801511

class CommandInvoker {
    internal lateinit var command: Command
    fun placeOrder(command: Command) {
        this.command = command
        this.command.execute()
    }
}
