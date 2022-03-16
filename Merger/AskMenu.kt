fun main() {
    val pancakeHouseMenu: MenuComponent = PancakeHouseMenu()
    for (item in PancakeHouseMenu().menuItems) {
        pancakeHouseMenu.add(item)
    }
    val dinerMenu: MenuComponent = DinerMenu()
    for (item in DinerMenu().menuItems) {
        if (item != null) {
            dinerMenu.add(item)
        }
    }
    val dessertMenu: MenuComponent = DessertMenu()
    for (item in DessertMenu().menuItems) {
        dessertMenu.add(item)
    }

    val allMenus: MenuComponent = Menu("ALL MENUS", "All menus combined")
    allMenus.add(pancakeHouseMenu)
    allMenus.add(dinerMenu)

    dinerMenu.add(dessertMenu)

    val waitress = Waitress(allMenus)
    waitress.printMenu()
    waitress.printVegetarianMenu()
}