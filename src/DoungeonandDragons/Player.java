package DoungeonandDragons;

import java.util.logging.Level;

public abstract class Player extends Entity {
    private int exp;

    public Player(Stats stats) {
        super(stats);
        this.exp = 0;
    }
    public void addXp(int exp) {
        this.exp += exp;
        var xpforlvl = getLevel() * 10;
        while (this.exp >= xpforlvl) {
            setLevel(getLevel() + 1);
            this.exp -= xpforlvl;
            xpforlvl = getLevel() * 10;
        }
    }

    @Override
    protected int Damage(Entity enemy, Damage damage) {
        var giveDamage = super.Damage(enemy, damage);
        if (enemy.isDead() & (giveDamage > 0)) {
            addXp(enemy.getLevel() * 10);
        }
        return giveDamage;
    }
}
