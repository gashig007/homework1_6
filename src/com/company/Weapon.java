package com.company;

public class Weapon {
    private WeaponType weapon_type;
    private WeaponName weapon_name;

    public WeaponType getWeapon_type() {
        return weapon_type;
    }

    public void setWeapon_type(WeaponType weapon_type) {
        this.weapon_type = weapon_type;
    }

    public WeaponName getWeapon_name() {
        return weapon_name;
    }

    public void setWeapon_name(WeaponName weapon_name) {
        this.weapon_name = weapon_name;
    }
}
