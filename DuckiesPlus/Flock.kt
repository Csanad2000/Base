class Flock:Quackable{
    val quackers=ArrayList<Quackable>()

    fun add(quacker:Quackable){
        quackers.add(quacker)
    }

    override fun quack(){
        val iterator=quackers.iterator()
        while(iterator.hasNext()){
            val quacker=iterator.next()
            quacker.quack()
        }
    }

    override fun registerObserver(observer:Observer){
        val iterator=quackers.iterator()
        while(iterator.hasNext()){
            val quacker=iterator.next()
            quacker.registerObserver(observer)
        }
    }

    override fun notifyObservers(){
        /*val iterator=quackers.iterator()
        while(iterator.hasNext()){
            val quacker=iterator.next()
            quacker.notifyObservers()
        }*/
    }
}