package DomashnayaZadaniya.Vehicle;

public class Vehicle {
    private String brand;
    private String model;
    private String color;
    private int yearOfRelease;
    private String vehicleClasss;
    private boolean engine;


    public Vehicle () {}

    public Vehicle (String brand, String model, String color, int yearOfRelease, String vehicleClasss,
                    boolean engine) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        if(yearOfRelease > 0){
            this.yearOfRelease = yearOfRelease;
        }
        this.vehicleClasss = vehicleClasss;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return yearOfRelease;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.yearOfRelease = year;
        }
    }

    public String getVehicleClass() {
        return vehicleClasss;
    }

    public void setVehicleClass(String vehicleClass) {
        this.vehicleClasss = vehicleClass;
    }

    public boolean getEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public String toString() {
        return "Brand: " + brand + "\nModel: " + model + "\nColor: " + color + "\nYear: " + yearOfRelease + "\nClass: " + vehicleClasss + "\nEngine: " + engine;
    }

    public void modelInfo() {
        System.out.println(model);
    }
}
