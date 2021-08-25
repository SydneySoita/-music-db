package UI;

import java.util.Scanner;

public class UserInterface {
    static Scanner scanner = new Scanner(System.in);
    public static int userInterface(){
        System.out.println("Welcome to my Music Database....");
        System.out.println("1: Add song \n" +
                "2: Add artist\n" +
                "3: Add album\n" +
                "4: Search album by artist\n" +
                "5: Search song by artist\n" +
                "6: View all artists\n" +
                "0: Exit");

        int choice = scanner.nextInt();

        return choice;
    }
}
