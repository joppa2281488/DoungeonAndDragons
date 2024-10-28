package DoungeonandDragons;

public class Entity {
    private int hp;
    private int damage;

    public Entity(int hp, int damage) {
        this.hp = hp;
        this.damage = damage;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isDead() {
        return hp <= 0;
    }

    public int getHp() {
        return hp;
    }

    public void Damage(Entity enemy) {
        var current_hp_enemy = enemy.getHp();
        current_hp_enemy -= damage;
        enemy.setHp(current_hp_enemy);
    }
}
