package DoungeonandDragons;

import java.util.Scanner;

public class Doungeon {
    public static void main(String [] args){
        Entity enemy = new Entity(20, 2);
        Entity player = new Entity(30,3);
        boolean isRunning = true;
        while (isRunning){
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input){
                case "q":
                    isRunning = false;
                    break;
                case "a":
                    player.Damage(enemy);
                    System.out.println(enemy.getHp());
            }
            if (enemy.isDead()){
                System.out.println("Enemy is Dead");
                isRunning = false;
            }
        }
        System.out.println("Game is Over");
    }
}
