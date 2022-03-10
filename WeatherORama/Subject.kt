interface Subject {
    fun registerListener(listener: Listener)
    fun removeListener(listener: Listener)
    fun notifyListeners()
    fun setChanged()
}
