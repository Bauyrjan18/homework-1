package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.Character;

public abstract class CharacterFactory {

    public abstract com.narxoz.rpg.character.Character createCharacter(String name);

    public com.narxoz.rpg.character.Character orderCharacter(String name) {
        Character character = createCharacter(name);
        System.out.println("Factory: Preparing a new character - " + name);
        return character;
    }
}