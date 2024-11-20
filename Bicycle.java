public class Bicycle extends Vehicle {
    private boolean hasBell;

    public Bicycle(int speed, float fuel, boolean hasBell) {
        super(speed, fuel);
        this.hasBell = hasBell;
    }
    public void start() {
        System.out.println("Pedal away! The bicycle has started.");
    }
    public void ringBell() {
        if (this.hasBell) {
            System.out.println("Ring Ring!");
        } else {
            System.out.println("This bicycle has no bell.");
        }
    }

    // hasBell Getter
    public boolean hasBell() {
        return this.hasBell;
    }

    // Setter for hasBell
    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }
}
