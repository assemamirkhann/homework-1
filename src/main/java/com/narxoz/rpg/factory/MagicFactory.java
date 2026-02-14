package com.narxoz.rpg.factory;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Magic.EnchantedRobes;
import com.narxoz.rpg.equipment.Magic.WizardStaff;
import com.narxoz.rpg.equipment.Weapon;

public class MagicFactory implements EquipmentFactory{
    public Weapon createWeapon(){
        return new WizardStaff();
    }
    public Armor createArmor(){
        return new EnchantedRobes();
    }
}
