class SoldOutState(val gumballMachine:GumballMachine):State{
    override fun insertQuarter(){
        println("You cannot insert a quarter")
    }

    override fun ejectQuarter(){
        println("There is no quarter")
    }

    override fun turnCrank(){
        println("There are no balls left")
    }

    override fun dispense(){
        println("There are no balls left")
    }
}