class GarageDoorOpenCommand(var garageDoor: GarageDoor) : Command {
    override fun execute() {
        garageDoor.up()
    }

    override fun undo() {
        garageDoor.down()
    }
}