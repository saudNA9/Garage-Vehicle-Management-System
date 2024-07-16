import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add a vehicle");
            System.out.println("2. Update a vehicle");
            System.out.println("3. Remove a vehicle");
            System.out.println("4. Display vehicles");
            System.out.println("5. Display details of a vehicle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter vehicle type (1-Car, 2-Motorcycle, 3-Truck): ");
                    int type = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    switch (type) {
                        case 1:
                            System.out.println("Enter owner name: ");
                            String carOwner = scanner.nextLine();
                            System.out.println("Enter vehicle brand: ");
                            String carBrand = scanner.nextLine();
                            System.out.println("Enter vehicle model: ");
                            String carModel = scanner.nextLine();
                            System.out.println("Enter vehicle year: ");
                            int carYear = scanner.nextInt();
                            System.out.println("Enter seating capacity: ");
                            int seatingCapacity = scanner.nextInt();
                            garage.addVehicle(new Car(carOwner, carBrand, carModel, carYear, seatingCapacity));
                            break;
                        case 2:
                            System.out.println("Enter owner name: ");
                            String motorcycleOwner = scanner.nextLine();
                            System.out.println("Enter vehicle brand: ");
                            String motorcycleBrand = scanner.nextLine();
                            System.out.println("Enter vehicle model: ");
                            String motorcycleModel = scanner.nextLine();
                            System.out.println("Enter vehicle year: ");
                            int motorcycleYear = scanner.nextInt();
                            System.out.println("Enter engine size: ");
                            int engineSize = scanner.nextInt();
                            garage.addVehicle(new Motorcycle(motorcycleOwner, motorcycleBrand, motorcycleModel, motorcycleYear, engineSize));
                            break;
                        case 3:
                            System.out.println("Enter owner name: ");
                            String truckOwner = scanner.nextLine();
                            System.out.println("Enter vehicle brand: ");
                            String truckBrand = scanner.nextLine();
                            System.out.println("Enter vehicle model: ");
                            String truckModel = scanner.nextLine();
                            System.out.println("Enter vehicle year: ");
                            int truckYear = scanner.nextInt();
                            System.out.println("Enter cargo capacity (tons): ");
                            double cargoCapacity = scanner.nextDouble();
                            garage.addVehicle(new Truck(truckOwner, truckBrand, truckModel, truckYear, cargoCapacity));
                            break;
                        default:
                            System.out.println("Invalid vehicle type choice.");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Enter owner name of the vehicle to update: ");
                    String updateOwner = scanner.nextLine();
                    System.out.println("Enter new owner name: ");
                    String owner = scanner.nextLine();
                    System.out.println("Enter new vehicle brand: ");
                    String brand = scanner.nextLine();
                    System.out.println("Enter new vehicle model: ");
                    String model = scanner.nextLine();
                    System.out.println("Enter new vehicle year: ");
                    int year = scanner.nextInt();
                    garage.updateVehicle(brand, model, year, owner, updateOwner);
                    break;
                case 3:
                    System.out.println("Enter owner name of the vehicle to remove: ");
                    String removeOwner = scanner.nextLine();
                    garage.removeVehicle(removeOwner);
                    break;
                case 4:
                    garage.displayVehicles();
                    break;
                case 5:
                    System.out.println("Enter owner name of the vehicle to display details: ");
                    String displayOwner = scanner.nextLine();
                    garage.displayVehicleDetails(displayOwner);
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
