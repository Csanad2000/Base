public abstract class Duck{
    var flyBehavior:FlyBehavior
    var quackBehavior:QuackBehavior

    public abstract fun display()
    public fun performFly(){
        flyBehavior.fly()
    }
    public fun performQuack(){
        quackBehavior.quack()
    }
    public fun swim(){
        println("All ducks float, even decoys!")
    }
}