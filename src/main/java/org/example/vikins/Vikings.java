package org.example.vikins;

import org.example.soldier.Soldier;

public class Vikings extends Soldier {

    public String name;
    private String msg;

    public Vikings (String name, int health, int strength){
        super(health, strength);
        this.name=name;
    }

    @Override
    public void receiveDamage(int damage) {
        super.receiveDamage(damage);
        if(this.health<=0){
            this.setMsg(this.name+" has died in act of combat");
        }
        else{
            this.setMsg(this.name+" has received "+damage+" points of damage");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String battleCry(){
        return "Odin Owns You All!";
    }
}
