class MallardDuck:Quackable{
    val observable=Observable(this)

    override fun quack(){
        println("Quack")
        notifyObservers()
    }

    override fun registerObserver(observer:Observer){
        observable.registerObserver(observer)
    }

    override fun notifyObservers(){
        observable.notifyObservers()
    }
}