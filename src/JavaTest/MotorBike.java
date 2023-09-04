package JavaTest;
public class MotorBike {
    //state
    private int speed; // member variable

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed){ //local variable
        this.speed = speed;
    }

    void start(){
        System.out.println("Bike Started");
    }

}
