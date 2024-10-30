package DoungeonandDragons;

public class Entity {
    private int level;
    private Stats stats;
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Stats getStats() {
        return stats;
    }

    public Entity(Stats stats) {
        this.stats = stats;
        level = 1;
    }

    protected int Damage(Entity enemy,Damage damage) {
       return enemy.getStats().AtackHealth(damage);
    }
    public boolean isDead() {
        return stats.getHealth() <= 0;
    }
    }

