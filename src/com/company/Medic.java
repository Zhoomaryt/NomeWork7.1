package com.company;

public class Medic extends Hero{
    @Override
    public void applySuperAbility() {
        setDamage(0);
        setHealth(200);
        setSuperAbilityType("heals");

        System.out.println("Medic "+getHealth()+"hp "+getDamage()+"dd  суперспособность "+getSuperAbilityType());
    }
}

