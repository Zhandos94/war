package kz.learnjava.war;

abstract class Character implements Fighter {
    private String name;
    private int health;
    private int strength;
    private int dexterity;
    private int xp;
    private int gold;

    public Character(String name, int health, int strength, int dexterity, int xp, int gold) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.dexterity = dexterity;
        this.xp = xp;
        this.gold = gold;
    }

    public int attack() {
        if (dexterity * 3 > getRandomValue()) {
            return strength;
        }

        return 0;
    }

    public int getRandomValue() {
        return (int) (Math.random() * 100);
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getXp() {
        return xp;
    }

    public int getGold() {
        return gold;
    }

    @Override
    public String toString() {
        return String.format("%s здоровье:%d", name, health);
    }
}
