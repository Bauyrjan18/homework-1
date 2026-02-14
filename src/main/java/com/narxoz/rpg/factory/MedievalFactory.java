package com.narxoz.rpg.factory;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.IronSword;
import com.narxoz.rpg.equipment.PlateArmor;
import com.narxoz.rpg.equipment.Weapon;

public class MedievalFactory implements EquipmentFactory {
    public Weapon createWeapon() { return new IronSword(); }
    public Armor createArmor() { return new PlateArmor(); }
}