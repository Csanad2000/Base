class Waitress(val allMenus: MenuComponent) {
    fun printMenu() {
        allMenus.print()
    }

    fun printVegetarianMenu() {
        println("\n VEGETARIAN MENU\n")
        allMenus.printVegetarian()
    }
}