public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefenseType("Armor");

        System.out.println("Boss Info:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefenseType());
        System.out.println();

        Hero[] heroes = createHeroes();
        System.out.println("Heroes Info:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth());
            System.out.println("Damage: " + hero.getDamage());
            System.out.println("Superpower: " + hero.getSuperpower());
            System.out.println();
        }
    }

    private static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 20, "Flight");
        Hero hero2 = new Hero(80, 25);
        Hero hero3 = new Hero(120, 18, "Invisibility");

        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}
