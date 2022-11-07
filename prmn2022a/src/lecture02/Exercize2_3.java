package lecture02;

public class Exercize2_3 {
    public static void main(String[] args) {
        Tire t = new Tire(65);
        Engine e = new Engine(4000);
        GasStation gs = new GasStation();

        Car c = new Car(t,e);

        gs.refuel(c);
        c.startEngine();
        c.run();
    }
}
