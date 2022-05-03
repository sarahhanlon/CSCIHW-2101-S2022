package HW3;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class Loops {

    //NOTE: DO NOT change anything in the boiler plate
    //If I added default code it is meant to be there
    //and should not be adjusted unless otherwise noted
    //(return statments are usually changed)

    //Make a method that will return true if a given 
    //String contains between 1 and 3 'e' chars.
    //Ex.
    //loopE("eat") -> true
    //eeat -> true
    //eeeat -> true
    //eeeeat -> false

    public static boolean loopE(String str){
        int amount = 0;
        for (int i=0; i < str.length(); i++){
            if (str.charAt(i) == 'e'){
                amount++;
            }
        }
        if (1 <= amount && amount <= 3){    
            return true;
        }else{
            return false;
        }
    }

    //Given a String str and int n return a larger string
    //that is n copies of the original string 
    //Ex.
    //stringTimes("Code",2) ->"CodeCode"
    //stringTimes("Code",4) ->"CodeCodeCodeCode"
    public static String stringTimes(String str, int n) {
        for (int i=0; i < n; i++){
            System.out.print(str);
        }


        return "";
    } 

    //Create a method Given a string, return the string where all of the "z"
    //Have been removed. Except do not remove a z at the start
    //or end
    //Ex.
    //stringT("zHelloz") -> "zHelloz"
    //stringT("nozthaznks") -> "nothanks"
    //stringT("xksiazdjaasldzsajzasdz") -> "xksiadjaasldsajasdz"
    public static String stringZ(String str, char z){
        int j = str.length()-1;
        String newString = "";
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'z' && str.charAt(i) != 'z'){
                newString += str.charAt(i);
            }if (i >= 0 && str.charAt(i) != 'z' && str.charAt(i) != 'z'){
                newString += str.charAt(i);
            }if (i == 0 && str.charAt(i) == 'z'){
                newString += str.charAt(i);
            }if (i == j && str.charAt(i) == 'z'){
                newString += str.charAt(i);
            }
            }
            return newString;
    }
    //Create a method that contains a while loop that allows for
    //The user to input numbers until the number 0 is entered. Each time a number is 
    //entered the total will be summed and then prompted for a second number. 
    //NOTE: I require the use of scanner here to get each integer from the user
    //Assume the numbers entered are integers
    //Also note that the method is void meaning you will not need to return anything
    //It will need to sysout the numbers however
    //Below is a sample output what I would like
    // I will add up the numbers you give me....
    // Number: 12
    // The total so far is 12.
    // Number: 2
    // The total so far is 14.
    // Number: 3
    // The total so far is 17.
    // Number: 4
    // The total so far is 21.
    // Number: 1
    // The total so far is 22.
    // Number: 2
    // The total so far is 24.
    // Number: 3
    // The total so far is 27.
    // Number: 0
    // TOTAL ENDED --- The total is 27.
    public static void sums(int num){
        int sum = num;
        Scanner numb = new Scanner(System.in);
        while (num != 0){
            System.out.print("Number: ");
            int newNum = numb.nextInt();
            if (newNum == 0){
                System.out.println("TOTAL ENDED --- The total is " + sum + ".");
                break;
            }
            sum += newNum;
            System.out.println("The total so far is: " + sum);
        }
            
        }

    public static void main(String[] args) {
        // Add code to help test your methods here
        Scanner selection = new Scanner(System.in);
        // this menu is to test them easier when im working on more than one
        System.out.println("Hello, which method would you like to run? \n1: loopE \n2: loopTimes \n3: stringZ \n4: sums");
        int select = selection.nextInt();
        if (select == 1){
            Scanner e = new Scanner(System.in);
            System.out.println("please enter word");
            String eWord = e.nextLine();
            System.out.println(loopE(eWord));
            e.close();
        }else if (select == 2){
            Scanner loop = new Scanner(System.in);
            System.out.println("please enter your word");
            String timesWord = loop.nextLine();
            System.out.println("please enter the number of times the word should be repeated");
            int n = loop.nextInt();
            System.out.println(stringTimes(timesWord, n));
            loop.close();
        }else if (select == 3){
            Scanner z = new Scanner(System.in);
            System.out.println("please enter word");
            String zWord = z.nextLine();
            System.out.println(stringZ(zWord, 'z'));
            z.close();
        }else if (select == 4){
            Scanner s = new Scanner(System.in);
            System.out.println("I will add up the numbers you give me...");
            int sumNum = s.nextInt();
            System.out.println("The total so far is: " + sumNum);
            sums(sumNum);
            s.close();
        }
    selection.close();
    }
    
}