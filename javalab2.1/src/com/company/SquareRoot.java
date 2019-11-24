package com.company;

import java.sql.ResultSet;

public class SquareRoot {
    public static void main(String[] args) {
        Double a = 0.0;
        Double b = 2.5;
        Double c = -0.5;
        //PUT YOUR CODE HERE
        // PUT YOUR CODE HERE


        if(a!= null && b!= null && c != null){
        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корні рівняння: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Рівняння має єдиний корінь: x = " + x);
        }
        else {
            System.out.println("Рівняння немає коренів");
        }
        }else{
            System.out.println("Невірні аргументи");
        }

    }

}
