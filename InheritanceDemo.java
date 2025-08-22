import java.util.Scanner;

// ---------- Single-Level Inheritance ----------
class Animal {
    String name;
    void getData(String n) {
        name = n;
    }
    void display() {
        System.out.println("Animal: " + name);
    }
}

class Dog extends Animal {
    String breed;
    void getBreed(String b) {
        breed = b;
    }
    void show() {
        display();
        System.out.println("Breed: " + breed);
    }
}

// ---------- Multi-Level Inheritance ----------
class Vehicle {
    String type;
    void getType(String t) {
        type = t;
    }
    void displayType() {
        System.out.println("Vehicle Type: " + type);
    }
}

class Car extends Vehicle {
    String brand;
    void getBrand(String b) {
        brand = b;
    }
    void displayBrand() {
        displayType();
        System.out.println("Brand: " + brand);
    }
}

class ElectricCar extends Car {
    int batteryCapacity;
    void getBattery(int c) {
        batteryCapacity = c;
    }
    void showDetails() {
        displayBrand();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// ---------- Main Class ----------
public class InheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Demonstration:");
        System.out.println("1. Single-Level Inheritance");
        System.out.println("2. Multi-Level Inheritance");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // clear buffer

        switch(choice) {
            case 1:
                Dog d = new Dog();
                System.out.print("Enter Animal Name: ");
                String n = sc.nextLine();
                d.getData(n);

                System.out.print("Enter Dog Breed: ");
                String b = sc.nextLine();
                d.getBreed(b);

                System.out.println("\n--- Single-Level Inheritance Output ---");
                d.show();
                break;

            case 2:
                ElectricCar e = new ElectricCar();
                System.out.print("Enter Vehicle Type: ");
                String t = sc.nextLine();
                e.getType(t);

                System.out.print("Enter Car Brand: ");
                String br = sc.nextLine();
                e.getBrand(br);

                System.out.print("Enter Battery Capacity (kWh): ");
                int cap = sc.nextInt();
                e.getBattery(cap);

                System.out.println("\n--- Multi-Level Inheritance Output ---");
                e.showDetails();
                break;

            default:
                System.out.println("Invalid Choice!");
        }
    }
}
