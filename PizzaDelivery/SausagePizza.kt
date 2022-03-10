class SausagePizza(ingredientFactory: IngredientFactory) : Pizza(ingredientFactory) {
    init {
        name="Sausage Pizza"
        toppings.add(ingredientFactory.createMeat())
        toppings.add(ingredientFactory.createCheese())
        toppings.add(ingredientFactory.createVegetable())
    }
}
