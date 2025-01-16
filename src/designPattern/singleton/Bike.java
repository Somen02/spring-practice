package designPattern.singleton;

public class Bike {

    private static Bike bike;

    private Bike() {

    }

    //Lazy initialization of creating a sigle object
    //for thread safety we can use synchronized block for specific part where we are creating object
    public static Bike getBike() {

        if (bike == null) {
            synchronized (Bike.class){
                if (bike == null) {
                    bike = new Bike();
                }
            }
        }
        return bike;
    }
}
