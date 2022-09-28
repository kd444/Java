
public class MotorBike {
    public MotorBike() {

    }

    // state
    int speed; // member variable belong to an object

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) { // local varibale
        this.speed = speed;
        // whatever comes to method set in instance variable
        // this.speed is the one we defined member variable
    }

    // behaviour
    void start() {
        System.out.println("Bike started");
    }

}
