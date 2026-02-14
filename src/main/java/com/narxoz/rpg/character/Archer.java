package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Archer implements Character {
    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;

    private Weapon weapon;
    private Armor armor;

    public Archer(String name) {
        this.name = name;
        this.health = 110;
        this.mana = 60;
        this.strength = 70;
        this.intelligence = 50;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getMana() { return mana; }
    public int getStrength() { return strength; }
    public int getIntelligence() { return intelligence; }

    public void displayStats() {
        System.out.println("\n--- ARCHER STATS: " + name + " ---");
        System.out.println("Health: " + health + " | Mana: " + mana);
        System.out.println("Dexterity (Str): " + strength + " | Int: " + intelligence);
        if(weapon != null) weapon.displayInfo();
        if(armor != null) armor.displayInfo();
    }

    public void useSpecialAbility() {
        System.out.println(name + " uses HEADSHOT! Critical hit guaranteed.");
    }

    public void equipWeapon(Weapon w) { this.weapon = w; }
    public void equipArmor(Armor a) { this.armor = a; }
}