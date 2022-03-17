fun main(){
    val machine=GumballMachine(1)
    machine.insertQuarter()
    machine.ejectQuarter()
    machine.insertQuarter()
    machine.turnCrank()
    machine.refill(1)
    machine.insertQuarter()
    machine.turnCrank()
}