fun main() {
    val player = Player()
    val tv = TV()
    val speakers = Speakers()

    val facade = Facade(player, tv, speakers)

    facade.on()
    facade.play()
    facade.pause()
    facade.off()
}