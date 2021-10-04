package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Abdulla(0,0 );
        Abdulla(21,44);
        Abdulla(20,0);
        Abdulla(15,12);
        Abdulla(13, 45);

    }

    public static int Abdulla(int age, int temperture) {


        if (age > 20 && age < 45 && temperture > -20 && temperture < 30) {
            System.out.println(" можно идти гулять");
        } else if (age < 20 && temperture > 0 && temperture < 28){
            System.out.println(" можно идти гулять");
        }else if (age>45 && temperture >-10 && temperture <45){
            System.out.println("Можно идти гулять");
        }else if (age == 0 && temperture == 0){
            System.out.println("Оставайтесь дома");
        }

        int n = 5;
        return n;


    }

}
