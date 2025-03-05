package midtermreview;

import java.util.Scanner;

public class MidtermReview {

    public static void main(String[] args) {

//        int x = 1;
//        while (x <= 12) {
//            System.out.println(x++);
//        }
//        int x = 1;
//        do {
//            System.out.println(x);
//            x++;
//        } while (x <= 12);
//        int i = 1;
//
//        while (i <= 12) {
//            System.out.println("Outer loop " + i++);
//            int j = 1;
//
//            while (j <= 12) {
//                System.out.println("\tInner loop " + j++);
//            }
//
//        }
        String name;
        int YOB;
        System.out.print("Enter the name ==> ");
        Scanner sc = new Scanner(System.in);
        name=sc.nextLine();
        
        System.out.print("Enter the year you were born ==> ");
        YOB=sc.nextInt();
        
        greetings g1=new greetings(name,YOB);
        
        g1.PrintMessage();

    }

}
