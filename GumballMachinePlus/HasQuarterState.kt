class HasQuarterState(val gumballMachine:GumballMachine):State{
    override fun insertQuarter(){
        println("You can't insert another quarter")
    }

    override fun ejectQuarter(){
        println("Quarter returned")
        gumballMachine.state=gumballMachine.noQuarterState
    }

    override fun turnCrank(){
        println("You turned the crank")
        if((0..10).random()==1 && gumballMachine.count>1){
            gumballMachine.state=gumballMachine.winnerState
        }else{
            gumballMachine.state=gumballMachine.soldState
        }
    }

    override fun dispense(){
        println("No gumball dispensed")
    }

    override fun getState():String{
        return "Has a quarter"
    }
}