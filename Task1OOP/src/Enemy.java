public class Enemy implements Mortal {
    private int health;
    final int enemyDimage = 200;

    public Enemy(int health) {
        this.health = health;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void takeDamage (int damage) {
        health-=damage;
    }
    public void attackHero(Hero hero){
        System.out.println("Enemy attacks hero");
        hero.takeDamage(enemyDimage);
    }
    @Override
    public boolean isAlive() {
        return health > 0;
    }

}
