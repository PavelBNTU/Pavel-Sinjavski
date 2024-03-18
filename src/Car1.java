public class Car1 {

    public static void main(String[] args)
    {
    Car car = new Car(17.5, "Summer", "Toyota Camry", 5, "B");
    CarKey key = new CarKey("Remote");

        car.unlock(key);
        car.start();
        car.stop();
}

static abstract class Motor {
    private double volume;
    private String fuelType;
    private String name;

    public Motor(double volume, String fuelType, String name) {
        this.volume = volume;
        this.fuelType = fuelType;
        this.name = name;
    }

    public abstract void start();

    public abstract void stop();
}

interface Wheels {
    double getRadius();
    String getSeasonality();
    String getName();
}

static class Car extends Motor implements Wheels {
    private double radius;
    private String seasonality;
    private String name;
    private int seats;
    private String drivingLicenseCategory;
    private Key key;

    public Car(double radius, String seasonality, String name, int seats, String drivingLicenseCategory) {
        super(0, "", "");
        this.radius = radius;
        this.seasonality = seasonality;
        this.name = name;
        this.seats = seats;
        this.drivingLicenseCategory = drivingLicenseCategory;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public String getSeasonality() {
        return seasonality;
    }

    @Override
    public String getName() {
        return name;
    }

    public void unlock(Key key) {
        this.key = key;
        System.out.println("Car unlocked with " + key.getKeyType() + " key.");
    }

    @Override
    public void start() {
        System.out.println("Автомобиль едет.");
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль стоит.");
    }
}

static abstract class Key {
    private String keyType;

    public Key(String keyType) {
        this.keyType = keyType;
    }

    public abstract void unlock();

    public String getKeyType() {
        return keyType;
    }
}

static class CarKey extends Key {

    public CarKey(String keyType) {
        super(keyType);
    }

    @Override
    public void unlock() {
        System.out.println("CarKey unlocked the car.");
    }
}
}
