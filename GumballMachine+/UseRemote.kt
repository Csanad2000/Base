package gumballmachine2

import java.rmi.*

fun main(args:Array<String>){
    val location=arrayListOf("rmi://london.gummies.com/gumballmachine")
    val monitor=Array<GumballMonitor?>(location.size,{null})

    for(index in location.indices){
        try{
            val machine=Naming.lookup(location[index]) as GumballMachineRemote
            monitor[index]=GumballMonitor(machine)
            println(monitor[index])
        }catch(e:Exception){
            e.printStackTrace()
        }
    }

    for(item in monitor){
        item!!.report()
    }
}