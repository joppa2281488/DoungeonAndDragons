package DoungeonandDragons;

public class Entity {
    private int hp;
    private int damage;
    private int armor;
    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Entity(int hp, int damage, int armor) {
        this.armor = armor;
        this.hp = hp;
        this.damage = damage;
        level = 1;
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

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void Damage(Entity enemy) {
        var current_hp_enemy = enemy.getHp();
        var armor_enemy = enemy.getArmor();

        var armorResist = damage/10*armor_enemy;
        current_hp_enemy -= damage - armorResist;

        enemy.setHp(current_hp_enemy);
    }
}
