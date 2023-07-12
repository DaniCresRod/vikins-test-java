package org.example.saxon;

import org.example.soldier.Soldier;

public class Saxon extends Soldier {

    private String msg;
    public Saxon(int healthArg, int strengthArg) {
        super(healthArg, strengthArg);

    }

    @Override
    public int attack() {
        return super.attack();
    }

    @Override
    public void receiveDamage(int damage) {
        super.receiveDamage(damage);
        if(this.health<=0){
            this.setMsg("A Saxon has died in combat");
        }
        else{
            this.setMsg("A Saxon has received "+damage+" points of damage");
        }
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
