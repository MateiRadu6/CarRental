package ro.jademy.carrental;

import ro.jademy.carrental.carlist.Bentley;
import ro.jademy.carrental.carlist.Dacia;
import ro.jademy.carrental.cars.Car;
import ro.jademy.carrental.cars.Engine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static ro.jademy.carrental.cars.TransmissionType.AUTOMATIC;
import static ro.jademy.carrental.cars.TransmissionType.MANUAL;
import static ro.jademy.carrental.cars.CarBodyStyle.COUPE;
import static ro.jademy.carrental.cars.CarBodyStyle.SEDAN;
import static ro.jademy.carrental.cars.Color.*;
import static ro.jademy.carrental.cars.EngineType.GASOLINE;

//all methods
public class Shop {

    Scanner scanner = new Scanner(System.in);

    List<Salesman> salesmen = new ArrayList<>();

    public Shop() {

        Salesman salesman1 = new Salesman("salesman", "1", "user1", "123");
        Salesman salesman2 = new Salesman("salesman", "2", "user2", "123");
        Salesman salesman3 = new Salesman("salesman", "3", "user3", "123");

        salesmen.addAll(Arrays.asList(salesman1, salesman2, salesman3));
    }


    public boolean login(String username, String password) {

        for (Salesman salesman : salesmen) {
            if (username.equals(salesman.getUsername()) && password.equals(salesman.getPassword())) {
                System.out.print("You logged in");
                System.out.println();
                System.out.println("Welcome "+salesman.getFirstName()+" "+salesman.getLastName());
                return true;
            }
        }
        System.out.print("Wrong pass/user. \nTry again.");
        System.out.println(" ");
        return false;
    }

    public void showMenu() {

        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the Jademy Car Rental Service   |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
        System.out.println("                    MAIN MENU                   ");
        System.out.println("1. List all cars");
        System.out.println("2. List available cars");
        System.out.println("3. List rented cars");
        System.out.println("4. Check income");
        System.out.println("5. Logout");
        System.out.println("6. Exit");

        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        switch (option) {
            case 1: {
                showAllCars(carList);
                break;
            }
            case 2: {
                //listAvailableCars();
                break;
            }
            case 3: {
                //listRentedCars();
                break;
            }
            case 4: {
                //checkIncome();
            }

            case 7: {
                // logout();
                break;
            }
            case 8: {
                //shop.exit
                break;
            }
        }
    }


    public void showListMenuOptions() {

        System.out.println("Select an action from below:");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by budget");
        // TODO: add additional filter methods based on car specs

        System.out.println("4. Back to previous menu");

    }

    private void showListCarsMenu() {
        System.out.println("                    LIST CARS                   ");
        System.out.println("1. List all cars");
        System.out.println("2. List available cars");
        System.out.println("3. List rented cars");
        System.out.println("4. List service cars");
        System.out.println("5. Main menu");
    }

    private void showSortMenu() {
        System.out.println("\n                   SORT MENU                    ");
        System.out.println("1. Make");
        System.out.println("2. Body");
        System.out.println("3. Budget");
        System.out.println("4. Year");
        System.out.println("5. Fuel");
        System.out.println("6. Transmission");
        System.out.println("7. Back to previous menu\n");
    }

    private void showSortMake() {
        System.out.println("\n                 SORT BY MAKE                  ");
        System.out.println("1. Dacia");
        System.out.println("2. Opel");
        System.out.println("3. BMW");
        System.out.println("4. Audi");
        System.out.println("5. Mercedes");
    }

    private void showSortModel() {
        System.out.println("\n                SORT BY MODEL                   ");
        System.out.println("1. Sedan");
        System.out.println("2. Coupe");
        System.out.println("3. Hatchback");
        System.out.println("4. Convertible");
        System.out.println("5. Wagon");
        System.out.println("6. SUV");
    }

    private void showSortBudget() {
        System.out.println("\n                SORT BY BUDGET                  ");
        System.out.println("1. Less than 10000");
        System.out.println("2. Between 10000 and 20000");
        System.out.println("3. More than 20000");
    }

    public void calculatePrice(int numberOfDays) {
        // TODO: apply a discount to the base price of a car based on the number of rental days
        // TODO: document the implemented discount algorithm

        // TODO: for a more difficult algorithm, change this method to include date intervals and take into account
        //       weekdays and national holidays in which the discount should be smaller

        // Q: what should be the return type of this method?
    }

    //ENGINES

    Engine daciaEngine = new Engine(3, 1900, GASOLINE);
    Engine bentleyEngine = new Engine(12, 6000, GASOLINE);

    //CARS

    Car daciaLogan1 = new Dacia("Dacia", "Logan", 2015, SEDAN, 4, PINK, MANUAL, daciaEngine, 100, false);
    Car daciaLogan2 = new Dacia("Dacia", "Logan", 2015, SEDAN, 4, GRAY, MANUAL, daciaEngine, 100, false);
    Car daciaLogan3 = new Dacia("Dacia", "Logan", 2016, SEDAN, 4, RED, MANUAL, daciaEngine, 100, false);
    Car daciaLogan4 = new Dacia("Dacia", "Logan", 2016, SEDAN, 4, GREEN, MANUAL, daciaEngine, 100, true);
    Car daciaLogan5 = new Dacia("Dacia", "Logan", 2015, SEDAN, 4, BLUE, MANUAL, daciaEngine, 100, false);

    Car continentalGt1 = new Bentley("Bentley", "Continental GT", 2018, COUPE, 4, GRAY, AUTOMATIC, bentleyEngine, 350, false);

    List<Car> carList = new ArrayList<>(Arrays.asList(daciaLogan1, daciaLogan2, daciaLogan3, daciaLogan4, daciaLogan5, continentalGt1));


    //Menu methods
    
    public void showAllCars(List<Car> cars){

        for (Car car : cars) {
            System.out.print(car.getMake()+" "+car.getModel()+"     ");
            System.out.print(car.getColor().toString());
            System.out.println();
        }
        
    }

    public void showAvailableCars(List<Car> cars){

        for (Car car : cars) {
            if(car.isRented()) {
                System.out.print(car.getMake() + " " + car.getModel() + "     ");
                System.out.print(car.getColor().toString());
                System.out.println();
            }else{
                System.out.println("No available cars");
            }
        }

    }

}
