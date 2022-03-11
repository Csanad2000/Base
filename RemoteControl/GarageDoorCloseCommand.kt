class GarageDoorCloseCommand(var garageDoor: GarageDoor):Command {
    override fun execute() {
        garageDoor.down()
    }

    override fun undo() {
        garageDoor.up()
    }
}