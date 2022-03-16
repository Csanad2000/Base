open class Menu(var name: String, var description: String) : MenuComponent() {
    val menuComponents = ArrayList<MenuComponent>()
    var iterator: Iterator? = null

    override fun add(menuComponent: MenuComponent) {
        menuComponents.add(menuComponent)
    }

    override fun remove(menuComponent: MenuComponent) {
        menuComponents.remove(menuComponent)
    }

    override fun getChild(index: Int): MenuComponent {
        return menuComponents[index]
    }

    override fun readName(): String {
        return name
    }

    override fun readDescription(): String {
        return description
    }

    override fun print() {
        println("\n " + readName())
        println(readDescription() + "\n")

        val iterator = menuComponents.iterator()
        while (iterator.hasNext()) {
            iterator.next().print()
        }
    }

    override fun createIterator(): Iterator {
        if (iterator == null) {
            iterator = CompositeIterator(MenuComponentIterator(menuComponents))
        }
        return iterator as Iterator
    }
}