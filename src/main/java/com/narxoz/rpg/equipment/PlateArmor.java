package com.narxoz.rpg.equipment;

public class PlateArmor implements Armor {
    public int getDefense() { return 50; }
    public String getArmorType() { return "Heavy Plate Armor (Medieval)"; }
    public void displayInfo() {
        System.out.println("Armor: " + getArmorType() + " | Defense: " + getDefense());
    }
}
