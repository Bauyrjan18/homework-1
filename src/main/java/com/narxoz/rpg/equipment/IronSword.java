package com.narxoz.rpg.equipment;

public class IronSword implements Weapon {

    private int damage;
    private String weaponType;
    private int durability;
    private double weight;

    public IronSword() {
        this.damage = 25;
        this.weaponType = "Sword";
        this.durability = 100;
        this.weight = 2.5;
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
        return "Iron Sword (Medieval) - A sturdy blade forged from iron";
    }

    @Override
    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo());
        System.out.println("Damage: " + damage);
        System.out.println("Type: " + weaponType);
        System.out.println("Durability: " + durability + "%");
        System.out.println("Weight: " + weight + " kg");
    }
}