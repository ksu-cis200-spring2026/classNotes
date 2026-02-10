import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter inital odometer mileage: ");
        double odometerInitial = s.nextDouble();
        System.out.print("Enter number of readings: ");
        int readings = s.nextInt();
        System.out.println();

        double odometerPrevious = odometerInitial;
        //double gallons;
        int gallonsSum = 0;
        double odometerLast = odometerInitial;
        for (int i = 1; i <= readings; i++){
            System.out.printf("Enter odometer #%d: ", i);
            double odometerCurrent = s.nextDouble();
            System.out.println("Enter the number of gallons purchased: ");
            double gallons = s.nextDouble();
            gallonsSum += gallons;
            System.out.println("Gallons sum: " + gallonsSum);

            double fuelEcon = (odometerCurrent - odometerPrevious) / gallons;
            /*if (i == 1){
                fuelEcon = (odometerCurrent - odometerInitial) / gallons;
            }
            else{
                fuelEcon = (odometerCurrent - odometerLast) / gallons;
            }*/

            System.out.printf("Fuel economy from reading #%d: %.2f%n", i, fuelEcon);
            System.out.println();
            odometerLast = odometerCurrent;
            odometerPrevious = odometerCurrent;

        }

        double distance = (odometerPrevious - odometerInitial) / gallonsSum;
        //double fuelEcon = distance / gallonsSum;
        System.out.println("Distance: " + (odometerPrevious - odometerInitial));
        System.out.println("Gallons: " + gallonsSum);

        System.out.printf("Overall fuel economy: %.2f%n", distance);




        
    }
}