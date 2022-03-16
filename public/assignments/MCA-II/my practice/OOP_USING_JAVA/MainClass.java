import java.util.Scanner;

public class MainClass {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Exercise 1: Number is Odd or Even");
        System.out.println("2. Exercise 2: Get the Sum, Sub, Mult, Div of Two Numbers");
        System.out.println("3. Exercise 3: Find minimum and maximum from given three numbers");
        System.out.println("4. Exercise 4: Get name of day of week using day number");
        System.out.println("5. Exercise 5: Get the name of month using month number");
        System.out.println("6. Exercise 6: Celsius to Fahrenheit");
        System.out.println("7. Exercise 7: Fahrenheit to Celsius");
        System.out.println("8. Exercise 8: Sum of first n natural numbers");
        System.out.println("9. Exercise 9: Multiplication table of given number");
        System.out.println("10. Exercise 10: First N numbers of Fibonacci series");
        System.out.println("11. Exercise 11: Find a factorial of given number");
        System.out.println("12. Exercise 12: Display the sum of first N numbers of series 1 , 3 , 5 , 7 , 9,... N");
        System.out.println("13. Exercise 13: Display the SUM = 1 +  4 + 9 + 16 + 25 + ...");
        System.out.println("14. Exercise 14: Sum of Even numbers and Odd numbers between entered two numbers");
        System.out.println("15. Exercise 15: Find the sum of all digits of entered number");
        System.out.println("16. Exercise 16: Check the entered number is palindrome or not");
        System.out.println("17. Exercise 17: Find a prime numbers between a given two numbers");
        System.out.println("18. Exercise 18: Find the matrix addition, subtraction & multiplication");
        System.out.println("19. Exercise 19: Find the total number of an odd digits within the given number " +
                "the sum of all odd digits");
        System.out.println("20. Exercise 20: Triangle Patterns");
        System.out.println("21. Exercise 21: Operations on String 'Sardar Patel University'");
        System.out.println("22. Exercise 22: Count the number of occurrences of a word in a given string");
        System.out.println("23. Exercise 23: Basic operations on integer array");
        System.out.println("24. Exercise 24: Check the entered number");
        System.out.println("25. Exercise 25: Java Program to create RECTANGLE class");

        choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 0:
                return;
            case 1:
                Exercise1.exercise1();
                break;
            case 2:
                Exercise2.exercise2();
                break;
            case 3:
                Exercise3.exercise3();
                break;
            case 4:
                Exercise4.exercise4();
                break;
            case 5:
                Exercise5.exercise5();
                break;
            case 6:
                Exercise6.exercise6();
                break;
            case 7:
                Exercise7.exercise7();
                break;
            case 8:
                Exercise8.exercise8();
                break;
            case 9:
                Exercise9.exercise9();
                break;
            case 10:
                Exercise10.exercise10();
                break;
            case 11:
                Exercise11.exercise11();
                break;
            case 12:
                Exercise12.exercise12();
                break;
            case 13:
                Exercise13.exercise13();
                break;
            case 14:
                Exercise14.exercise14();
                break;
            case 15:
                Exercise15.exercise15();
                break;
            case 16:
                Exercise16.exercise16();
                break;
            case 17:
                Exercise17.exercise17();
                break;
            case 18:
                Exercise18.exercise18();
                break;
            case 19:
                Exercise19.exercise19();
                break;
            case 20:
                Exercise20.exercise20();
                break;
            case 21:
                Exercise21.exercise21();
                break;
            case 22:
                Exercise22.exercise22();
                break;
            case 23:
                Exercise23.exercise23();
                break;
            case 24:
                Exercise24.exercise24();
                break;
            case 25:
                Exercise25.exercise25();
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}

