
public class MotorBikeRunner {

    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();
        ducati.start();
        honda.start();
        honda.setSpeed(80);
        ducati.setSpeed(100);
        honda.speed = 0;
    }

}
