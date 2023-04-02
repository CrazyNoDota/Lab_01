import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int arr[] = {3,2,4,1};
        System.out.println(isPrime(20, 2));

    }

    static double findAverage(double sum, int n, int arr[]){
        if(n==arr.length){
            return sum/ arr.length;
        }

        return findAverage(sum + arr[n], n+1, arr);

    }



    static int findMin(int min, int n, int arr[]){
        if(n==4){
            return min;
        }

        if (min > arr[n]) {
            return findMin(arr[n], n+1, arr);
        }else{
            return findMin(min, n+1, arr);
        }

    }

    static boolean isPrime(int n, int temp) {
        if (n <= 2)
            return (n == 2);
        if (n % temp == 0) {
            return false;
        }
        if (temp * temp > n) {
            return true;
        }
        temp++;
        return isPrime(n, temp);
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