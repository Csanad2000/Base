class NYIngredientFactory : IngredientFactory {
    override fun createCheese(): Cheese {
        return MozzarellaCheese()
    }

    override fun createDough(): Dough {
        return ThinCrustDough()
    }

    override fun createMeat(): Meat {
        return SausageMeat()
    }

    override fun createSauce(): Sauce {
        return TomatoSauce()
    }

    override fun createVegetable(): Vegetable {
        return LettuceVegetable()
    }
}