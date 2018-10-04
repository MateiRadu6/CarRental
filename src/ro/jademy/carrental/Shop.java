package ro.jademy.carrental;

import ro.jademy.carrental.carlist.Bentley;
import ro.jademy.carrental.carlist.Dacia;
import ro.jademy.carrental.cars.Car;
import ro.jademy.carrental.cars.Engine;

import java.util.*;


import static ro.jademy.carrental.cars.TransmissionType.AUTOMATIC;
import static ro.jademy.carrental.cars.TransmissionType.MANUAL;
import static ro.jademy.carrental.cars.CarBodyStyle.COUPE;
import static ro.jademy.carrental.cars.CarBodyStyle.SEDAN;
import static ro.jademy.carrental.cars.Color.*;
import static ro.jademy.carrental.cars.EngineType.GASOLINE;


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
                System.out.println("Welcome " + salesman.getFirstName() + " " + salesman.getLastName());
                return true;
            }
        }
        System.out.print("Wrong pass/user. \nTry again.");
        System.out.println(" ");
        return false;
    }

    public boolean login() {
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
        System.out.println("4. Options");
        System.out.println("5. Check income");
        System.out.println("6. Logout");
        System.out.println("7. Exit");

        System.out.println("Please select an option : ");
        int option = scanner.nextInt();

        switch (option) {
            case 1: {
                showAllCars(carList);
                break;
            }
            case 2: {
                showAvailableCars(carList);
                break;
            }
            case 3: {
                showRentedCars(carList);
                break;
            }
            case 4: {
                showListMenuOptions();
            }
            case 5: {
                checkIncome(carList);
            }

            case 7: {
                login();
                break;
            }
            case 8: {
                System.exit(0);
                break;
            }
        }
    }


    public void showListMenuOptions() {

        System.out.println("Select an action from below:");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by budget");
        //System.out.println("4 Filter by specs");
        // TODO: add additional filter methods based on car specs

        System.out.println("4. Back to previous menu");

        int option = scanner.nextInt();

        switch (option) {
            case 1: {
                showCarsByMake(carList);
                break;
            }
            case 2: {
                showCarsByModel(carList);
                break;
            }
            case 3: {
                showBudgetSortMenu();
                break;
            }
            case 4: {
                checkIncome(carList);
                break;
            }
        }
    }

    public void showBudgetSortMenu() {
        System.out.println("1. Price ascending");
        System.out.println("2. Price descending");
        System.out.println("7. Back to previous menu\n");

    int option = scanner.nextInt();

        switch (option) {
        case 1: {
            sortByPriceAscending();
            break;
        }
        case 2: {
            sortByPriceDescending();
            break;
        }
        case 3: {
            //showp revious menu
            break;
        }
    }
}




    public void calculatePrice(int numberOfDays) {
        // TODO: apply a discount to the base price of a car based on the number of rental days
        // TODO: document the implemented discount algorithm

        // TODO: for a more difficult algorithm, change this method to include date intervals and take into account
        //       weekdays and national holidays in which the discount should be smaller

        // Q: what should be the return type of this method?
    }

    //ENGINES

    Engine daciaEngine1900 = new Engine(3, 1900, GASOLINE);
    Engine daciaEngine1100 = new Engine(3, 1100, GASOLINE);
    Engine bentleyEngine = new Engine(12, 6000, GASOLINE);

    //CARS

    Car daciaLogan1 = new Dacia("Dacia", "Logan", 2015, SEDAN, 4, PINK, MANUAL, daciaEngine1900, 100, false);
    Car daciaLogan2 = new Dacia("Dacia", "Logan", 2015, SEDAN, 4, GRAY, MANUAL, daciaEngine1100, 100, false);
    Car daciaLogan3 = new Dacia("Dacia", "Logan", 2016, SEDAN, 4, RED, MANUAL, daciaEngine1100, 100, false);
    Car daciaLogan4 = new Dacia("Dacia", "Logan", 2016, SEDAN, 4, GREEN, MANUAL, daciaEngine1900, 100, true);
    Car daciaLogan5 = new Dacia("Dacia", "Logan", 2015, SEDAN, 4, BLUE, MANUAL, daciaEngine1900, 100, false);

    Car continentalGt1 = new Bentley("Bentley", "Continental GT", 2018, COUPE, 4, GRAY, AUTOMATIC, bentleyEngine, 350, false);

    List<Car> carList = new ArrayList<>(Arrays.asList(daciaLogan1, daciaLogan2, daciaLogan3, daciaLogan4, daciaLogan5, continentalGt1));


    //Menu methods

    public void showAllCars(List<Car> cars) {

        for (Car car : cars) {
            printCar(car);
        }

    }

    public void showAvailableCars(List<Car> cars) {

        for (Car car : cars) {
            if (!car.isRented()) {
                printCar(car);
            }
        }
    }

    public void showRentedCars(List<Car> cars) {
        for (Car car : cars) {
            if (car.isRented()) {
                printCar(car);
            }
        }
    }

    public void showCarsByMake(List<Car> cars) {
        System.out.println("Input make: ");
        String inputMake = scanner.nextLine();
        for (Car car : cars) {
            if (car.getMake().equalsIgnoreCase(inputMake)) {
                printCar(car);
            }
        }
    }

    public void showCarsByModel(List<Car> cars) {
        System.out.println("Input model: ");
        String inputMake = scanner.nextLine();
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(inputMake)) {
                printCar(car);
                System.out.println();
            }
        }
    }

    public void sortByPriceAscending(){
        System.out.println("Enter min budget");
        int budget = scanner.nextInt();
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : filteredCars) {
            if(car.getBasePrice() >= budget){
                printCar(car);
                System.out.println();
            }
        }

    }

    public void sortByPriceDescending(){
        System.out.println("Enter max budget");
        int budget = scanner.nextInt();
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : filteredCars) {
            if(car.getBasePrice() < budget){
                printCar(car);
            }
        }
    }

    public int checkIncome(List<Car> cars){
        int currentIncome = 0;
        for (Car car : cars) {
            if(car.isRented()){
               currentIncome += car.getBasePrice();
            }
        }
        System.out.println(currentIncome + " RON");
        return currentIncome;
    }

    public void printCar(Car car) {
        System.out.print(car.getMake() + " " + car.getModel() + " " + car.getYear() + "  " + car.getBasePrice() + "RON   " + car.getColor() + "   " + car.getDoorNumber() + " Doors" + "   " + car.getTransmissionType());
        System.out.println();
    }

    }


