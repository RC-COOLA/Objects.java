public class Main {
    public static void main(String[] args) {
        Car car = new Car(120, 50.0, 4);
        car.start();           
        car.displayFuel();     
        car.honk();            

        Bicycle bicycle = new Bicycle(25, 0.0, true);
        bicycle.start();       
        bicycle.displayFuel(); 
        bicycle.ringBell();    

        car.setSpeed(150);
        car.setFuel(40.0);
        System.out.println("Updated Car Speed:" + car.getSpeed() + " MPH");
        System.out.println("Updated Car Fuel: " + car.getFuel() + " liters");

        bicycle.sethasBell(false);
        bicycle.ringBell();
    }
}