class Exercise1 {
    public static void exercise1() {
        /* To find the entered no. is even or odd. */
        int num;
        System.out.println("Enter the number to check whether it is even or odd: ");
        num = MainClass.sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}

class Exercise2 {
    public static void exercise2() {
        /*
         * To accept two numbers from the user and display its addition, subtraction,
         * multiplication and division
         */
        int num1, num2;
        System.out.println("Enter the first number: ");
        num1 = MainClass.sc.nextInt();
        System.out.println("Enter the second number: ");
        num2 = MainClass.sc.nextInt();
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
    }
}

class Exercise3 {
    public static void exercise3() {
        // To find minimum & maximum from given three numbers.
        int num1, num2, num3;
        System.out.println("Enter the first number: ");
        num1 = MainClass.sc.nextInt();
        System.out.println("Enter the second number: ");
        num2 = MainClass.sc.nextInt();
        System.out.println("Enter the third number: ");
        num3 = MainClass.sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("Maximum number is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Maximum number is: " + num2);
        } else {
            System.out.println("Maximum number is: " + num3);
        }
        if (num1 < num2 && num1 < num3) {
            System.out.println("Minimum number is: " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("Minimum number is: " + num2);
        } else {
            System.out.println("Minimum number is: " + num3);
        }
    }
}

class Exercise4 {
    public static void exercise4() {
        /*
         * To accept the day no. & display corresponding day name. (Use Switch
         * Statement)
         * E.g. (1 – Monday , 2 – Tuesday, .................. 7 – Sunday)
         */
        int day;
        System.out.println("Enter the day number: ");
        day = MainClass.sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }
}

class Exercise5 {
    public static void exercise5() {
        /*
         * To accept the month no. & display corresponding month name. Use Switch Stat.
         * E.g. ( 1 – January, 2 – February ............... 12 –Dec)
         */
        int month;
        System.out.println("Enter the month number: ");
        month = MainClass.sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number");
        }
    }
}

class Exercise6 {
    public static void exercise6() {
        /*
         * Program to Perform Celsius to Fahrenheit Conversion. Formula:
         * F = ( C * 9 ) / 5 + 32.
         */
        double celsius, fahrenheit;
        System.out.println("Enter the temperature in Celsius: ");
        celsius = MainClass.sc.nextDouble();
        fahrenheit = (celsius * 9) / 5 + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}

class Exercise7 {
    public static void exercise7() {
        // 7. Program to Perform Fahrenheit to Celsius Conversion. Formula:
        // C = (F -32) * 5 / 9.
        double fahrenheit, celsius;
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = MainClass.sc.nextDouble();
        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsius);
    }
}

class Exercise8 {
    public static void exercise8() {
        // 8. To find the sum of first N numbers.
        int n, sum = 0;
        System.out.println("Enter the number of terms: ");
        n = MainClass.sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        // sum = sum + i;
        // }
        sum = (n * (n + 1)) / 2;
        System.out.println("The sum of first " + n + " terms is: " + sum);
    }
}

