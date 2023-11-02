package Tugas;

public class Zombie {
    protected int health;
    protected int level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void heal() {
        // Penyembuhan Zombie
    }

    public void destroyed() {
        // Penghancuran Zombie
    }

    public String getZombieInfo() {
        return "Zombie [health=" + health + ", level=" + level + "]";
    }
}