class Tea : CaffeineBeverage() {
    override fun brew() {
        println("Steeping tea")
    }

    override fun addCondiments() {
        println("Adding lemon")
    }

    override fun customerWantsCondiments(): Boolean {
        print("Do you want lemon with your tea? (y/n) ")
        var answer = readLine()
        return if (answer != null) {
            answer.toLowerCase().startsWith('y')
        } else {
            false
        }
    }
}