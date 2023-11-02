package Tugas;

class JumpingZombie extends Zombie implements Destroyable {
    public JumpingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        // Implementasi penyembuhan JumpingZombie sesuai dengan level
        double increment;
        if (level == 1) {
            increment = 3;
        } else if (level == 2) {
            increment = 4;
        } else {
            increment = 5;
        }
        health += (int) (health * increment);
    }

    @Override
    public void destroyed() {
        // Implementasi penghancuran JumpingZombie
        health -= (health * 0.1);        
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data = \nHealth = " + health + "\nLevel = " + level;
    }    
}