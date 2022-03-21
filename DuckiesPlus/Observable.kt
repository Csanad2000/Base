class Observable(val duck:QuackObservable):QuackObservable{
    val observers=ArrayList<Observer>()

    override fun registerObserver(observer:Observer){
        observers.add(observer)
    }

    override fun notifyObservers(){
        val iterator=observers.iterator()
        while(iterator.hasNext()){
            val observer=iterator.next()
            observer.update(duck)
        }
    }
}