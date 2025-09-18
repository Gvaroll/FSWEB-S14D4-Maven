package org.example.rpg;

public class RPGGame {
    public static void main(String[] args) {
        Troll troll = new Troll("Mountain Troll", 100, 40);
        System.out.println(troll.getName() + " attacks and deals: " + troll.attack());
    }
}
