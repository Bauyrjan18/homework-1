package com.narxoz.rpg.equipment;

public class Longbow implements Weapon {

    private int damage;
    private String weaponType;
    private int range;

    public Longbow() {
        this.damage = 20;
        this.weaponType = "Bow";
        this.range = 50;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getWeaponType() {
        return weaponType;
    }

    @Override
    public String getWeaponInfo() {
        return "Elven Longbow (Ranger) - A lightweight bow made of ancient wood";
    }

    @Override
    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo());
        System.out.println("Damage: " + damage);
        System.out.println("Type: " + weaponType);
        System.out.println("Range: " + range + "m");
    }
}
