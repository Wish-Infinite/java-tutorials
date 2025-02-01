package Archive;

import java.util.Random;

public class Vid17_MethodPractice {

    //No return Type, No Parameters
    public void printHello(){
        System.out.println("Hello Wishinfinite");
        System.out.println("Welcome To My Channel");
    }

    //No return type, Have Input Parameters
    void addNumber(int num1, int num2){
        int num3 = num1 + num2;
        System.out.println(num3);
    }

    // Return Type, No Input parameters
    int generateRandomNumber(){
        Random random = new Random();
        return random.nextInt(100);
    }

    //Return Type & Input Parameters
    int findGreaterNumber(int num1, int num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }

    public static void staticMethodPractice(){
        System.out.println("We are inside Static Method");
    }

//    public static void main(String[] args) {
//        int num1 = 35;
//        int num2 = 76;
//
//        if(num1 > num2){
//            System.out.println("The Grater number is num1 " + num1);
//        }else{
//            System.out.println("The grater number is num2 " + num2);
//        }
//
//
//        System.out.println(num1 + num2);
//        System.out.println("HI");
//
//        int num3 = 35;
//        int num4 = 76;
//
//        if(num3 > num4){
//            System.out.println("The Grater number is num1 " + num3);
//        }else{
//            System.out.println("The grater number is num2 " + num4);
//        }
//    }
}
