public class Garage {
    private Vehicle[] vehicles;
    private int count;

    public Garage() {
        this.vehicles = new Vehicle[100];
        this.count = 0;
    }

    public void addVehicle(Vehicle vehicle) {
        if (count < vehicles.length) {
            vehicles[count] = vehicle;
            count++;
            System.out.println("Vehicle added to the garage.");
        } else {
            System.out.println("Garage is full. Cannot add more vehicles.");
        }
    }

    public void updateVehicle(String brand, String model, int year, String newOwner, String currentOwner) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (vehicles[i].getOwnerName().equalsIgnoreCase(currentOwner)) {
                vehicles[i].setBrand(brand);
                vehicles[i].setModel(model);
                vehicles[i].setYear(year);
                vehicles[i].setOwnerName(newOwner);
                System.out.println("Vehicle updated successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Vehicle with owner '" + currentOwner + "' not found. Update failed.");
        }
    }

    public void removeVehicle(String ownerName) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (vehicles[i].getOwnerName().equalsIgnoreCase(ownerName)) {
                vehicles[i] = vehicles[count - 1];
                vehicles[count - 1] = null;
                count--;
                System.out.println("Vehicle removed from the garage.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Vehicle with owner '" + ownerName + "' not found. Removal failed.");
        }
    }

    public void displayVehicles() {
        if (count == 0) {
            System.out.println("The garage is empty.");
        } else {
            for (int i = 0; i < count; i++) {
                vehicles[i].displayInfo();
                System.out.println();
            }
        }
    }

    public void displayVehicleDetails(String ownerName) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (vehicles[i].getOwnerName().equalsIgnoreCase(ownerName)) {
                vehicles[i].displayInfo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Vehicle with owner '" + ownerName + "' not found.");
        }
    }
}
