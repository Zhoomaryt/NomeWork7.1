package com.company;

class Magic extends Hero{
    @Override
    public void applySuperAbility() {
        setDamage(60);
        setHealth(250);
        setSuperAbilityType("chidori");
        System.out.println("Magic "+getHealth()+"hp "+getDamage()+"dd  суперспособность "+getSuperAbilityType());
    }
}