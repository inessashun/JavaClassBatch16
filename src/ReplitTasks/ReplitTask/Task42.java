package ReplitTasks.ReplitTask;

import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        /*
        **For you to do:**
Write a program using the switch statement
Let us consider there are three students in the class with roll number  starting from (101 to 103) if any number other than 101-103 are present display "Not found Student name: in Class"
```
First Output: "Enter the roll number of the Child"
```
```
case 101: if roll number is 101 print as "Student name: Ramesh"
```
```
case 102 :if roll number is 102 print as "Student name: Mahesh"
```
```
case 103:if roll number is 103 print as "Student name: Mukesh"
```
```
Other than this roll number  it should print "Not found Student name: in Class"
```
         */
        System.out.println("Enter the roll number of the Child");
        Scanner scan=new Scanner(System.in);
        int roll=scan.nextInt();

        switch(roll){
            case 101: if(roll==101){
                System.out.println("Student name: Ramesh");
            }
                break;
            case 102: if(roll==102){
                System.out.println("Student name: Mahesh");
            }
                break;
            case 103: if(roll==103){
                System.out.println("Student name: Mukesh");
            }
                break;
            default: if(roll>=103){
                System.out.println("Not found Student name: in Class");
            }

        }

    }
}