class Exercise9 {
    public static void exercise9() {
        // 9. Display the multiplication table of a given integer number.
        int n, i;
        System.out.println("Enter the number: ");
        n = MainClass.sc.nextInt();
        for (i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}

class Exercise10 {
    public static void exercise10() {
        // 10. Display first N numbers of Fibonacci series.
        int n, i, num1 = 0, num2 = 1, num3;
        System.out.println("Enter the number of terms: ");
        n = MainClass.sc.nextInt();
        System.out.println(num1 + " " + num2);
        for (i = 2; i < n; i++) {
            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
    }
}

class Exercise11 {
    public static void exercise11() {
        // 11. To find the factorial of a given number.
        int n, i, fact = 1;
        System.out.println("Enter the number: ");
        n = MainClass.sc.nextInt();
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}

class Exercise12 {
    public static void exercise12() {
        // 12. To display the sum of first N numbers of series 1 , 3 , 5 , 7 , 9
        int n, i, sum = 0;
        System.out.println("Enter the number of terms: ");
        n = MainClass.sc.nextInt();
        for (i = 1; i <= n * 2; i = i + 2) {
            sum += i;
        }
        System.out.println("The sum of first " + n + " terms is: " + sum);
    }
}

class Exercise13 {
    public static void exercise13() {
        // 13. To display the SUM = 1 + 4 + 9 + 16 + 25 + ...............
        int n, sum = 0;
        System.out.println("Enter the number of terms: ");
        n = MainClass.sc.nextInt();
        // for(int i = 1; i <= n; i++){
        // sum+=i*i;
        // }
        sum = (n * (n + 1) * (2 * n + 1)) / 6;
        System.out.println("The sum of first " + n + " terms is: " + sum);
    }
}

class Exercise14 {
    public static void exercise14() {
        // 14. To find sum of Even numbers and Odd numbers between entered two numbers.
        int n1, n2, sum = 0;
        System.out.println("Enter the first number: ");
        n1 = MainClass.sc.nextInt();
        System.out.println("Enter the second number: ");
        n2 = MainClass.sc.nextInt();
        for (int i = n1; i <= n2; i++)
            if (i % 2 == 0)
                sum += i;
        System.out.println("The sum of even numbers between " + n1 + " and " + n2 + " is: " + sum);
        sum = 0;
        for (int i = n1; i <= n2; i++)
            if (i % 2 != 0)
                sum += i;
        System.out.println("The sum of odd numbers between " + n1 + " and " + n2 + " is: " + sum);
    }
}

class Exercise15 {
    public static void exercise15() {
        // 15. Write a program to find the sum of all digits of entered number.
        int n, sum = 0, temp;
        System.out.println("Enter the number: ");
        n = MainClass.sc.nextInt();
        temp = n;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        System.out.println("The sum of all digits of " + temp + " is: " + sum);
    }
}

class Exercise16 {
    public static void exercise16() {
        // 16. Write a program to check the entered number is palindrome or not.
        int n, temp, rev = 0;
        System.out.println("Enter the number: ");
        n = MainClass.sc.nextInt();
        temp = n;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        if (temp == rev)
            System.out.println(temp + " is a palindrome number.");
        else
            System.out.println(temp + " is not a palindrome number.");
    }
}

class Exercise17 {
    public static void exercise17() {
        // 17. Write a program to find a prime numbers between a given two numbers.
        int n1, n2, i, flag = 0;
        System.out.println("Enter the first number: ");
        n1 = MainClass.sc.nextInt();
        System.out.println("Enter the second number: ");
        n2 = MainClass.sc.nextInt();
        for (i = n1; i <= n2; i++) {
            if (i <= 1)
                continue;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.println(i + " is a prime number.");
            else
                flag = 0;
        }
    }
}

class Exercise18 {
    public static void exercise18() {
        // 18. Write a program to find the matrix addition, subtraction &
        // multiplication.
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];

        int[][] c = new int[3][3];
        // I could use only integer variables instead of whole new matrix
        // because I am not using whole resultant matrix anywhere again.
        // however, I can return that matrix as well.
        int i, j, k;
        System.out.println("Enter the elements of first matrix: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = MainClass.sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                b[i][j] = MainClass.sc.nextInt();
            }
        }
        System.out.println("The first matrix is: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The second matrix is: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The addition of two matrices is: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The subtraction of two matrices is: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                c[i][j] = a[i][j] - b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The multiplication of two matrices is: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Exercise19 {
    public static void exercise19() {
        // 19. To find out the total number of an odd digits within the given number and
        // print the sum of all odd digits.
        int n, sum = 0, temp;
        System.out.println("Enter the number: ");
        n = MainClass.sc.nextInt();
        temp = n;
        System.out.println("Odd digits in " + temp + " are: ");
        while (n > 0) {
            if (n % 10 % 2 != 0) {
                sum += n % 10;
                System.out.print(n % 10 + " ");
            }
            n = n / 10;
        }
        System.out.println("\nThe sum of all odd digits of " + temp + " is: " + sum);
    }
}

class Exercise20 {
    public static void exercise20() {
        // 20. To display the following patterns.
        int n, i, j;
        System.out.println("Enter the number of rows: ");
        n = MainClass.sc.nextInt();
        System.out.println("Pattern 1:");
        // *
        // * *
        // * * *
        // * * * *
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Pattern 2:");
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("Pattern 3:");
        // 1
        // 22
        // 333
        // 4444
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("Pattern 4:");
        // 1 *
        // 1 * 2 * *
        // 1 * 2 * * 3 * * *
        // 1 * 2 * * 3 * * * 4 ****
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
                for (int k = 1; k <= j; k++) {
                    System.out.print("* ");
                }
            }
            if (i < n)
                System.out.println();
        }
    }
}

class Exercise21 {
    public static void exercise21() {
        // 21. Perform the following operation on string "Sardar Patel University":
        // a. Find the length of string
        // b. Find the capacity of string.
        // c. Convert all character in uppercase
        // d. Reverse a string
        // e. Convert all character in lowercase
        // f. Extract and print "Sardar" from the string.
        // g. Count occurrences of character 'a' in a string.

        StringBuffer s = new StringBuffer();
        s.append("Sardar Patel University");
        System.out.println("a. The length of string is: " + s.length());
        System.out.println("b. The capacity of string is: " + s.capacity());
        System.out.println("c. The string in uppercase is: " + s.toString().toUpperCase());
        System.out.println("d. The string in reverse is: " + s.reverse());
        // back to original string
        s.reverse();
        System.out.println("e. The string in lowercase is: " + s.toString().toLowerCase());
        System.out.println("f. The string is: " + s.substring(0, 6));
        System.out.println("g. The number of occurrences of character 'a' is: "
                + (s.length() - s.toString().replace("a", "").length()));
    }
}

class Exercise22 {
    public static void exercise22() {
        // 22. Write a java program to count the number of occurrences of a word in a
        // given string.
        String s = "";
        System.out.println("Enter the string: ");
        s = MainClass.sc.nextLine();
        System.err.println(s);
        System.out.println("Enter the word to be counted: ");
        String word = MainClass.sc.nextLine();
        System.err.println(word);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + word.length()).equals(word)) {
                count++;
            }
        }
        System.out.println("The number of occurrences of " + word + " is: " + count);
    }
}

