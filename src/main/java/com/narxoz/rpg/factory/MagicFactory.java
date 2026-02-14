package com.narxoz.rpg.factory;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.EnchantedRobe;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.WizardStaff;

public class MagicFactory implements EquipmentFactory {
    public Weapon createWeapon() { return new WizardStaff(); }
    public Armor createArmor() { return new EnchantedRobe(); }
}
