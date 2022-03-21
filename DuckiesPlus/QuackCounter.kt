class QuackCounter(val duck:Quackable):Quackable{
    override fun quack(){
        duck.quack()
        number++
    }

    override fun registerObserver(observer:Observer){
        duck.registerObserver(observer)
    }

    override fun notifyObservers(){
        duck.notifyObservers()
    }

    companion object{
        var number=0
    }
}