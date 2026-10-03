import java.util.Scanner;
public class DataTypes{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vehicle number:");
        int vehicleNumber = sc.nextInt();

        System.out.println("Enter waste collected in kg:");
        double wasteCollected = sc.nextDouble();

        System.out.println("Enter number of collection points:");
        int collectionPoints = sc.nextInt();
    
        System.out.println("Enter vehicle status:");
        char vehicleStatus = sc.next().charAt(0);

        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected: " + wasteCollected + " kg");
        System.out.println("Number of Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);
    }
}