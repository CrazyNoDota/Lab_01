import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    //Main function for testing the solutions
    public static void main(String[] args) {

//        int arr[] = {10,1,32,3,45};
//        System.out.println(findMin(arr[0], 0, arr)); // I start with giving the minimum as the first element
//        // the second parameter is the current element and the last argument is the array itself

//        int arr[] = {3,2,4,1};
//        System.out.println(findAverage(0,0,arr)); // as arguments, I give the sum of all elements the current element and the array itself

        int n = 367;
        if (isPrime(n, 2)){ // the number itself and the temp which is 2 because we are starting to divide the n by it
            System.out.println("Prime");
        }else{
            System.out.println("Composite");
        }
    }


    static double findAverage(double sum, int n, int arr[]){
        // Check if we've processed all elements in the array
        if(n == arr.length){
            // If we have, return the average by dividing the sum by the length of the array
            return sum / arr.length;
        }

        // If there are still elements to process, add the current element to the sum and recurse
        return findAverage(sum + arr[n], n + 1, arr);
    }


    //This is the fucntion to find the minimum element in the array
    //recursively 
    static int findMin(int min, int n, int arr[]){ // the program starts with the min or first element
        if(n==arr.length){ // The condition to exit recursion
            return min; // returning the current minimum number
        }

        if (min > arr[n]) { // we go through the every element of the array
            return findMin(arr[n], n+1, arr);  // if the element is lower than we take it as minimum
        }else{
            return findMin(min, n+1, arr); // if
        }

    }

    static boolean isPrime(int n, int temp) { // It is important to start from 2 when we are dealing with this function
        if (n <= 2 && n > 0) // if the number is too small the program exits
            return true;
        if (n % temp == 0) { // If the number can be divided without left over than it is not Prime (exit condition)
            return false;
        }
        if (temp * temp > n) { // the second exit condition because mathematically proven that all the numbers that can divide a certain number lie before the square of N
            return true;
        }
        temp++;// to go through all the numbers inside
        return isPrime(n, temp); // calling the function for every temporary number
    }

    static int factorial(int n){
        if (n <= 0){
            return 1;
        }
        return n*factorial(n-1);
    }

    static int fibonacci(int n){
        if (n <= 0){
            return 0;
        }else if (n == 1){
            return 1;
        }

        return fibonacci(n-1)+fibonacci(n-2);
    }

    static int power(int a, int n){
        if(n == 1){
            return a;
        }
        return power(a, n-1)*a;
    }
    static void printArrayInReverse(int n){
        if(n>0){
            int input = sc.nextInt();
            printArrayInReverse(n-1);
            System.out.print(input);
            System.out.print(" ");
        }

    }
    static boolean isDigit(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) < '1' || s.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }


    static int bigC(int n, int r){

        return factorial(n) / (factorial(n-r)*factorial(r));

    }

    static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        System.out.println(a  + " " + b);
        return gcd(b, a % b);
    }
}