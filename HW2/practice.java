package HW2;
import java.util.Scanner; 
public class practice {
    

public static void main(String[] args){
 
    Scanner side = new Scanner(System.in);
    double base, perpendicular, hypotenuse;
    System.out.println("Let's find the hypotenuse! What is the value of the base?");
    base = side.nextDouble();
    System.out.println("What is the value of the perpendicular?");
    perpendicular = side.nextDouble();
    hypotenuse = Math.sqrt((Math.pow(base, 2)) + (Math.pow(perpendicular, 2)));
    System.out.println("The length of the hypotenuse is " + hypotenuse);

}
}