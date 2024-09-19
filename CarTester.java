import java.util.Scanner;
public class CarTester{
    public Car addCar(){
        Scanner carNameScanner = new Scanner(System.in);
        System.out.println("Please enter the car's name: ");
        String carName = carNameScanner.nextLine();
       
        Scanner carMilesScanner = new Scanner(System.in);
        System.out.println("Please enter cars miles: ");
        int carMiles = carMilesScanner.nextInt();
       
        Scanner carGallonsScanner = new Scanner(System.in);
        System.out.println("Please enter cars gallons: ");
        int carGallons = carGallonsScanner.nextInt();
       
        Car newCar = new Car(carName, carMiles, carGallons);
        return newCar;
    }
   
    public static void main(String[] args){
        CarTester testCar = new CarTester();
        Car testCar1 = testCar.addCar();
        System.out.println(testCar1.toString());
       
        Car testCar2 = testCar.addCar();
        System.out.println(testCar2.toString());
    }
}

/*
 * Please enter the car's name: 
Honda Civic
Please enter cars miles: 
234
Please enter cars gallons: 
100
Honda Civic averaged 2.3m/g
Please enter the car's name: 
Toad Mobile
Please enter cars miles: 
13
Please enter cars gallons: 
7
Toad Mobile averaged 1.9m/g
 */