class Exercise23 {
    public static void exercise23() {
        // 23. Accepts N integer numbers from user and display in sorted order. Also
        // display the sum, average, count of
        // positive numbers, count of negative numbers, maximum value, & minimum value.
        int n, i, j, temp, sum = 0, countPositive = 0, countNegative = 0, max, min;
        double avg = 0;
        System.out.println("Enter the number of elements: ");
        n = MainClass.sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements: ");
        for (i = 0; i < n; i++)
            a[i] = MainClass.sc.nextInt();
        for (i = 0; i < n; i++)
            for (j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        System.out.println("The sorted array is: ");
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        max = min = a[0];
        for (i = 0; i < n; i++) {
            sum += a[i];
            if (a[i] > 0)
                countPositive++;
            if (a[i] < 0)
                countNegative++;
            if (a[i] > max)
                max = a[i];
            if (a[i] < min)
                min = a[i];
        }
        avg = (double) sum / n;
        System.out.println("The sum of all elements is: " + sum);
        System.out.println("The average of all elements is: " + avg);
        System.out.println("The count of positive elements is: " + countPositive);
        System.out.println("The count of negative elements is: " + countNegative);
    }
}

class Exercise24 {
    public static void exercise24() {
        // 24. Menu driven program to check the entered number.
        // 1. Check for positive or negative number
        // 2. Check for odd or even number
        // 3. Check for primary number
        // 4. Check for Palindrome number
        // 5. Check for Armstrong number
        // 6. Check for number whether a member of fibonacci series
        // 7. Exit
        while (true) {
            int inp = 7;
            System.out.println("1. Check for positive or negative number");
            System.out.println("2. Check for odd or even number");
            System.out.println("3. Check for primary number");
            System.out.println("4. Check for Palindrome number");
            System.out.println("5. Check for Armstrong number");
            System.out.println("6. Check for number is whether a member of fibonacci series");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            inp = MainClass.sc.nextInt();
            int num;
            switch (inp) {
                case 1:
                    System.out.println("Enter the number: ");
                    num = MainClass.sc.nextInt();
                    if (num > 0)
                        System.out.println("The number is positive");
                    else if (num < 0)
                        System.out.println("The number is negative");
                    else
                        System.out.println("The number is zero");
                    break;
                case 2:
                    System.out.println("Enter the number: ");
                    num = MainClass.sc.nextInt();
                    if (num % 2 == 0)
                        System.out.println("The number is even");
                    else
                        System.out.println("The number is odd");
                    break;
                case 3:
                    System.out.println("Enter the number: ");
                    num = MainClass.sc.nextInt();
                    int sum = 0;
                    while (num != 0) {
                        sum += num % 10;
                        num /= 10;
                    }
                    if (sum == 1)
                        System.out.println("The number is primary");
                    else
                        System.out.println("The number is not primary");
                    break;
                case 4:
                    System.out.println("Enter the number: ");
                    num = MainClass.sc.nextInt();
                    int temp = num;
                    int rev = 0;
                    while (num != 0) {
                        rev = rev * 10 + num % 10;
                        num /= 10;
                    }
                    if (temp == rev)
                        System.out.println("The number is palindrome");
                    else
                        System.out.println("The number is not palindrome");
                    break;
                case 5:
                    System.out.println("Enter the number: ");
                    num = MainClass.sc.nextInt();
                    int sum1 = 0;
                    int temp1 = num;
                    while (num != 0) {
                        int rem = num % 10;
                        sum1 += Math.pow(rem, Integer.toString(temp1).length());
                        num /= 10;
                    }
                    // Fact: In the range 0 to 999 there exists six Armstrong numbers- 0, 1, 153,
                    // 370, 371 and 407
                    if (sum1 == temp1)
                        System.out.println("The number is an Armstrong number");
                    else
                        System.out.println("The number is not an Armstrong number");
                    break;
                case 6:
                    System.out.println("Enter the number: ");
                    num = MainClass.sc.nextInt();
                    boolean flag = false;
                    int a = 0, b = 1, c = 0;
                    while (c <= num) {
                        c = a + b;
                        a = b;
                        b = c;
                        if (c == num) {
                            flag = true;
                            break;
                        }
                    }
                    if (flag)
                        System.out.println("The number is a member of fibonacci series");
                    else
                        System.out.println("The number is not a member of fibonacci series");
                    break;
                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

class Exercise25 {
    public static void exercise25() {
        // 25. Write a java program to create a class named Rectangle having member
        // variable length and breadth.
        // Define various constructors with and without arguments. Also create two
        // methods area and perimeter.
        // ( Formulas : Area = length * breadth & Perimeter = 2 * ( length + breadth)

        // This code is only for a demo purpose and has nothing to do with (dummy) code.
        Exercise25 dummy = new Exercise25();
        Rectangle r1=dummy.new Rectangle();
        System.out.println("R1:");
        r1.area();
        r1.perimeter();
        System.out.println("Enter length and breadth of R2: ");
        Rectangle r2=dummy.new Rectangle(MainClass.sc.nextInt(),MainClass.sc.nextInt());
        System.out.println("R2:");
        r2.area();
        r2.perimeter();
    }
    class Rectangle {
        int length, breadth;
        Rectangle() {
            length = breadth = 0;
        }
        Rectangle(int l, int b) {
            length = l;
            breadth = b;
        }
        public void area() {
            System.out.println("Area of rectangle is: " + length * breadth);
        }
        public void perimeter() {
            System.out.println("Perimeter of rectangle is: " + 2 * (length + breadth));
        }
    }
}