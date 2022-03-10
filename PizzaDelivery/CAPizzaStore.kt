class CAPizzaStore : PizzaStore {
    override var ingredientFactory: IngredientFactory = CAIngredientFactory()

    override fun createPizza(type: String, ingredientFactory: IngredientFactory): Pizza {
        lateinit var pizza:Pizza

        when(type){
            "cheese"-> pizza=CheesePizza(ingredientFactory)
            "clam"->pizza=ClamPizza(ingredientFactory)
            else -> pizza=CheesePizza(ingredientFactory)
        }

        pizza.name="California Style "+pizza.name
        return pizza
    }
}