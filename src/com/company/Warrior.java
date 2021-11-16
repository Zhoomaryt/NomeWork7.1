package com.company;

public class Warrior extends Hero{
    @Override
    public void applySuperAbility() {
        setDamage(55);
        setHealth(200);
        setSuperAbilityType("super udar");
        System.out.println("Warrior "+getHealth()+"hp "+getDamage()+"dd  суперспособность "+getSuperAbilityType());
    }
}