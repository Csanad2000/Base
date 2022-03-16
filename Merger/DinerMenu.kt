class DinerMenu : Menu("DINNER", "A selection of hearty meals") {
    val MAX_ITEMS = 6
    var numberOfItems = 0
    val menuItems = Array<MenuItem?>(MAX_ITEMS) { null }

    init {
        addItem(
                "Vegetarian BLT",
                "(Fakin') Bacon with lettuce and tomato on whole wheat",
                true,
                2.99
        )
    }

    fun addItem(name: String, description: String, vegetarian: Boolean, price: Double) {
        if (numberOfItems >= MAX_ITEMS) {
            println("Menu is full, can't add item to menu.")
        } else {
            menuItems[numberOfItems++] = MenuItem(name, description, vegetarian, price)
        }
    }

    override fun createIterator(): Iterator {
        return DinerMenuIterator(menuItems)
    }
}