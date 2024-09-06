public class Mage extends Hero{
    final int mageDimage = 50;

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Mage attacks enemy");
        enemy.takeDamage(mageDimage*(int) (Math.random()*4)+1);
    }
}
