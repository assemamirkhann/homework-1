package com.narxoz.rpg.equipment;

public class WizardStaff implements Weapon{
    private String spell;
        private int damage;
        private String weaponType;

        public WizardStaff() {
            this.spell = "Cast";
            this.damage = 25;
            this.weaponType = "Staff";
        }
        public String getSpell(){
            return spell;
        }
        public int getDamage() {
            return damage;
        }
        public String getWeaponType(){
            return weaponType;
        }
        public String getWeaponInfo() {
            return "WizardStaff (Medieval) - A long stick made of wood full of magic";
        }

        public void displayInfo() {
            System.out.println("Weapon: " + getWeaponInfo());
            System.out.println("Damage: " + damage);
            System.out.println("Type: " + weaponType);
        }
        // - Spell power
    }

