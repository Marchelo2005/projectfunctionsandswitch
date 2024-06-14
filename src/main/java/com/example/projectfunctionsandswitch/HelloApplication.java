package com.example.projectfunctionsandswitch;

import java.util.Scanner;

public class HelloApplication  {

    public static double integerCosine(int numberToCosine){

    return Math.cos(numberToCosine);
    }
    public static void print(String data){
    System.out.println(data);
}
    public static int sumTwoNumbers(int Whole1, int Whole2){

return  Whole1+Whole2 ;
    }

    public static void main(String[] args) {

        int Whole1=0, Whole2=0;
       String option="";
       System.out.println("Enter an option : A,B,C");
       Scanner keyboard= new Scanner(System.in);
       option= keyboard.nextLine();
       switch (option.toLowerCase()){
           case "a":
               System.out.println("Enter integer1");
               Whole1=keyboard.nextInt();
               System.out.println("Enter integer2");
               Whole2=keyboard.nextInt();
              int sumResult=sumTwoNumbers(Whole1,Whole2);
              print("The result of the sum is"+sumResult );
               break;
           case "b":
           String word="";
           System.out.println("Enter word");
           word=keyboard.nextLine();
           print("The word: "+word);
               break;
           case "c":
           System.out.println("Enter the number you wish to know its cosine");
           int numberToCosine=0;
           numberToCosine=keyboard.nextInt();
           print("The cosine in radians is:"+Math.cos(numberToCosine));

               break;

           default:
               break;
       }



    }
}