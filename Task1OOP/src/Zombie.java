public class Zombie extends Enemy{
    private String name;
    public Zombie(int health) {
        super(health);
        this.name="zombie";
    }

    @Override
    public boolean isAlive() {
        return true;
    }
}
