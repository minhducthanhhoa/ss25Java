package bai3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new CarBuilder()
                .setEngine("V8")
                .setSeats(4)
                .setColor("Red")
                .build();

        Car car2 = new CarBuilder()
                .setEngine("Electric")
                .setSeats(2)
                .setColor("Blue")
                .build();

        car1.display();
        car2.display();
    }
}
