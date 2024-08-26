package practise;

// public class Ques{



//2. Add Two Numbers
// public class Ques{
//     public static void main(String[] args) {
//         //add the number
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the Number a : ");

//         int a = sc.nextInt();

//         System.out.println("Enter the Number b : ");

//         int b = sc.nextInt();

//         int c = a + b;
//         System.out.println("Add Of The Number Is :" + c);
//     }
// }


//3. Write a Program to Swap Two Numbers
// public class Ques{
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 6;
        
//         //swap two number
//         int temp = a;
//         a = b;
//         b = temp;
//         System.out.println(a);  //6
//         System.out.println(b);  //5

//     }
// }


//4. Write a Java Program to convert Integer numbers and Binary numbers.

// public class Ques{
//     public static void main(String[] args) {
//         int number = 6;
//         //number to binary => Integer.tobinaryString(number)
//         String binaryNumber = Integer.toBinaryString(number);
//         System.out.println(binaryNumber);
//     }
// }


//5. Write a Program to Find Factorial of a Number in Java.

// public class Ques{
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number :");

//         int num = sc.nextInt();
//         int factorial = 1;

//         for(int i=1; i<=num; i++){
//             factorial = factorial * i;
//         }
//         System.out.println(factorial);
//     }
// }


//6. Write a Java Program to Add two Complex Numbers. => (1 + 2i) + (3 + 4i) => (4 + 6i)

// class Complex{
//     //variable or datatype define
//     int real;
//     int imaginary;


//     //constructor define
//     public Complex(int real, int imaginary){
//         this.real = real;
//         this.imaginary = imaginary;
//     }


//     //method define => add two complex number => real + real and imaginary + imaginary
//     public Complex add(Complex other){
//         int newReal = this.real + other.real;
//         int newImaginary = this.imaginary + other.imaginary;
//         return new Complex(newReal, newImaginary);
//     }

//     //add is done we need to change this in string => a + bi
//     public String toString(){
//         return this.real + "+" + this.imaginary + "i";
//     }
// }

// public class Ques{
//     public static void main(String[] args) {
//         //object created for the class
//         Complex c1 = new Complex(1, 3);
//         Complex c2 = new Complex(3, 5);

//         Complex result = c1.add(c2);
//         System.out.println(result);
//     }
// }


//7. Write a Program to Calculate Simple Interest in Java

// public class Ques{

//     // public static int simpleInterest(int p, int r, int t){
//     //     int si = (p*r*t)/100;
//     //     return si;
//     // }
//     public static void main(String args[]){

//        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the p");
//        int p = sc.nextInt();
//        System.out.println("Enter the r");
//        int r = sc.nextInt();
//        System.out.println("Enter the t");
//        int t = sc.nextInt();

//        int si = (p*r*t)/100;

//        System.out.println(si);
//     }
// }


//8. Write a Program to Find Sum of Fibonacci Series Number
// public class Ques{
//     public static void main(String args[]){
//         //using iteration => 0 1 1 2 3 5 8 13 21 34
//         int firstTerm = 0;
//         int secondTerm = 1;

//         int n = 10;

//         for(int i=0; i<=n; i++){
//             System.out.println(firstTerm);
//             int nextTerm = firstTerm + secondTerm;
//             firstTerm = secondTerm;
//             secondTerm = nextTerm;
//         }
//     }
// }


//USING RECURSION
// public class Ques{
//     public static void printFibonacci(int firstTerm, int secondTerm, int n){

//         //base case
//         if(n == 1){
//             return;
//         }

//         int nextTerm = firstTerm  + secondTerm;
//         System.out.println(nextTerm);

//         //call for next Level
//         printFibonacci(secondTerm, nextTerm, n-1);

//     }
//     public static void main(String args[]){

//         //given
//         int firstTerm = 0;
//         int secondTerm = 1;

//         System.out.println(firstTerm);
//         System.out.println(secondTerm);

//         int n = 10;
//         printFibonacci(firstTerm, secondTerm, n-2);  //two element are print
//     }
// }



// JAVA PATTERN QUESTION
// *  *  *  *  *  * 
// *              *
// *              *
// *              *
// *              *
// *  *  *  *  *  *
// public class Ques{
//     public static void main(String[] args) {
//         for(int i=1; i<=6; i++){
//             for(int j=1; j<=6; j++){
//                 if(i == 1 || i == 6 || j == 1 || j == 6){
//                     System.out.print(" * ");
//                 }
//                 else{
//                     System.out.print("   ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


//    *
//   ***
//  *****
// *******

// public class Ques{
//     public static void main(String[] args) {
//         int rows = 4; //total rows in pyramid

//         for(int i=1; i<=rows; i++){
//             //first inner loop => space print before stars
//             for(int j=i; j<rows; j++){
//                 System.out.print(" ");
//             }

//             //2nd inner loop => print star when we go down in pyramid => j => 1 -> 2*i-1
//             for(int j=1; j<=2*i-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//      *
//     ***
//    *****
//   *******
//  *********
// ***********
//  *********
//   *******
//    *****
//     ***
//      *


// public class Ques{
//     public static void main(String[] args) {
//         int rows = 6;

//         for(int i=1; i<=rows; i++){
//             //first inner loop => space print before stars
//             for(int j=i; j<rows; j++){
//                 System.out.print(" ");
//             }
//             //2nd inner loop => print star when we go down in pyramid => j => 1 -> 2i-1
//             for(int j=1; j<=2*i-1; j++){
//                 System.out.print("*");
//             }
            
//             System.out.println();
//         }


//         //print bottom part of diamond
//         //outer loop
//         for(int i=rows-1; i>=1; i--){
//             //inner loop => print space
//             for(int j=rows; j>i; j--){
//                 System.out.print(" ");
//             }
//             //inner loop => print star
//             for(int j=1; j<=2*i-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//half pyramid
// public class Ques{
//     public static void main(String[] args) {
//         //half pyramid
//         int rows = 5;
//         for(int i=1; i<=rows; i++){
//             //inner loops
//             for(int j=i; j<=rows; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// *
// **
// ***
// ****
// public class Ques{
//     public static void main(String[] args) {
//         //half pyramid
//         for(int i=4; i>=1; i--){
//             //outer loop
//             for(int j=i; j<=4; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



//     *
//    **
//   ***
//  ****
// *****
// public class Ques{
//     public static void main(String[] args) {
//         //half pyramid => reversed
//         //outer loop
//         for(int i=1; i<=5; i++){
//             //inner loop
//             for(int j=1; j<=5-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//           1 
//         2 1 2 
//       3 2 1 2 3 
//     4 3 2 1 2 3 4 
//   5 4 3 2 1 2 3 4 5 
// 6 5 4 3 2 1 2 3 4 5 6 


public class Ques{
    public static void main(String args[]){
        int rows = 6;
        //outer loop
        for(int i=1; i<=rows; i++){
            //inner loop => print space
            for(int j=1; j<=2*(rows-1); j++){
                System.out.print(" ");
            }
            //inner loop => print firstPart
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            //inner loop => print secondPart
            for(int j=2; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}