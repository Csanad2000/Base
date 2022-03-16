class Waitress(val allMenus: MenuComponent) {
    fun printMenu() {
        allMenus.print()
    }

    fun printVegetarianMenu() {
        val iterator = allMenus.createIterator()
        println("\n VEGETARIAN MENU\n")
        while (iterator.hasNext()) {
            var menuComponent = iterator.next()
            try {
                if (menuComponent?.readVegetarian() == true) {
                    menuComponent.print()
                }
            } catch (e: UnsupportedOperationException) {}
        }
    }
}