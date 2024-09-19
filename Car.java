public class Car {
    private String carName;
    private double milesDriven;
    private double gallonsUsed;
    
    public Car(String name, double miles, double gallons) {
        carName = name;
        milesDriven = miles;
        gallonsUsed = gallons;
    }
    public String carName() {
        return carName;
    }
    public double milesDriven(){
        return milesDriven;
    }
    public double gallonsUsed() {
        return gallonsUsed;
    }
    public void setName(String newName) {
        carName = newName;
    }
    
    public void getMiles(double newMiles){
         milesDriven = newMiles;
    }
    
    public void getGallons(double newGallons) {
         gallonsUsed = newGallons;
    }
    
    public double calculateAverage(){
        double average = Math.round(milesDriven/gallonsUsed);
        return Math.round(average *10.0)/10.0;
    }
    
    public String toString() {
        String toString = carName + "averaged" + calculateAverage() + "m/g";
        return toString;
    }
}

