package org.example.war;

import org.example.saxon.Saxon;
import org.example.vikins.Vikings;

import java.util.ArrayList;
import java.util.List;

public class War {

    public List<Vikings> vikingArmy=new ArrayList<Vikings>();
    public List<Saxon> saxonArmy=new ArrayList<Saxon>();

    public List<Vikings> getVikingArmy() {
        return vikingArmy;
    }

    public void setVikingArmy(List<Vikings> vikingArmy) {
        this.vikingArmy = vikingArmy;
    }

    public List<Saxon> getSaxonArmy() {
        return saxonArmy;
    }

    public void setSaxonArmy(List<Saxon> saxonArmy) {
        this.saxonArmy = saxonArmy;
    }

    public void addViking(Vikings oneViking){
        vikingArmy.add(oneViking);
    }

    public void addSaxon(Saxon oneSaxon){
        saxonArmy.add(oneSaxon);
    }
    public String vikingAttack(){
        String theMsg="";

        int whichViking=(int)Math.random()*vikingArmy.size();
        int theDamage=vikingArmy.get(whichViking).attack();

        int whichSaxon=(int)Math.random()*saxonArmy.size();

        saxonArmy.get(whichSaxon).receiveDamage(theDamage);
        theMsg=saxonArmy.get(whichSaxon).getMsg();

        if(saxonArmy.get(whichSaxon).getHealth()<=0){
            saxonArmy.remove(whichSaxon);
        }
        return theMsg;
    }
    public String saxonAttack(){
        String theMsg="";
        int whichSaxon=(int)Math.random()*saxonArmy.size();

        int theDamage=saxonArmy.get(whichSaxon).attack();

        int whichViking=(int)Math.random()*vikingArmy.size();

        vikingArmy.get(whichViking).receiveDamage(theDamage);
        theMsg=vikingArmy.get(whichViking).getMsg();

        if(vikingArmy.get(whichViking).getHealth()<=0) {
            vikingArmy.remove(whichViking);
        }
        return theMsg;
    }
    public String showStatus(){
        if((this.vikingArmy.size()==0) && (this.saxonArmy.size()!=0)){
            return "Saxons have fought for their lives and survive another day...";
        }
        else if((this.vikingArmy.size()!=0) && (this.saxonArmy.size()==0)){
            return "Vikings have won the war of the century!";
        }
        else{
            return "Vikings and Saxons are still in the thick of battle.";
        }
    }
}
