package com.tedu.day05;

import java.util.Scanner;

public class SimpleWMS {
    /**
     * There are 3 operations that the administrator can perform (view, modify, and exit),
     * which we can do by using the (switch) menu.
     *  -------------Inventory Management------------
     *         1.Check Inventory List
     *         2.Modify the number of items in stock
     *         3.Quit
     */
    public static void main(String[] args) {
        String[] brand = {"Plush Toy","Pet Toy"};
        double[] size = {12.00,6.00};
        double[] price = {12.99,5.99};
        int[] count = {0,0};

        while(true){
            printMenu();
            System.out.println("Please enter menu options：");
            Scanner scan =new Scanner(System.in);
            int number = scan.nextInt();
            switch(number){
                case 1:
                    printStock(brand, size, price, count);
                    break;
                case 2:
                    alterCount(brand, count);
                    break;
                case 3:
                    System.out.println("See you next time！");
                    return;
                default:
                    System.out.println("Enter format or characters incorrectly, please re-enter");

            }

        }
    }

    //Array traversal method to view inventory
    public static void printStock(String[] brand, double[] size, double[] price,int[] count){
        int totalCount = 0;
        double totalPrice = 0;
        System.out.println("--------Inventory Management--------");
        System.out.println("Item---------Size----------Price----------Numbers of inventory");
        for(int i=0;i<brand.length;i++){
            System.out.println(brand[i]+"------"+size[i]+"---------"+price[i]+"------"+count[i]+"\t");
            totalCount += count[i];
            totalPrice = count[i]*price[i];
        }
        System.out.println("----------------------------");
        System.out.println("Total Inventory："+totalCount);
        System.out.println("Total amount of inventory："+totalPrice);
    }

    //This method is to modify product inventory
    public static void alterCount(String[] brand,int[] count){

        for(int i=0;i<count.length;i++){
            System.out.println("Please enter the number of "+brand[i]+".");
            Scanner scan = new Scanner(System.in);
            int newCount = scan.nextInt();
            count[i] = newCount;
        }

    }

    //This method is to display the function menu
    public static void printMenu(){
        System.out.println("1.Check Inventory List. ");
        System.out.println("2.Modify the number of items in stock");
        System.out.println("3.Quit");
    }
}
