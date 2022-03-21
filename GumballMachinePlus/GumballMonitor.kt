import java.rmi.*

class GumballMonitor(val machine:GumballMachineRemote){
    fun report(){
        try{
            println("Gumball Machine: "+machine.readLocation())
            println("Current inventory: "+machine.readCount())
            println("Current state: "+machine.readState())
        }catch(e:RemoteException){
            e.printStackTrace()
        }
    }
}