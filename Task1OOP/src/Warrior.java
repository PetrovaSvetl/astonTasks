public class Warrior extends Hero{
    final int warriorDimage = 80;

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Warrior attacks enemy");
        enemy.takeDamage(warriorDimage);
    }
}
