class MacroCommand(val commands: ArrayList<Command>) : Command {
    override fun execute() {
        for (i in commands) {
            i.execute()
        }
    }

    override fun undo() {
        for (i in commands) {
            i.undo()
        }
    }
}