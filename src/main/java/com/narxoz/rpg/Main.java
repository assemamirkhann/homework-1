package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.CharacterFactory;
import com.narxoz.rpg.factory.EquipmentFactory;
import com.narxoz.rpg.factory.MagicFactory;
import com.narxoz.rpg.factory.MedievalFactory;
import com.narxoz.rpg.factory.ArcherFactory;
import com.narxoz.rpg.factory.WarriorFactory;
import com.narxoz.rpg.factory.MageFactory;
import com.narxoz.rpg.factory.RangerFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Character & Equipment System ===\n");

        CharacterFactory warriorFactory = new WarriorFactory();
        Character warrior = warriorFactory.createCharacter("Conan");

        EquipmentFactory medieval = new MedievalFactory();
        warrior.equipWeapon(medieval.createWeapon());
        warrior.equipArmor(medieval.createArmor());

        warrior.displayStats();
        warrior.useSpecialAbility();

        System.out.println("\n---\n");

        CharacterFactory mageFactory = new MageFactory();
        Character mage = mageFactory.createCharacter("Gandalf");

        EquipmentFactory magic = new MagicFactory();
        mage.equipWeapon(magic.createWeapon());
        mage.equipArmor(magic.createArmor());

        mage.displayStats();
        mage.useSpecialAbility();

        System.out.println("\n---\n");

        CharacterFactory archerFactory = new ArcherFactory();
        Character archer = archerFactory.createCharacter("Legolas");

        EquipmentFactory ranger = new RangerFactory();
        archer.equipWeapon(ranger.createWeapon());
        archer.equipArmor(ranger.createArmor());

        archer.displayStats();
        archer.useSpecialAbility();

        System.out.println("\n=== Demo Complete ===");
    }
}
