class StereoOnCommand(var stereo: Stereo) : Command {
    override fun execute() {
        stereo.on()
        stereo.setCd()
        stereo.setVolume(11)
    }

    override fun undo() {
        stereo.off()
    }
}