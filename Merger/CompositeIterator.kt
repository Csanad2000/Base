import java.util.*

class CompositeIterator : Iterator {
    val stack = Stack<Iterator>()

    constructor(iterator: Iterator) {
        stack.push(iterator)
    }

    override fun hasNext(): Boolean {
        if (stack.empty()) {
            return false
        } else {
            val iterator = stack.peek() as Iterator
            if (!iterator.hasNext()) {
                stack.pop()
                return hasNext()
            } else {
                return true
            }
        }
    }

    override fun next(): MenuComponent? {
        if (hasNext()) {
            val iterator = stack.peek() as Iterator
            val component = iterator.next()
            if (component is Menu) {
                stack.push(component.createIterator())
            }
            return component
        } else {
            return null
        }
    }
}