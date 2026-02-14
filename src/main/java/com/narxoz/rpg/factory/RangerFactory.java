package com.narxoz.rpg.factory;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Ranger.LeatherArmor;
import com.narxoz.rpg.equipment.Ranger.LongBow;
import com.narxoz.rpg.equipment.Weapon;

public class RangerFactory implements EquipmentFactory{
    public Weapon createWeapon(){
        return new LongBow();
    }
    public Armor createArmor(){
        return new LeatherArmor();
    }
}
