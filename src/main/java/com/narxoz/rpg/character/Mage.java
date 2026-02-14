package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Mage implements Character {
    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;

    private Weapon weapon;
    private Armor armor;

    public Mage(String name) {
        this.name = name;
        this.health = 80;
        this.mana = 200;
        this.strength = 20;
        this.intelligence = 150;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getMana() { return mana; }
    public int getStrength() { return strength; }
    public int getIntelligence() { return intelligence; }

    public void displayStats() {
        System.out.println("\n--- MAGE STATS: " + name + " ---");
        System.out.println("Health: " + health + " | Mana: " + mana);
        System.out.println("Str: " + strength + " | Int: " + intelligence);
        if(weapon != null) weapon.displayInfo();
        if(armor != null) armor.displayInfo();
    }

    public void useSpecialAbility() {
        System.out.println(name + " casts FIREBALL! Requires " + (mana / 4) + " mana.");
    }

    public void equipWeapon(Weapon w) { this.weapon = w; }
    public void equipArmor(Armor a) { this.armor = a; }
}
