class PancakeHouseMenu : Menu("BREAKFAST", "Meals full of energy to start the day well") {
    val menuItems = ArrayList<MenuItem>()

    init {
        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs and toast", false, 2.99)
    }

    fun addItem(name: String, description: String, vegetarian: Boolean, price: Double) {
        menuItems.add(MenuItem(name, description, vegetarian, price))
    }

    override fun createIterator(): Iterator {
        return PancakeHouseMenuIterator(menuItems)
    }
}