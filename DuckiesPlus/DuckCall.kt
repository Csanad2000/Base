class DuckCall:Quackable{
    val observable=Observable(this)

    override fun quack(){
        println("Kwak")
        notifyObservers()
    }

    override fun registerObserver(observer:Observer){
        observable.registerObserver(observer)
    }

    override fun notifyObservers(){
        observable.notifyObservers()
    }
}