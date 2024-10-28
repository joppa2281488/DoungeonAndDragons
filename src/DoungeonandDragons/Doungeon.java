package DoungeonandDragons;

import java.util.Scanner;

public class Doungeon {
    public static void main(String [] args){
        int hp = 15;
        int hpEnemy = 10;
        boolean isRunning = true;
        while (isRunning){
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input){
                case "q":
                    isRunning = false;
                    break;
                case "a":
                     hpEnemy -= 1;
                     System.out.println(hpEnemy);
            }
            if (hpEnemy <= 0){
                System.out.println("Enemy is Dead");
                isRunning = false;
            }
        }
        System.out.println("Game is Over");
    }
}
