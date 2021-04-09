package com.alterr;

import com.point.*;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Object String1;

    public static void main(String[] args) throws CloneNotSupportedException {
/*/--------------------------------------Chapter_1_exercise_#1--------------------------------------------//
//-------------------------------------------------------------------------------------------------------//
        Scanner in = new Scanner(System.in);
        System.out.println("ведите число: ");
        int choice = in.nextInt();
        System.out.println("двоичная система  " + Integer.toBinaryString(choice));
        System.out.println("востмеричная система  " + Integer.toOctalString(choice));
        System.out.println("шестнадцатиричная система  " + Integer.toHexString(choice).toUpperCase());
        double a = 1/(double)choice;
        System.out.println("!!!!!!!!!!!!! " + a);
        int[] b= new int[6];
        for(int i=0; i<6; i++){
            b[i] = (int)(a*16);
            a = a*16-b[i];
        }
        System.out.println("Обратная величина в виде шестнадцатеричного числа  0."+b[0]+b[1]+b[2]+b[3]+b[4]+b[5]);
//--------------------------------------Chapter_1_exercise_#1--------------------------------------------//
//-------------------------------------------------------------------------------------------------------//

//--------------------------------------Chapter_1_exercise_#2--------------------------------------------//
//-------------------------------------------------------------------------------------------------------//
        Scanner in1 = new Scanner(System.in);
        System.out.println("ведите значение угла: ");
        int ugol = in1.nextInt();
        if(ugol>=0)
            System.out.println("нормированый угол: " + ugol%360);
        else
            System.out.println("нормированый угол: " + (360+ugol%360));

        System.out.println("нормированый угол (floorMod): " + Math.floorMod(ugol , 360));

//--------------------------------------Chapter_1_exercise_#2--------------------------------------------//
//-------------------------------------------------------------------------------------------------------//

//--------------------------------------Chapter_1_exercise_#3--------------------------------------------//
//-------------------------------------------------------------------------------------------------------//
        Scanner i1 = new Scanner(System.in);
        System.out.println("ведите число: ");
        int h1 = i1.nextInt();
        Scanner i2 = new Scanner(System.in);
        System.out.println("ведите число: ");
        int h2 = i2.nextInt();
        Scanner i3 = new Scanner(System.in);
        System.out.println("ведите число: ");
        int h3 = i3.nextInt();

        if(h1>h2&&h1>h3)
            System.out.println("h1 наибольшее: " + h1);
        else if(h2>h1&&h2>h3)
            System.out.println("h2 наибольшее: " + h2);
        else if(h3>h1&&h3>h2)
            System.out.println("h3 наибольшее: " + h3);

        int a1 = Math.max(h1,h2);
        System.out.println("Math.max: " + Math.max(a1,h3));


//--------------------------------------Chapter_1_exercise_#3--------------------------------------------//
//-------------------------------------------------------------------------------------------------------//

//--------------------------------------Chapter_1_exercise_#4--------------------------------------------//
//-------------------------------------------------------------------------------------------------------//
        //double a2 = 0;
        //double b2 = 3.9E+32;
        System.out.println("Double.MIN_VALUE: " + Math.nextUp(Double.MIN_VALUE));
        System.out.println("Double.MAX_VALUE: " + Math.nextUp(Double.MAX_VALUE));

//--------------------------------------Chapter_1_exercise_#4--------------------------------------------//
//-------------------------------------------------------------------------------------------------------//


//--------------------------------------Chapter_1_exercise_#6--------------------------------------------//
//-------------------------------------------------------------------------------------------------------//


        Scanner in3 = new Scanner(System.in);
        System.out.println("ведите число для расчета факториала: ");
        int a3 = in3.nextInt();
        System.out.println(factorial(a3).toString());

//--------------------------------------Chapter_1_exercise_#6--------------------------------------------//
//-------------------------------------------------------------------------------------------------------/*/


//--------------------------------------Chapter_1_exercise_#13--------------------------------------------//
//-------------------------------------------------------------------------------------------------------//

        ArrayList<Integer> num = new ArrayList<Integer>();
        for(int i=0; i<49; i++){
            num.add(i);
        }

        int zd4size = 48;
        int rnd;
        int[] bilet = new int[6];
        int[] oldznach = new int[20];
        int constch = zd4size+1;

        for(int j=0; j<oldznach.length; j++){
            oldznach[j]=constch;
        }

        for(int i=0; i<bilet.length; i++){

            rnd = (int) (Math.random() * zd4size);

            for(int j=0; j<oldznach.length; j++){
                if(rnd==oldznach[j]){
                    rnd = (int) (Math.random() * zd4size);
                    j=0;
                }
            }
            oldznach[i]=rnd;
            zd4size-=1;
            bilet[i] = num.remove(rnd);
        }

        for(int i = bilet.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( bilet[j] > bilet[j+1] ){
                int tmp = bilet[j];
                bilet[j] = bilet[j+1];
                bilet[j+1] = tmp;
            }
        }
    }
        for (int i=0;i<6; i++){
            System.out.println(bilet[i]);
        }



//--------------------------------------Chapter_1_exercise_#13--------------------------------------------//
//-------------------------------------------------------------------------------------------------------//



//--------------------------------------Chapter_2_exercise_#5--------------------------------------------//
//-------------------------------------------------------------------------------------------------------//

        Point p = new Point(3,4).translate(1,3).scale(0.5);
        System.out.println(p.toString());


//--------------------------------------Chapter_2_exercise_#5--------------------------------------------//
//-------------------------------------------------------------------------------------------------------//



//--------------------------------------Chapter_3_exercise_#1,2--------------------------------------------//
//-------------------------------------------------------------------------------------------------------//

        Employee[] employee = new Employee[3];
        employee[0] = new Employee("QWER",12);
        employee[1] = new Employee("ASDF",17);
        employee[2] = new Employee("ZXCV",15);

        double a5 =Employee.average(employee);
        System.out.println(a5);

        String b5 =Employee.largest(employee);
        System.out.println(b5);
//--------------------------------------Chapter_3_exercise_#1,2--------------------------------------------//
//-------------------------------------------------------------------------------------------------------//


//--------------------------------------Chapter_4_exercise_#4,5--------------------------------------------//
//-------------------------------------------------------------------------------------------------------//

Circle circle = new Circle(2,3,7);
circle.getCenter();
System.out.println(circle.toString());

Circle circle1=null;
circle1 = circle.clone();
System.out.println(circle1.toString());
circle1.setRadius(21);
System.out.println(circle1.toString());
System.out.println(circle.toString());

Rectangle rectangle = new Rectangle(1,1, 10, 20);
rectangle.getCenter();

Line line = new Line(1,1,6,9);
line.getCenter();


//--------------------------------------Chapter_4_exercise_#4,5--------------------------------------------//
//-------------------------------------------------------------------------------------------------------//
    }

    private static Object factorial(int a3) {
        BigInteger b3 = BigInteger.valueOf(1);
        for (int i = 2; i <= a3; i++){
            b3 = b3.multiply(BigInteger.valueOf(i));
        }
        return b3;
    }
}
