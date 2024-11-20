public class Car extends Vehicle {
    private int numberOfDoors;
    public Car(int speed, double fuel, int numberOfDoors) {
        super(speed, fuel);
        this.numberOfDoors = numberOfDoors;
    }
    public void start() {
        System.out.println("The car has started. Vroom Vroom!");
    }

    // Method for the honk
    public void honk() {
        System.out.println("Beep Beep!");
    }

    // Getter for numberOfDoors is fixed
    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    // Setter for numberOfDoors is set
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
