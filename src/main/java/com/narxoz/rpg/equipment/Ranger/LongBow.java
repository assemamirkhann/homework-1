package com.narxoz.rpg.equipment.Ranger;

import com.narxoz.rpg.equipment.Weapon;

public class LongBow implements Weapon {
    private int weight;
    private int damage;
    private String weaponType;

    public LongBow() {
        this.weight = 15;
        this.damage = 25;
        this.weaponType = "Bow";
    }
    public int getWeight(){
        return weight;
    }
    public int getDamage() {
        return damage;
    }
    public String getWeaponType(){
        return weaponType;
    }
    public String getWeaponInfo() {
        return "LongBow (Ranger) - A long bow or long distance";
    }

    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo());
        System.out.println("Damage: " + damage);
        System.out.println("Type: " + weaponType);
        System.out.println("Spell: " + weight);
    }
    // - Weight
}

