package com.narxoz.rpg.character;

public class Mage extends Character{
        // TODO: Add fields for equipped weapon and armor
        // Think: Should Warrior know about its equipment?

        public Mage(String name) {
            super(name, 100, 70, 40, 100);
        }

        // Example method structure:
        public String getName() {
            return name;
        }

        public void displayStats() {
            System.out.println("=== " + name + " (Mage) ===");
            System.out.println("Health: " + health);
            System.out.println("Mana: " + mana);
            System.out.println("Strength: " + strength);
            System.out.println("Intelligence: " + intelligence);
        }

        public void useSpecialAbility() {
            System.out.println(name + " casts FIREBALLS! Strength temporarily increased!");
        }
    }

