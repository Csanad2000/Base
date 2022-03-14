abstract class CaffeineBeverage {
    fun prepareRecipe() {
        boilWater()
        brew()
        pourIntoCup()
        if (customerWantsCondiments()) {
            addCondiments()
        }
    }

    abstract fun brew()
    abstract fun addCondiments()

    fun boilWater() {
        println("Water is boiling")
    }

    fun pourIntoCup() {
        println("Drink is pouring into cup")
    }

    open fun customerWantsCondiments(): Boolean {
        return true
    }
}