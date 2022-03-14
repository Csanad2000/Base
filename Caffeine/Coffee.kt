class Coffee : CaffeineBeverage() {
    override fun brew() {
        println("Filtering coffee")
    }

    override fun addCondiments() {
        println("Adding sugar and milk")
    }

    override fun customerWantsCondiments(): Boolean {
        print("Do you want milk and sugar with your coffee? (y/n) ")
        var answer = readLine()
        return if (answer != null) {
            answer.toLowerCase().startsWith('y')
        } else {
            false
        }
    }
}