package HW4;

import java.util.Scanner;

public class Arrays {

    // CONVERT THE SUMS METHOD FROM HW3 TO ADD EACH VALUE TO AN ARRAY AND THEN OUTPUT THE 
    // ARRAY AND THE TOTAL.
    // SEE HW3 FOR SUMS METHOD
    // If you want to use an ArrayList for the inputs to be dynamic that is okay
    // Otherwise if you are using a regular array, assume the size is 10 total. 
    // EXAMPLE 
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
    // Number: 0
    // Total: 22
    // Array: {12,2,3,4,1,0}
    public static void Arraysums(){
        Scanner numb = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        int[] sumNumbers = new int[10];
        int newNum = 1;
        while (newNum != 0){
            System.out.print("Number: ");
            newNum = numb.nextInt();
            sum += newNum;
            sumNumbers[i] = newNum;
            System.out.println("The total so far is: " + sum);
            if (newNum == 0 || i == 9){
                System.out.println("TOTAL ENDED --- The total is " + sum + ".");
                System.out.print("Array: {");
                for (int j = 0; j < 10; j++){
                System.out.print(sumNumbers[j]+", ");
                }
                System.out.print("}");
                break;
            }
        i++;
        }
            
            
            
            
        }
    

    // Create a method that will brute force a password EX.
    // bruteForce("ZZZZ")
    // The program should then guess each char of the string and compare it to see if it is equal
    // to the index of the alphabet char array below
    // Output Example:
    // Z
    // ZZ
    // ZZZ
    // ZZZZ

    // Hint 1: using a char array for the password is helpful here 
    // Hint 2: using the method .toCharArray is a way to convert the password parameter to
    // a char array as well
    // From there creating for and while loops to compare the values is trivial

    public static String bruteForce(String password){
        String answer = "";
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
        '!', '@', '#', '$', '%', '^', '&', '*', '(', ')','<','>','/','?'};
        char[] passArray = password.toCharArray();
        int i = 0;
        String yourPass = "";
        while (i < (passArray.length)){
            for (int j = 0; j < alphabet.length; j++){
                if (passArray[i] == alphabet[j]){
                    yourPass += alphabet[j];
                    System.out.println(yourPass);
                }
            }
            i++;
        }
        return answer; 
    }

    // ..
    // NOTE: You CANNOT use the built in Array.sort method
    // Ex. 
    // sorter([9,10,2,5,3,4,7,8]) -> [2,3,4,5,7,8,9,10]

    // Hint 1: a temp Array is a helpful way to store variables for comparing 
    // Hint 2: 2 nested For loops should be all thats needed for the swapping logic
    public static int[] sorter(int[] nums){
        int [] sortedArray = new int[nums.length];
        System.out.print("Sorted array: [");
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                int temp = 0;
                if (nums[i] > nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
         for (int i = 0; i < nums.length; i++) 
           {     
              System.out.print(nums[i] + ",");  
           }
           System.out.print("]");
        return sortedArray;
    }




    public static void main(String[] args) {
        Scanner selection = new Scanner(System.in);
        // this menu is to test them easier when im working on more than one
        System.out.println("Hello, which method would you like to run? \n1: Arraysums \n2: bruteForce \n3: sorter");
        int select = selection.nextInt();
        if (select == 1){
            System.out.println("I will add up the numbers you give me...");
            Arraysums();
        }else if (select == 2){
            Scanner pass = new Scanner(System.in);
            System.out.println("Enter password: ");
            String password = pass.nextLine();
            bruteForce(password);
            pass.close();
        }else if (select == 3){
            int[] testArray = new int[]{9,10,2,5,3,4,7,8};
            sorter(testArray);
        }
    selection.close();
        
    }

    
}