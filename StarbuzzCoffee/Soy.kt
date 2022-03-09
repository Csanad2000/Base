class Soy(var beverage: Beverage):CondimentDecorator() {

    init {
        description=beverage.description+", Soy"
    }

    override fun cost(): Double {
        return .15 + beverage.cost()
    }
}