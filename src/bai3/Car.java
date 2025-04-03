package bai3;

public class Car {
    private String engine;
    private int seats;
    private String color;

    private Car(CarBuilder builder) {
        this.engine = builder.getEngine();
        this.seats = builder.getSeats();
        this.color = builder.getColor();
    }

    public void display() {
        System.out.println("Car [Engine: " + engine + ", Seats: " + seats + ", Color: " + color + "]");
    }

    public static Car createFromBuilder(CarBuilder builder) {
        return new Car(builder);
    }
}
