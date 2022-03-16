class MenuComponentIterator(val items: ArrayList<MenuComponent>) : Iterator {
    var position = 0

    override fun hasNext(): Boolean {
        if (position >= items.size) {
            return false
        }
        return true
    }

    override fun next(): MenuComponent? {
        return items[position++]
    }
}