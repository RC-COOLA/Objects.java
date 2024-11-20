public class Vehicle {
    protected int speed;
    public float fuel;   

    //Constructor for the speed ans fuel 
    public Vehicle(int speed, float fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

    // Method to start the vehicle
    public void start() {
        System.out.println("The vehicle has started.");
    }

    // Method to stop the vehicle
    public void stop() {
        System.out.println("The vehicle has stopped.");
    }

    // Method to display fuel level
    public final void displayFuel() {
        System.out.println("Fuel level: " + this.fuel + " liters");
    }

    // Getter for speed
    public int getSpeed() {
        return this.speed;
    }

    // Setter for speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter for fuel
    public float getFuel() {
        return this.fuel;
    }

    // Setter for fuel
    public void setFuel(float fuel) {
        this.fuel = fuel;
    }
}
