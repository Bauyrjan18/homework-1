package com.narxoz.rpg.factory;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.LeatherArmor;
import com.narxoz.rpg.equipment.Longbow;
import com.narxoz.rpg.equipment.Weapon;

public class RangerFactory implements EquipmentFactory {
    public Weapon createWeapon() { return new Longbow(); }
    public Armor createArmor() { return new LeatherArmor(); }
}