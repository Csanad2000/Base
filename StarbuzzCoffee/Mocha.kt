class Mocha(var beverage: Beverage) : CondimentDecorator() {
    init {
        description = beverage.description + ", Mocha"
    }

    override fun cost(): Double {
        return .20 + beverage.cost()
    }
}