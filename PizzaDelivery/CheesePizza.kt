class CheesePizza(ingredientFactory: IngredientFactory) : Pizza(ingredientFactory) {
    init {
        name="Cheese Pizza"
        toppings.add(ingredientFactory.createCheese())
    }
}
