# Garage Vehicle Management System

## Overview

The Garage Vehicle Management System is a Java-based application designed to manage a garage's inventory of vehicles. It supports adding, updating, removing, and displaying details of various types of vehicles, including cars, motorcycles, and trucks.

## Features

- **Add Vehicles:** Add cars, motorcycles, and trucks to the garage.
- **Update Vehicles:** Update the details of existing vehicles.
- **Remove Vehicles:** Remove vehicles from the garage.
- **Display Vehicles:** Display all vehicles in the garage.
- **Display Vehicle Details:** Display detailed information about a specific vehicle.

## Classes

### 1. Vehicle (Abstract Class)
- **Fields:** `ownerName`, `brand`, `model`, `year`
- **Methods:** Getters and setters for all fields, `displayInfo()` (abstract method)

### 2. Car (Extends Vehicle)
- **Fields:** `seatingCapacity`
- **Methods:** Getters and setters for seating capacity, override `displayInfo()`

### 3. Motorcycle (Extends Vehicle)
- **Fields:** `engineSize`
- **Methods:** Getters and setters for engine size, override `displayInfo()`

### 4. Truck (Extends Vehicle)
- **Fields:** `cargoCapacity`
- **Methods:** Getters and setters for cargo capacity, override `displayInfo()`

### 5. Garage
- **Fields:** `Vehicle[] vehicles`, `int count`
- **Methods:** `addVehicle()`, `updateVehicle()`, `removeVehicle()`, `displayVehicles()`, `displayVehicleDetails()`

### 6. Main
- **Functionality:** Provides a menu-driven interface for the user to interact with the Garage system.

## Usage

1. **Clone the repository:**
    ```bash
    git clone <repository-url>
    ```

2. **Navigate to the project directory:**
    ```bash
    cd <project-directory>
    ```

3. **Compile the Java files:**
    ```bash
    javac Main.java
    ```

4. **Run the application:**
    ```bash
    java Main
    ```

## Example

```plaintext
Menu:
1. Add a vehicle
2. Update a vehicle
3. Remove a vehicle
4. Display vehicles
5. Display details of a vehicle
0. Exit
Enter your choice: 1
Enter vehicle type (1-Car, 2-Motorcycle, 3-Truck): 1
Enter owner name: Saud Najem
Enter vehicle brand: Toyota
Enter vehicle model: Camry
Enter vehicle year: 2020
Enter seating capacity: 5
Vehicle added to the garage.
```

