package com.kodilla.testing;



import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;


public class TestingMain {

    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        //nowy test dla klaSY KALKULATOR
        int a = 4;
        int b =4;
        int wynikAdd = a+b;
        int wynikSubs = a-b;
        if( wynikAdd==8){
            System.out.println("Dziala operacja dodawania");
        }else{
            System.out.println("Error");

        }
       if(wynikSubs==0){
           System.out.println("Dziala operacja odejmowania");
       }else{
           System.out.println("Error");

       }
    }
}