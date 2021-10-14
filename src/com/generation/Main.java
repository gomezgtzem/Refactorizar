package com.generation;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        addition();
        substraction();
        multiplication();
        division();
    }

    public static void addition() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter addition number 1  ");
        int num1 = console.nextInt();
        System.out.print("Enter addition number 2  ");
        int num2 = console.nextInt();
        int addition = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + addition);
    }

    public static void substraction() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter subtraction number 1  ");
        int num1 = console.nextInt();
        System.out.print("Enter subtraction number 2  ");
        int num2 = console.nextInt();
        int subtraction = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + subtraction);
    }

    public static void multiplication() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter multiplication number 1  ");
        int num1 = console.nextInt();
        System.out.print("Enter multiplication number 2  ");
        int num2 = console.nextInt();
        int multiplication = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + multiplication);
    }

    public static void division() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter division number 1  ");
        int num1 = console.nextInt();
        System.out.print("Enter division number 2  ");
        int num2 = console.nextInt();
        int division = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + division);
    }
}


//Prueba sin funciones con for e if
//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//        int num1;
//        int num2;
//        int result;
//        String operation = "suma";
//        for (int i = 0; i < 4; i++) {
//            System.out.print("Ingrese el primer numero para la "+operation);
//            num1 = console.nextInt();
//            System.out.print("Ingrese el segundo numero para la "+operation);
//            num2 = console.nextInt();
//            if (i == 0) {
//                operation = "suma";
//                result = num1 + num2;
//            } else if (i == 1) {
//                operation = "resta";
//                result = num1 - num2;
//            } else if (i == 2) {
//                operation = "multiplicacion";
//                result = num1 * num2;
//            } else if (i == 3) {
//                operation = "division";
//                result = num1 * num2;
//            } else {
//                break;
//            }
//            System.out.println(operation + " es igual a " + result);
//        }
//    }
//}