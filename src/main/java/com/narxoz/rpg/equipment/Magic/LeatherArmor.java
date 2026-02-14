package com.narxoz.rpg.equipment.Magic;

import com.narxoz.rpg.equipment.Armor;

public class LeatherArmor implements Armor {
    private int endurance;
    private int defense;
    private String armorType;

    public LeatherArmor() {
        this.endurance = 80;
        this.defense = 30;
        this.armorType = "Armor";
    }
    public int getEndurance(){
        return endurance;
    }
    public int getDefense() {
        return defense;
    }
    public String getArmorType(){
        return armorType;
    }
    public String getArmorInfo() {
        return "Leather Armor (Ranger) - armor from animal leather with high endurance";
    }

    public void displayInfo() {
        System.out.println("Armor: " + getArmorInfo());
        System.out.println("Damage: " + defense);
        System.out.println("Type: " + armorType);
        System.out.println("Weight: "+ endurance);
    }

}

