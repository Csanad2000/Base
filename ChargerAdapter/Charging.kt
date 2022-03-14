fun main() {
    val plug: USPlug = MyPlug()
    val adapter: EUPlug = USToEUAdapter(plug)
    val socket = EUSocket(adapter)
}