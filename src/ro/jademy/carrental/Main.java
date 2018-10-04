package ro.jademy.carrental;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Q: this is the main entry point of our program. What should we do here?
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);
        String inputUser;
        String inputPass;

        do {
            System.out.println("Input user:");
            inputUser = scanner.nextLine();
            System.out.println("Input password:");
            inputPass = scanner.nextLine();
        }while(!shop.login(inputUser, inputPass));


        shop.showMenu();
        System.out.println();
        shop.showListMenuOptions();
        shop.showBudgetSortMenu();
    }
}
