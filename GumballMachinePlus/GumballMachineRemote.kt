import java.rmi.*
import kotlin.jvm.Throws

interface GumballMachineRemote:Remote{
    fun readCount():Int @Throws(RemoteException::class)
    fun readLocation():String @Throws(RemoteException::class)
    fun readState():String @Throws(RemoteException::class)
}