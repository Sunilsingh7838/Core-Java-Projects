package com.company;

import java.util.Stack;

public class for_loop {
    public static void main(String[] args) {

//        For loop

//$       Question 1
        sum of first 10 natural numbers
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("sum : " + sum);

//$       Question 2 table of 2
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
           System.out.println(" 2 x " + i + " = " + 2*i);
            sum = 2 * i;
            System.out.println(" 2 x " + i + " = " + sum);
        }

//$       Question 3 Print the table by taking data from user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :  ");
        int num = sc.nextInt();
        System.out.println(" Enter the number to print the Table of it : " + num);

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = num * i;
            System.out.println(num + " x " + i + " = " + num * i);

        }



//$     Question 4 .Find the factorial value entered through keyboard.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for Factorial : ");
        int num = sc.nextInt();

        if (num == 0 || num == 1) {
            System.out.println("1");
        } else {
            int product = 1;
            for (int i = 1; i <= num; i++) {
                product *= i;
            }
            System.out.println("The factorial of " + num + " is : " + product);
        }


//$       Question 5 To reverse the string given by user.

        String revString = "";
        String string;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        int length = str.length();

        for (int i = length-1; i>=0; i--){
            revString = revString + str.charAt(i);

        }
        System.out.println("The reverse of " + str +" is : " + revString);



//$     Question 6 Write a program that prompts the user to input an integer and then
      outputs the number with the digits reversed. For example, if the input
      is 12345, the output should be 54321.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to reverse : ");
        int num = sc.nextInt();

        int reverse = 0;
        int tem = num;
        while (tem>0){
            int reminder = tem %10;
            reverse = reverse * 10 + reminder;
            tem = tem /10;
        }
        System.out.println("The Reverse of " + num + " is " + reverse);


        * This code is given by AI.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int userNumber = sc.nextInt();
        int reverseNumber = 0;

        for (; userNumber != 0; userNumber /= 10){
            int reminder = userNumber % 10;
            reverseNumber = reverseNumber * 10 + reminder;
        }
        System.out.println("The Reverse is : " + reverseNumber);


//$       Question 7 Print the largest number in an Array.

        int [] marks = new int[]{34,45,67,87,23,45,77,34,54};
        int highestMarks = marks[0];
        int lowestMarks = marks[0];

        for (int i =0;i<marks.length;i++){
            // for highest mark
            if (marks[i]>highestMarks){
                highestMarks = marks[i];
            }
            //for lowest mark
            if (marks[i]<lowestMarks){
                lowestMarks = marks[i];
            }
        }

        System.out.println("The highest marks scored by student is : " + highestMarks);
        System.out.println("The lowest marks scored by student is : " + lowestMarks);



//$       Question 8 Print the largest number in an Array using inbuilt package.
        int [] marks = new int[]{34,45,67,87,23,45,77,34,54};
        Arrays.sort(marks);

        System.out.println("The length of array is " + marks.length);
        System.out.println(Arrays.toString(marks)); // Printing sorted array
        System.out.println("The lowest mark is : " + marks[0]);
        System.out.println("The highest mark is : " + marks[marks.length-1]);



//$      Question 9. Forcing user to type only integer type value
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (!sc.hasNextInt()){
            System.out.println("Enter int value.");
            sc.next();
         }

            else
              System.out.println("your entered num is : " + num);



//$       Question 10. Printing an Array in ascending and descending order using nested loops.

        Integer [] height ={23,54,67,35,87,56,98,100,4,5,67,};

        //for Ascending order
        for (int i = 0;i<height.length;i++){
            for (int j = i +1; j< height.length;j++){
                int temp = 0;
                if (height[i] > height[j]){
                    temp = height[i];
                    height[i] = height[j];
                    height[j] = temp;

                }

            }
        }
        for (int i = 0;i<height.length; i++){
            System.out.println(height[i]);
        }

        //For descending order

        for (int i = 0;i<height.length;i++){
            for (int j = i +1; j< height.length;j++){
                int temp = 0;
                if (height[i] < height[j]){
                    temp = height[i];
                    height[i] = height[j];
                    height[j] = temp;

                }

            }
        }
        for (int i = 0;i<height.length; i++){
            System.out.println(height[i]);
        }


//$      Question 11. Printing an Array in ascending and descending order using inbuilt methods.
        Integer [] array = {23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205};
        // sorts array[] in ascending order

        Arrays.sort(array);
        System.out.println("Array elements in ascending order:" + Arrays.toString(array));

        // sorts array[] in descending order
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Array elements in descending order: " +Arrays.toString(array));


//$       Question12. Write a java programme to check whether the number is prime or not by taking input from user.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check whether it is prime or not : ");
        int number = sc.nextInt();
        boolean isPrime = true;

        for (int i =2;i<=number/2; i++){
            if (number % i ==0){
                isPrime = false;
                break;
            }
        }

        if (isPrime){
            System.out.println(number+" is Prime.");
        }
        else {
            System.out.println(number+" is not Prime.");
        }


//$       Question 13. Java programme to check that given String is palindrome or not.

        String str = "racecar";
        boolean isPalindrome = true;
        for (int i = 0; i<str.length()/2; i ++){
            if (str.charAt(i) != str.charAt(str.length()-i -1)){
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome){
            System.out.println(str+" is Palindrome.");
        }

        else {
            System.out.println(str + " is not Palindrome.");
        }


//$       Question 14 . Java Programme to find second-highest number in an Array using inbuilt methods in java.

        Integer [] marks = { 10 ,20,40,35,78,32,64,};

        Arrays.sort(marks);
        System.out.println(Arrays.toString(marks));
        System.out.println("The highest no. is :" + marks[marks.length-1]);
        System.out.println("The second-highest no. is :" + marks[marks.length-2]);
        System.out.println(" The lowest no. is : " + marks[0]);


//$       Question 14 . Java Programme to find second-highest number in an Array without using inbuilt methods in java.

        int [] marks = { 10 ,20,40,35,78,32,64,};
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i<marks.length; i++){
            int mark = marks[i];
            if (mark > highest){
                secondHighest = highest;
                highest = mark;
            } else if (mark > secondHighest && mark < highest) {
                secondHighest = mark;
            }
        }
        System.out.println("The Second-Highest number is : " + secondHighest);


//$       Question 15. Write the java programme to implement a stack using array.

        Stack<Integer> stack = new Stack<>();
        Stack<String> stack1 = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        System.out.println("Display the stack " + stack);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println("The pop element is : " + stack.pop());
        System.out.println("Updated stack is  : " + stack);
        System.out.println(" The pushed element is ; " + stack.push(34));
        System.out.println("Reupdated stack is : " + stack);

        stack1.push("software");
        stack1.push("Developer");
        System.out.println("The updated stack1 is : "+ stack1);
        System.out.println("stack1 of peek is :" + stack1.peek());

    }
}
