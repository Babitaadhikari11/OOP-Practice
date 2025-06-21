package Polymorphism;

class Character {
    protected String name;

    public Character(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println(name + " performs a basic attack.");
    }
}

// Warrior class extending Character
class Warrior extends Character {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " swings a mighty sword!");
    }
}

// Mage class extending Cha
