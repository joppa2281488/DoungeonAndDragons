package DoungeonandDragons;

public class Player extends Entity {
    private int xp;
    public Player(int hp, int damage, int armor) {
        super(hp, damage, armor);
        xp = 0;
    }
    public void addXp(int xp){
        this.xp += xp;
        var xpforlvl = getLevel()*10;
        while (this.xp >= xpforlvl){
            setLevel(getLevel()+1);
            this.xp -= xpforlvl;
            xpforlvl = getLevel()*10;
        }
    }

    @Override
    public void Damage(Entity enemy) {
        super.Damage(enemy);
        if(enemy.isDead()){
           addXp(enemy.getLevel()*10);
        }
    }
}
