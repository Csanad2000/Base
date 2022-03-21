fun main(args:Array<String>){
    if(args.size<2){
        println("GumballMachine <name> <inventory>")
        exitProcess(1)
    }

    try{
        val gumballMachine=GumballMachine(args[0],Integer.parseInt(args[1]))
        Naming.rebind("//"+args[0]+"/gumballmachine",gumballMachine)
    }catch(e:Exception){
        e.printStackTrace()
    }
}