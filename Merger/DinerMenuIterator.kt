class DinerMenuIterator(val items: Array<MenuItem?>) : Iterator {
    var position = 0

    override fun hasNext(): Boolean {
        if (position >= items.size || items[position] == null) {
            return false
        }
        return true
    }

    override fun next(): MenuItem {
        return items[position++]!!
    }
}