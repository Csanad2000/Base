fun main() {
    var nyPizzaStore = NYPizzaStore()
    var pizza: Pizza = nyPizzaStore.orderPizza("sausage")
    println("Ethan ordered a " + pizza.name + "\n")

    var caPizzaStore = CAPizzaStore()
    pizza = caPizzaStore.orderPizza("clam")
    println("Joel ordered a " + pizza.name + "\n")
}