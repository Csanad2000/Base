class NYPizzaStore:PizzaStore {
    override var ingredientFactory: IngredientFactory=NYIngredientFactory()

    override fun createPizza(type: String, ingredientFactory: IngredientFactory): Pizza {
        lateinit var pizza:Pizza

        when(type){
            "cheese"-> pizza=CheesePizza(ingredientFactory)
            "sausage"-> pizza=SausagePizza(ingredientFactory)
            else -> pizza=CheesePizza(ingredientFactory)
        }

        pizza.name="New York Style "+pizza.name
        return pizza
    }
}