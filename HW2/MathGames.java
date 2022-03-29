package HW2;

import java.util.Scanner;
// import javax.sql.rowset.spi.SyncResolver;
public class MathGames {
    // 1. Create a method that will calculate the Pythagorean Theorem (https://en.wikipedia.org/wiki/Pythagorean_theorem)
    // c = sqrt(a^2+b^2)
    // NOTE: You can assume you will only need to calculate the Hypotenuse
    // Hint 1: Method should take in 2 sides(a and b) of the triangle and return the missing side.
    //      Remember the Triangle has a base, Perpendicular, and Hypotenuse
    // Hint 2: Math.pow and Math.sqrt are your friend here
    // Bonus points: Try to make it accept any 2 sides and return the 3rd. So it can take in
    public static String hypotenuse(double base, double perpendicular){
        return "The length of the hypotenuse is: " + Math.sqrt((Math.pow(base, 2)) + (Math.pow(perpendicular, 2)));
    }
    // 2. Create a method that will calcuate my grade in the class. You can use the grade range as follows
        // A: 100 - 90
        // B:  89 - 80
        // C:  79 - 70
        // D:  69 - 60
        // F:  60 -  0 
        // method should accept the grade as a double and return the letter grade of what I got
        // NOTE: Im a really nice guy and always round up on my grading so a 69.3 will round up to a 70.0
        // Hint 1: if statements are your friend here you will probably need at the least 5 if / ifelse / else statments
        // Hint 2: You will probably need to cast the double to an int
        // Hint 3: You will probably need to use the Math.ceil() method 
        public static String gradeCalc(double avg){
            
            
            if(avg >= 90){
                return "A";
            }
            else if(avg >= 80 && avg < 90){
                return "B";
            }
            else if(avg >= 70 && avg < 80){
                return "C";
            }
            else if(avg >= 60 && avg < 70){
                return "D";
            }
            else if(avg <= 60){
                return "F";
            }
            else{
                return "Error";
           }
        }

    // 3. Create a method that will calculate the tip on a bill per person
    //      Method parameters: total bill, amount of people splitting the bill, percentage to tip.
    //      Note: I would like the total always rounded up to a whole number
    //      Hint 1: percentage can be made easier to work with if you divide by 100 so 18% is 18/100 = 0.18
    //      Hint 2: Using doubles will be helpful for when you need to calculate decimals
    //      Hint 3: It is possible you might need to Cast a double to an int or vice versa
    //      Hint 4: You will probably need to use the Math.ceil() method 
    
    
    public static String tipCalc(double bill, double ppl, double percent){
       
        double myBill = Math.ceil(bill/ppl);
        double tip = myBill * (percent/100);
        return "You should tip $" + tip;
    }


    // you do not need this main if you want to make a tester class
     public static void main(String[] args){
        Scanner choice = new Scanner(System.in);
        System.out.println("Hello! would you like to (a) use the pythagorean theorem, (b) calculate your grade, or (c) calculate a tip?");
        String input = choice.nextLine();
        if(input.equalsIgnoreCase("a")){
            Scanner side = new Scanner(System.in);
            System.out.println("Let's find the hypotenuse! What is the value of the base?");
            double base = side.nextDouble();
            System.out.println("What is the value of the perpendicular?");
            double perpendicular = side.nextDouble();
            side.close(); 
            System.out.println(hypotenuse(base, perpendicular));
        }
        else if(input.equalsIgnoreCase("b")){
            Scanner grade = new Scanner(System.in);
            System.out.println("what's your number grade?");
            double avg = Math.ceil(grade.nextDouble());
            grade.close();
            System.out.println("The student's grade is: " + gradeCalc(avg));
        }
        else if(input.equalsIgnoreCase("c")){
            Scanner info = new Scanner(System.in);
            System.out.println("Let's find the tip :) What is your total bill?");
            double bill = Math.ceil(info.nextDouble());
            System.out.println("How many people are splitting the bill?");
            int ppl = info.nextInt();
            System.out.println("What percentage are you tipping?");
            double percent = info.nextDouble();
            info.close();
            System.out.println(tipCalc(bill, ppl, percent));
        }
        else{
            System.out.println("Error");
        }
        choice.close();
     }

        

        
}

     