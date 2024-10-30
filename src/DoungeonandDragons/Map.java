package DoungeonandDragons;

public class Map {
    private GameObject [][] map;

    public Map(int lenX, int lenY) {
        map = new GameObject [lenX] [lenY];
    }
    public void addObject(GameObject gameObject, Position position){
        gameObject.setPosition(position);
        gameObject.setMap(this);
        map [position.getX()] [position.getY()] = gameObject;
    }
    public void showMap(){
        for(int i = 0; i < map.length;i++){
            System.out.println();
            for(int j = 0; j < map[i].length; j++){
                System.out.print(map[i][j]);
                System.out.print(" ");
            }
        }
    }
}
