package DoungeonandDragons;

import java.util.Scanner;

public class Doungeon {
    public static void main(String[] args) {
        Stats t = new Stats(100, 5, 0);
        Entity enemy = new Entity(t);
        Mage mage = new Mage();

        boolean isRunning = true;
        while (isRunning) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {
                case "q":
                    isRunning = false;
                    break;
                case "F":
                   mage.FireBoll(enemy);
                    System.out.println(enemy.getStats().getHealth());
                    break;
            }
            if (enemy.isDead()) {
                System.out.println("Enemy is Dead");
                System.out.println("You Level is " + mage.getLevel());
                isRunning = false;
            }
        }
    }
}