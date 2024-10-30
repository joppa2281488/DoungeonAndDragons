package DoungeonandDragons;

public class Mage extends Player {
    public Mage() {
        Stats stats = new Stats(120,4,10);
        super(stats);

    }

    public  void FireBoll(Entity enemy) {
        Damage damage = new Damage(0,50);
        super.Damage(enemy,damage);
    }
}