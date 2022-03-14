class Facade(val player: Player, val tv: TV, val speakers: Speakers) {
    fun on() {
        player.on()
        tv.on()
        speakers.on()
        speakers.setVolume(7)
    }

    fun off() {
        pause()
        speakers.off()
        tv.off()
        player.off()
    }

    fun play() {
        player.play()
    }

    fun pause() {
        player.pause()
    }
}