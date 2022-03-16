class DessertMenu : Menu("DESSERTS", "A little extra joy") {
    val menuItems = ArrayList<MenuItem>()

    init {
        addItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla ice cream",
                true,
                1.59
        )
    }

    fun addItem(name: String, description: String, vegetarian: Boolean, price: Double) {
        menuItems.add(MenuItem(name, description, vegetarian, price))
    }

    override fun createIterator(): Iterator {
        return DessertMenuIterator(menuItems)
    }
}