package class4IfElseScanner;

public class E3ElseIfWeekDays {
    public static void main(String[] args) {
        int number=10;
        if(number>10){
            System.out.println("Lets party");
        }else{
            System.out.println("Lets study");
        }

        int day=5;
        if(day==1){
            System.out.println("Monday");
        }else if(day==2){
            System.out.println("Tuesday");
        }else if(day==3){
            System.out.println("Wednesday");
        }else if(day==4){
            System.out.println("Thursday");
        }else if(day==5){
            System.out.println("Friday");
        }else if(day==6){
            System.out.println("Saturday");
        }else if(day==7){
            System.out.println("Sunday");
        }else{
            System.out.println("Wrong day number");
        }
    }
}