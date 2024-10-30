package DoungeonandDragons;

public class Stats {
    private int health;
    private int armor;
    private int mana;

    public Stats(int health, int armor,int mana) {
        this.health = health;
        this.armor = armor;
        this.mana = mana;

    }

    public int getHealth() {
        return health;
    }

    public int getArmor() {
        return armor;
    }

    public int AtackHealth(Damage damage){
        var physDamage = damage.getDamage();
        var armorResist = physDamage/10*armor;
        var givePhysDamage = physDamage - armorResist;
        var givePureDamage = damage.getPureDamage();
        var giveAllDamage = givePureDamage + givePhysDamage;
        var h = health - giveAllDamage; // здоровье останется после урона //
        int res = h; // сколько останется хп после нанесения урона
        if (h < 0) {
            res = health;
            health = 0;
        } else {
            res = health - res;
            health -= res;
        }
        return res;
    }
}
