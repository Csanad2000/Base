class USToEUAdapter(val usPlug: USPlug) : EUPlug {
    override fun charge() {
        usPlug.charge()
    }
}