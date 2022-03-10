class CAIngredientFactory : IngredientFactory {
    override fun createCheese(): Cheese {
        return ReggianoCheese()
    }

    override fun createDough(): Dough {
        return ThickCrustDough()
    }

    override fun createMeat(): Meat {
        return ClamMeat()
    }

    override fun createSauce(): Sauce {
        return SourCreamSauce()
    }

    override fun createVegetable(): Vegetable {
        return BeansVegetable()
    }
}