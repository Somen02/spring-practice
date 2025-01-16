package designPattern.singleton;

public class Main {

    public static void main(String[] args) {
        Bike hornet = Bike.getBike();
        Bike hero = Bike.getBike();
        System.out.println(hornet.hashCode());
        System.out.println(hero.hashCode());

        Car i20 = Car.getCar();
        Car lambo = Car.getCar();

        System.out.println(i20.hashCode());
        System.out.println(lambo.hashCode());    }
}
