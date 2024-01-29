public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setName("Большой брат");
        boss.setHealth(1000);
        boss.setDamage(50);

        Weapon bossWeapon = new Weapon();
        bossWeapon.setWeaponType(WeaponType.AXE);
        bossWeapon.setWeaponName("Топор Разрушения");

        boss.setWeapon(bossWeapon);

        System.out.println("Имя босса: " + boss.getName());
        System.out.println("Здоровье босса: " + boss.getHealth());
        System.out.println("Урон босса: " + boss.getDamage());
        System.out.println("Оружие босса: " + boss.getWeapon().getWeaponType() + " - " + boss.getWeapon().getWeaponName());
    }
}