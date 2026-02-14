package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public abstract class Character {
    protected String name;
    protected int health;
    protected int mana;
    protected int strength;
    protected int intelligence;

    protected Weapon weapon;
    protected Armor armor;

    // TODO: Define common character behaviors
    // Consider methods like:
    public Character(String name, int health, int mana, int strength, int intelligence){
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.strength = strength;
        this.intelligence = intelligence;
    }
    public String getName(){ return name;}
    public int getHealth(){ return health;}
    public int getMana(){ return mana;}
    public int getStrength(){ return strength;}
    public int getIntelligence(){ return intelligence;}

    protected void displayStats(){
        System.out.println("Name: "+name);
        System.out.println("Health: "+health);
        System.out.println("Mana: "+mana);
        System.out.println("Strength: "+strength);
        System.out.println("Intelligence: "+intelligence);
    }
    public void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    public void equipArmor(Armor armor){
        this.armor = armor;
    }
    public abstract void useSpecialAbility();
}
