class ClamPizza(ingredientFactory: IngredientFactory) : Pizza(ingredientFactory) {
    init {
        name = "Clam Pizza"
        toppings.add(ingredientFactory.createMeat())
        toppings.add(ingredientFactory.createCheese())
        toppings.add(ingredientFactory.createVegetable())
    }
}