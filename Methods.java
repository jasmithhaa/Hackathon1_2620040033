import java.util.Scanner;
public class Methods{
    static double calculateTotalWaste(double point1, double point2){
        return point1 + point2;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter waste collected at point1:");
        double point1 = sc.nextDouble();
        System.out.println("Enter waste collected at point2:");
        double point2 = sc.nextDouble();

        double totalWaste = calculateTotalWaste(point1, point2);
        System.out.println("Total waste collected: " + totalWaste + " kg");
    }
}