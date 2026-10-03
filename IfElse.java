import java.util.Scanner;
public class IfElse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter waste collected in kg:");
        double waste = sc.nextDouble();
        if(waste >= 100){
            System.out.println("Collection target archived");
        }
        else{
            System.out.println("More waste collection required");
        }
    }
        
}