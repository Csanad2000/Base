package gumballmachine2

import java.rmi.*

interface GumballMachineRemote:Remote{
    fun readCount():Int throws RemoteException
    fun readLocation():String throws RemoteException
    fun readState():String throws RemoteException
}