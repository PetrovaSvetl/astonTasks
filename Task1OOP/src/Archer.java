public class Archer extends Hero{
    final int archerDimage = 150;
    public Archer(String name, int health) {
        super(name, health);
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Archer attacks enemy");
        enemy.takeDamage(archerDimage);
    }
}
