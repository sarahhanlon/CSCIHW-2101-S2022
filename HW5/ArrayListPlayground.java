package HW5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPlayground {
    public static void main(String[] args) {
        // Question 1
        // Write Java statements that do the following:
        // a) Declare an arrayList nums of 15 elements of type int.
        // b) Output the value of the tenth element of the array nums.
        // c) Set the value of the 5th element of the array nums to 99.
        // d) set the value of the 13th element to 15
        // d) set the value of the 2nd element to 6
        // d) Set the value of the 9th element of the array nums to the sum of the 13th
        // and 2nd elements of the array nums.
        // a)
        ArrayList<Integer> nums = new ArrayList<Integer>(15);
        for (int i = 0; i < 15; i++) {
            nums.add(i);
        }
        // b)
        System.out.println(nums.get(10));
        // c)
        nums.set(4, 99);
        // d
        nums.set(12, 15);
        nums.set(1, 6);
        int sum = nums.get(12) + nums.get(1);
        nums.set(8, sum);

        // Question 2
        // a) create an arrayList of Strings that contain each day of the week.(starting
        // on monday)
        // b) output each of the days of the week
        // c) output the days of the week that we have class
        // d) change the arrayList to start on Sunday
        // a)
        ArrayList<String> days = new ArrayList<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        // b)
        System.out.println(days);
        // c)
        System.out.println(days.get(1));
        System.out.println(days.get(3));
        // d)
        Collections.swap(days, 1, 0);
        Collections.swap(days, 0, 2);
        Collections.swap(days, 0, 3);
        Collections.swap(days, 0, 4);
        Collections.swap(days, 0, 5);
        Collections.swap(days, 0, 6);
        System.out.println(days);

        // Question 3
        // a) create an ArrayList and prompt the user for numbers to add to it until the
        // number 0 is selected
        // b) return the largest and smallest number
        // c) return the ArrayList sorted smallest to largest
        // d) take that ArrayList see if its size is divisable by 3 and then output the
        // ArrayList in a matrix format
        // NOTE: make the matrix n X 3 so it can be n rows by 3 columns
        // EX. ArrayList [1,2,3,4,5,6,7,8,9]
        // 1 2 3
        // 4 5 6
        // 7 8 9
        // NOTE: If the ArrayList is NOT divisable by 3 ask the user for more numbers
        // and add them until it is
        // ArrayList Size: 7
        // Please enter 2 more numbers to create the matrix...
        // a)
        Scanner numbers = new Scanner(System.in);
        ArrayList<Integer> userNums = new ArrayList<Integer>();
        System.out.print("Enter number:");
        int nextNum = numbers.nextInt();
        userNums.add(nextNum);
        while (nextNum != 0) {
            System.out.print("Enter number:");
            nextNum = numbers.nextInt();
            userNums.add(nextNum);
        }
        // b)
        Collections.sort(userNums);
        System.out.println("smallest number: " + userNums.get(0));
        System.out.println("largest number: " + userNums.get(userNums.size() - 1));
        // c)
        System.out.println(userNums);
        // d)
        while (userNums.size() % 3 != 0){
            System.out.println("ArrayList size: " + userNums.size());
            System.out.print("enter number:");
            nextNum = numbers.nextInt();
            userNums.add(nextNum);
        }
        for (int i = 0; i < userNums.size(); i++) {
            System.out.print(userNums.get(i) + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
            

            }
        }
    }
    // if (userNums.size()%3==0){



// System.out.println(userNums);

// Hint 1: use collections sort to sort the numbers
// Hint 2: you can see if the size of the array list is divisible by 3 by
// running:
// numbers.size()%3==0
// Hint 3: You can use this logic to print the array list in a 3x3 pattern once
// its created:
// for(int i=0;i<numbers.size();i++)
// {
// System.out.print(numbers.get(i)+" ");
// if((i+1)%3==0)
// {
// System.out.println();
// }
// }
