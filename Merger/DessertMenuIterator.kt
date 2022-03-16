class DessertMenuIterator(val items: ArrayList<MenuItem>) : Iterator {
    var position = 0

    override fun hasNext(): Boolean {
        if (position >= items.size) {
            return false
        }
        return true
    }

    override fun next(): MenuItem {
        return items[position++]
    }
}