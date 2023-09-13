

import java.util.Scanner;

public class main {
    //This project is a program that collects the values entered by the user.


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum=0;




        System.out.print("Enter how many elements the array has : ");

        int number = input.nextInt();
        int array[] = new int[number];

        System.out.println("enter the elements of the array : ");



        for(int i=0;i<number;i++){  //We get value from the user
            System.out.print("array "+ i + " : " );
            array[i]=input.nextInt();
        }


        for(int i=0 ; i<number; i++){
            System.out.println("array[" +i+ "] : "+ array[i]  );
        }

        for(int i=0;i<number;i++){ //I collected the values entered by the user
            sum+=array[i];


        }
        System.out.println("result : " + sum );

    }
}
