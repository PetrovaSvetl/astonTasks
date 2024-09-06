import java.util.ArrayList;

public class BattleGround {
    public static void main(String[] args) {
        ArrayList<Enemy> enemyList = new ArrayList<>();
        enemyList.add(new Witch(400));
        enemyList.add(new Witch(300));
        enemyList.add(new Zombie(400));
        enemyList.add(new Zombie(100));
        enemyList.add(new Witch(400));
        Mage mage = new Mage("Mage", 1500);
        while (mage.isAlive()) {
            for (Enemy e : enemyList) {
                if (!mage.isAlive()) {
                    System.out.println("Enemy is win");
                    break;
                }
                e.attackHero(mage);
            }
        }
    }
}
