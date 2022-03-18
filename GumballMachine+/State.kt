package gumballmachine2

interface State{
    abstract fun insertQuarter()
    abstract fun ejectQuarter()
    abstract fun turnCrank()
    abstract fun dispense()
    abstract fun getState():String
}