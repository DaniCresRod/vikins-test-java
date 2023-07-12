package org.example.soldier;

public class Soldier {
    public int health;
    public int strength;

    public Soldier(int healthArg, int strengthArg){
        this.health=healthArg;
        this.strength=strengthArg;
    }
    public int attack(){
        return this.strength;
    }

    public void receiveDamage(int damage){
        this.health-=damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
