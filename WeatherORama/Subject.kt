interface Subject {
    fun registerListener(l:Listener)
    fun removeListener(l:Listener)
    fun notifyListeners()
    fun setChanged()
}