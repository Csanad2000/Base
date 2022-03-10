abstract class Pizza(ingredientFactory: IngredientFactory) {
    var name:String="Pizza"
    var dough:Dough=ingredientFactory.createDough()
    var sauce:Sauce=ingredientFactory.createSauce()
    var toppings:ArrayList<Topping> =ArrayList<Topping>()

    fun prepare(){
        println("Preparing "+name)
        println("Tossing dough")
        println("Adding sauce")
        println("Adding toppings:")
        for (topping in toppings){
            println(" "+topping.name)
        }
    }

    fun bake(){
        println("Bake for 25 minutes at 350°F")
    }

    fun cut(){
        println("Cut into diagonal slices")
    }

    fun box(){
        println("Put in PizzaStore box")
    }
}