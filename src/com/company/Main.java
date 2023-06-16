package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(320, 30);
        boss.weapon.setWeapon_type(WeaponType.FIRE);
        boss.weapon.setWeapon_name(WeaponName.AK);
        System.out.println(boss.info());
        Skeleton skelet1 = new Skeleton( 100, 20, 15);
        skelet1.weapon.setWeapon_type(WeaponType.LAZER);
        skelet1.weapon.setWeapon_name(WeaponName.AWM);
        Skeleton skelet2 = new Skeleton( 200, 20, 25);
        skelet2.weapon.setWeapon_type(WeaponType.WOOD);
        skelet2.weapon.setWeapon_name(WeaponName.FAMAS);
        System.out.println(skelet1.info() + "\n" + skelet2.info());
    }
}
