package com.company;

public class Boss extends GameEntity{
    Weapon weapon = new Weapon();

    public Boss(int damage, int height) {
        super(damage, height);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String info(){
        return  "HP: " + getHeight() +
                "\nDamage: " + getDamage() +
                "\nweapon type: " + weapon.getWeapon_type() +
                "\nweapon name: " + weapon.getWeapon_name();
    }
}
