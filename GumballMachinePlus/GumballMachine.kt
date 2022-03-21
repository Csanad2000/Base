import kotlin.jvm.Throws
import java.rmi.*
import java.rmi.server.*

class GumballMachine @Throws(RemoteException::class) constructor(var location:String var count:Int=0):UnicastRemoteObject(),GumballMachineRemote{
    val soldOutState:State=SoldOutState(this)
    val noQuarterState:State=NoQuarterState(this)
    val hasQuarterState:State=HasQuarterState(this)
    val soldState:State=SoldState(this)
    val winnerState:State=WinnerState(this)

    var state:State=soldOutState

    init{
        if(count>0){
            state=noQuarterState
        }
    }

    fun insertQuarter(){
        state.insertQuarter()
    }

    fun ejectQuarter(){
        state.ejectQuarter()
    }

    fun turnCrank(){
        state.turnCrank()
        state.dispense()
    }

    fun releaseBall(){
        println("Don't drop the ball!")
        if(count!=0){
            count--
        }
    }

    fun refill(count:Int){
        if(count>0){
            this.count+=count
            if(state==soldOutState){
                state=noQuarterState
            }
        }
    }

    override fun readCount():Int{
        return count
    }

    override fun readLocation():String{
        return location
    }

    override fun readState():String{
        return state.getState()
    }
}