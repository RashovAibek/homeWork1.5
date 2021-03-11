package com.GeekTek;

public class Main {

    public static void main(String[] args) {
        Boss bear = new Boss();
        bear.setHealth(200);
        bear.setDamage(50);
        bear.setDefenceType("Doctor\uD83D\uDC68\u200D⚕️");
        System.out.println( bear.getHealth() + " " + bear.getDamage() + " " + bear.getDefenceType());
    }
}
