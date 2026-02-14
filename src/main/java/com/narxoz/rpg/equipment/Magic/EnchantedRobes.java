package com.narxoz.rpg.equipment.Magic;

import com.narxoz.rpg.equipment.Armor;

public class EnchantedRobes implements Armor {
    private int durability;
    private int defense;
    private String armorType;

    public EnchantedRobes() {
        this.durability = 10;
        this.defense = 60;
        this.armorType = "Robes";
    }
    public int getDurability(){
        return durability;
    }
    public int getDefense() {
        return defense;
    }
    public String getArmorType(){
        return armorType;
    }
    public String getArmorInfo() {
        return "Enchanted Robes (Magic) - A casted protective clothing";
    }

    public void displayInfo() {
        System.out.println("Armor: " + getArmorInfo());
        System.out.println("Damage: " + defense);
        System.out.println("Type: " + armorType);
        System.out.println("Weight: "+ durability);
    }
}


