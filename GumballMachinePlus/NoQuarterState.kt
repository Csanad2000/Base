class NoQuarterState(val gumballMachine:GumballMachine):State{
    override fun insertQuarter(){
        println("You inserted a quarter")
        gumballMachine.state=gumballMachine.hasQuarterState
    }

    override fun ejectQuarter(){
        println("There is no quarter")
    }

    override fun turnCrank(){
        println("You need to pay first")
    }

    override fun dispense(){
        println("You need to pay first")
    }

    override fun getState():String{
        return "Waiting for quarter"
    }
}