package com.narxoz.rpg.equipment;

public class EnchantedRobe implements Armor {
    public int getDefense() { return 10; }
    public String getArmorType() { return "Silk Robe (Magic)"; }
    public void displayInfo() {
        System.out.println("Armor: " + getArmorType() + " | Defense: " + getDefense() + " | Magic Resistance +20%");
    }
}
