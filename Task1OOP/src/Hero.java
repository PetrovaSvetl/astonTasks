public abstract class Hero implements Mortal {
    private String name;
    private int health;
    final int heroDimage = 100;

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract void attackEnemy(Enemy enemy);

    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

}
