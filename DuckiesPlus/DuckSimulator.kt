fun main(){
    val duckFactory=CountingDuckFactory()

    val mallardOne=duckFactory.createMallardDuck()
    val redheadDuck=duckFactory.createRedheadDuck()
    val duckCall=duckFactory.createDuckCall()
    val rubberDuck=duckFactory.createRubberDuck()
    val gooseDuck=GooseAdapter(Goose())

    val flockOfDucks=Flock()

    flockOfDucks.add(redheadDuck)
    flockOfDucks.add(duckCall)
    flockOfDucks.add(rubberDuck)
    flockOfDucks.add(gooseDuck)

    val flockOfMallards=Flock()

    val mallardTwo=duckFactory.createMallardDuck()
    val mallardThree=duckFactory.createMallardDuck()
    val mallardFour=duckFactory.createMallardDuck()

    flockOfMallards.add(mallardOne)
    flockOfMallards.add(mallardTwo)
    flockOfMallards.add(mallardThree)
    flockOfMallards.add(mallardFour)

    flockOfDucks.add(flockOfMallards)

    val quackologist=Quackologist()
    flockOfDucks.registerObserver(quackologist)

    println("Duck Simulator\n")
    println("Whole flock")
    flockOfDucks.quack()
    println("Mallard flock")
    flockOfMallards.quack()

    println("The ducks quacked "+QuackCounter.number+" times")
}