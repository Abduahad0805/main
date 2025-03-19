package DomashnayaZadaniya.Vehicle;

public class Car extends Vehicle{
    private int countPassengers = 0;
    private int countWheels;
    private boolean baggage;

    public Car(String brand, String model, String color, int yearOfRelease,
               String vehicleClasss, boolean engine, boolean baggage, int countPassengers) {
        super(brand, model, color, yearOfRelease, vehicleClasss, engine);
        if (countPassengers > 0 && countPassengers < 5) {
            this.countPassengers = countPassengers;
        }
        this.countWheels = 4;
        this.baggage = baggage;

    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        if (countPassengers > 0 && countPassengers < 5) {
            this.countPassengers = countPassengers;
        }
    }

    public int getCountWheels() {
        return countWheels;
    }

    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }

    public boolean isBaggage() {
        return baggage;
    }

    public void setBaggage(boolean baggage) {
        this.baggage = baggage;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPassengers: " + countPassengers + "\nWheels: " + countWheels + "\nBaggage: " + baggage;
    }

    @Override
    public void modelInfo(){
        System.out.println(getModel());
    }
}
