public class MallardDuck:Duck{
    public fun MallardDuck(){
        quackBehavior=Quack()
        flyBehavior=FlyWithWings()
    }

    override public fun display(){
        println("I'm a Mallard duck")
    }
}