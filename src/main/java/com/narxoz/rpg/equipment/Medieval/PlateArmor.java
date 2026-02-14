package com.narxoz.rpg.equipment.Medieval;

import com.narxoz.rpg.equipment.Armor;

public class PlateArmor implements Armor {
    private int weight;
    private int defense;
    private String armorType;

    public PlateArmor() {
        this.weight = 30;
        this.defense = 60;
        this.armorType = "Plate";
    }
    public int getWeight(){
        return weight;
    }
    public int getDefense() {
        return defense;
    }
    public String getArmorType(){
        return armorType;
    }
    public String getArmorInfo() {
        return "Plate Armor (Medieval) - armor in the shape and size of metal plates forged " +
                "in the shape of the warrior's body parts to protect them";
    }

    public void displayInfo() {
        System.out.println("Armor: " + getArmorInfo());
        System.out.println("Damage: " + defense);
        System.out.println("Type: " + armorType);
        System.out.println("Weight: "+ weight);
    }

}

