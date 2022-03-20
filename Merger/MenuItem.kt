open class MenuItem(
        var name: String,
        var description: String,
        var vegetarian: Boolean,
        var price: Double
) : MenuComponent() {
    override fun readName(): String {
        return name
    }

    override fun readDescription(): String {
        return description
    }

    override fun readVegetarian(): Boolean {
        return vegetarian
    }

    override fun readPrice(): Double {
        return price
    }

    override fun print() {
        print(" " + readName())
        if (readVegetarian()) {
            print("(v)")
        }
        println(", " + readPrice())
        println(readDescription())
    }

    override fun printVegetarian(){
        if (readVegetarian()) {
            print(" " + readName())
            print("(v)")
            println(", " + readPrice())
            println(readDescription())
        }
    }

    override fun createIterator(): Iterator {
        return NullIterator()
    }
}