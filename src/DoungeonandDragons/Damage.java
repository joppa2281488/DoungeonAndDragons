package DoungeonandDragons;

public class Damage {
    int damage;
    int pureDamage;

    public Damage(int damage,int pureDamage) {
        this.damage = damage;
        this.pureDamage = pureDamage;
    }

    public int getPureDamage() {
        return pureDamage;
    }

    public int getDamage() {
        return damage;
    }
}
