package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
public class Warrior implements Character {

    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;

    private Weapon weapon;
    private Armor armor;


    public Warrior(String name) {
        this.name = name;
        this.health = 150;
        this.mana = 30;
        this.strength = 80;
        this.intelligence = 20;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getHealth() { return health; }

    @Override
    public int getMana() { return mana; }

    @Override
    public int getStrength() { return strength; }

    @Override
    public int getIntelligence() { return intelligence; }

    public void displayStats() {
        System.out.println("=== " + name + " (Warrior) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);

        if (weapon != null) {
            System.out.print("Equipped: ");
            weapon.displayInfo();
        } else {
            System.out.println("Weapon: None");
        }

        if (armor != null) {
            System.out.print("Equipped: ");
            armor.displayInfo();
        } else {
            System.out.println("Armor: None");
        }
    }

    public void useSpecialAbility() {
        System.out.println(name + " uses BERSERKER RAGE! Strength temporarily increased!");
    }

    @Override
    public void equipWeapon(Weapon w) {
        this.weapon = w;
        System.out.println(name + " equipped a weapon.");
    }

    @Override
    public void equipArmor(Armor a) {
        this.armor = a;
        System.out.println(name + " put on armor.");
    }

}
