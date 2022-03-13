fun main() {
    val remoteControl = RemoteControl()
    val livingRoomLight = Light("Living Room")
    val kitchenLight = Light("Kitchen")
    val garageDoor = GarageDoor("")
    val stereo = Stereo("living Room")

    val livingRoomLightOn = LightOnCommand(livingRoomLight)
    val livingRoomLightOff = LightOffCommand(livingRoomLight)
    val kitchenLightOn = LightOnCommand(kitchenLight)
    val kitchenLightOff = LightOffCommand(kitchenLight)
    val garageDoorOpen = GarageDoorOpenCommand(garageDoor)
    val garageDoorClose = GarageDoorCloseCommand(garageDoor)
    val stereoOnWithCd = StereoOnCommand(stereo)
    val stereoOff = StereoOffCommand(stereo)

    val partyOn = ArrayList<Command>()
    partyOn.add(livingRoomLightOn)
    partyOn.add(kitchenLightOn)
    partyOn.add(stereoOnWithCd)
    val partyOff = ArrayList<Command>()
    partyOff.add(livingRoomLightOff)
    partyOff.add(kitchenLightOff)
    partyOff.add(stereoOff)

    val partyOnMacro = MacroCommand(partyOn)
    val partyOffMacro = MacroCommand(partyOff)

    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff)
    remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff)
    remoteControl.setCommand(2, garageDoorOpen, garageDoorClose)
    remoteControl.setCommand(3, stereoOnWithCd, stereoOff)
    remoteControl.setCommand(6, partyOnMacro, partyOffMacro)

    remoteControl.onButtonWasPushed(0)
    remoteControl.offButtonWasPushed(0)
    remoteControl.undoButtonWasPushed()
    remoteControl.offButtonWasPushed(0)
    remoteControl.onButtonWasPushed(0)
    remoteControl.undoButtonWasPushed()
}