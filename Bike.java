package DomashnayaZadaniya.Vehicle;

public class Bike extends Vehicle {
    private boolean hasHelmet;
    private boolean hasGloves;
    private int countWheels;

    public Bike(String brand, String model, String color, int yearOfRelease,
                String vehicleClasss, boolean engine, boolean hasHelmet, boolean hasGloves) {
        super(brand, model, color, yearOfRelease, vehicleClasss, engine);
        this.hasHelmet = hasHelmet;
        this.hasGloves = hasGloves;
        this.countWheels = 2;
    }

    public boolean getHasHelmet() {
        return hasHelmet;
    }
    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }

    public boolean getHasGloves() {
        return hasGloves;
    }
    public void setHasGloves(boolean hasGloves) {
        this.hasGloves = hasGloves;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHelmet: " + hasHelmet + "\nGloves: " + hasGloves + "\nWheels: " + countWheels;
    }

    @Override
    public void modelInfo() {
        System.out.println(getModel());
    }
}
