package com.example.projectfunctionsandswitch;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;
public class HelloApplication  {

public static void print(String data){
    System.out.println(data);
}
    public static int sumTwoNumbers(int Whole1, int Whole2){
        Scanner keyboard= new Scanner(System.in);
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




               break;

           default:
               break;
       }



    }
}