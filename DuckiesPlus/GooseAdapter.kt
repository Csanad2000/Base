class GooseAdapter(val goose:Goose):Quackable{
    val observable=Observable(this)
    
    override fun quack(){
        goose.honk()
        notifyObservers()
    }

    override fun registerObserver(observer:Observer){
        observable.registerObserver(observer)
    }

    override fun notifyObservers(){
        observable.notifyObservers()
    }
}