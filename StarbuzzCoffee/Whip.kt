class Whip(var beverage: Beverage):CondimentDecorator() {

    init {
        description=beverage.description+", Whip"
    }

    override fun cost(): Double {
        return .10 + beverage.cost()
    }
}