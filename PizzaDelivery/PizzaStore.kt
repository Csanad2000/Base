interface PizzaStore {
    var ingredientFactory: IngredientFactory

    fun orderPizza(type: String): Pizza {
        var pizza: Pizza = createPizza(type, ingredientFactory)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }

    fun createPizza(type: String, ingredientFactory: IngredientFactory): Pizza
}