package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Character & Equipment System ===\n");

        CharacterFactory warriorFactory = new WarriorFactory();
        CharacterFactory mageFactory = new MageFactory();
        CharacterFactory archerFactory = new ArcherFactory();

        Character hero1 = warriorFactory.createCharacter("Dean");
        Character hero2 = mageFactory.createCharacter("Sam");
        Character hero3 = archerFactory.createCharacter("Castiel");

        EquipmentFactory medievalFactory = new MedievalFactory();
        EquipmentFactory magicFactory = new MagicFactory();
        EquipmentFactory rangerFactory = new RangerFactory();

        System.out.println("Equipping " + hero1.getName() + "...");
        hero1.equipWeapon(medievalFactory.createWeapon());
        hero1.equipArmor(medievalFactory.createArmor());

        System.out.println("Equipping " + hero2.getName() + "...");
        hero2.equipWeapon(magicFactory.createWeapon());
        hero2.equipArmor(magicFactory.createArmor());

        System.out.println("Equipping " + hero3.getName() + "...");
        hero3.equipWeapon(rangerFactory.createWeapon());
        hero3.equipArmor(rangerFactory.createArmor());

        hero1.displayStats();
        hero1.useSpecialAbility();

        hero2.displayStats();
        hero2.useSpecialAbility();

        hero3.displayStats();
        hero3.useSpecialAbility();

        System.out.println("\n=== Demo Complete ===");
    }
}
