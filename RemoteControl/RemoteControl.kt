class RemoteControl {
    var noCommand=NoCommand()
    val onCommands=ArrayList<Command>(7)
    val offCommands=ArrayList<Command>(7)
    var undoCommand:Command=NoCommand()

    init {
        for (i in 0..6){
            onCommands.add(noCommand)
            offCommands.add(noCommand)
        }
    }

    fun setCommand(slot:Int,onCommand:Command,offCommand:Command){
        onCommands[slot]=onCommand
        offCommands[slot]=offCommand
    }

    fun onButtonWasPushed(slot:Int){
        onCommands[slot].execute()
        undoCommand=onCommands[slot]
    }

    fun offButtonWasPushed(slot:Int){
        offCommands[slot].execute()
        undoCommand=offCommands[slot]
    }

    fun undoButtonWasPushed(){
        undoCommand.undo()
    }
}