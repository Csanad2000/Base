class MallardDuck(
        override var quackBehavior: QuackBehavior = Quack(),
        override var flyBehavior: FlyBehavior = FlyWithWings()
) : Duck() {
    // override var quackBehavior: QuackBehavior = Quack()
    // override var flyBehavior: FlyBehavior = FlyWithWings()

    override fun display() {
        println("I'm a Mallard duck")
    }
}