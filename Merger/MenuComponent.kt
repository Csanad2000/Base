abstract class MenuComponent {
    open fun add(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()
    }

    open fun remove(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()
    }

    open fun getChild(index: Int): MenuComponent {
        throw UnsupportedOperationException()
    }

    open fun readName(): String {
        throw UnsupportedOperationException()
    }

    open fun readDescription(): String {
        throw UnsupportedOperationException()
    }

    open fun readPrice(): Double {
        throw UnsupportedOperationException()
    }

    open fun readVegetarian(): Boolean {
        throw UnsupportedOperationException()
    }

    open fun print() {
        throw UnsupportedOperationException()
    }

    abstract fun createIterator(): Iterator
}