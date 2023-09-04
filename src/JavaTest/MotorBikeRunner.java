package JavaTest;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        ducati.start();
        honda.start();

        ducati.setSpeed(200);
        System.out.println(ducati.getSpeed());

        //honda.setSpeed(100);
        System.out.println(honda.getSpeed());
    }
}
