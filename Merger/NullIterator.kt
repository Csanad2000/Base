class NullIterator : Iterator {
    override fun hasNext(): Boolean {
        return false
    }

    override fun next(): MenuItem? {
        return null
    }
}