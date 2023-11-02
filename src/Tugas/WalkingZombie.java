package Tugas;

public class WalkingZombie extends Zombie implements Destroyable {
    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        // Implementasi penyembuhan WalkingZombie sesuai dengan level
        double increment;
        if (level == 1) {
            increment = 2;
        } else if (level == 2) {
            increment = 3;
        } else {
            increment = 4;
        }
        health += (int) (health * increment);
    }

    @Override
    public void destroyed() {
        // Implementasi penghancuran WalkingZombie
        health -= (int) (health * 0.2);        
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data = \nHealth = " + health + "\nLevel = " + level;
    }    
}