package com.company;

public class GameEntity {
    private int damage;
    private int height;

    public GameEntity(int damage, int height) {
        this.damage = damage;
        this.height = height;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
