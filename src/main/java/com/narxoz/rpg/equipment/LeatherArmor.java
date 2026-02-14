package com.narxoz.rpg.equipment;

public class LeatherArmor implements Armor {
    public int getDefense() { return 25; }
    public String getArmorType() { return "Hunter Leather (Ranger)"; }
    public void displayInfo() {
        System.out.println("Armor: " + getArmorType() + " | Defense: " + getDefense() + " | Speed +10%");
    }
}
