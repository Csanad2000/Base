package gumballmachine2

class SoldState(val gumballMachine:GumballMachine):State{
    override fun insertQuarter(){
        println("Please wait for the gumball")
    }

    override fun ejectQuarter(){
        println("You already turned the crank")
    }

    override fun turnCrank(){
        println("You wont get a ball for free")
    }

    override fun dispense(){
        gumballMachine.releaseBall()
        if(gumballMachine.count>0){
            gumballMachine.state=gumballMachine.noQuarterState
        }else{
            println("Lucky you! Just ran out of gumballs")
            gumballMachine.state=gumballMachine.soldOutState
        }
    }

    override fun getState():String{
        return "Sold gumball"
    }
}