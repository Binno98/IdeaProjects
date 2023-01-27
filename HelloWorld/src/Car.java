public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels=4;
        this.engine=true;
    }

    public String startEngine(){
        return this.name+"the car's engine is starting";
    }

    public String accelerate(){
        return this.name+"the car is accelerating";
    }

    public String brake(){
        return this.name +"the car is braking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }


}
