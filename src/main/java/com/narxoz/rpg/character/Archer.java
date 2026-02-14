package com.narxoz.rpg.character;

public class Archer extends Character {
    // TODO: Add fields for equipped weapon and armor
    // Think: Should Warrior know about its equipment?

    public Archer(String name) {
        super(name, 150, 30, 80, 20);
    }

    // Example method structure:
    public String getName() {
        return name;
    }

    public void displayStats() {
        System.out.println("=== " + name + " (Archer) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    public void useSpecialAbility() {
        System.out.println(name + " uses CRISTAL ARROWS! Strength temporarily increased!");
    }
}
