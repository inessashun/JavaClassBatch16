package hwClass4;

import java.util.Scanner;

public class DriverLicense {
    public static void main(String[] args) {
        /*3)You are DMV representative and you need to ask customer their age.
        If they are 18 and older you will issue a driver license to them, otherwise you
        will offer them to get a learners permit.*/

        Scanner scan=new Scanner(System.in);
        System.out.println("What is your age?");
        int age=scan.nextInt();
        if(age>=18){
            System.out.println("Issue a driver license");
        }else{
            System.out.println("Offer them to get a learners permit");
        }
    }
}
