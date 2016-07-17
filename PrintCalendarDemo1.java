import java.util.Scanner;

/**
 * Created by Administrator on 2016/7/17 0017.
 */
public class PrintCalendarDemo1 {
    public static void main(String []args){
        int year;  // the year
        int month; // the month
        int days=0; // the days in the month
        int totalDays=0; // save the days from 1900.1.1 to now
        boolean isRn;
        System.out.println("*****Start****");
        Scanner input=new Scanner(System.in);
        System.out.println("Please input the year: ");
        year=input.nextInt();
        System.out.println("Please input the month: ");
        month=input.nextInt();

        if ((year%400==0) || (year%4==0&&year%100!=0)){
            isRn=true;
        }else{
            isRn=false;
        }

        if (isRn){
            System.out.println("is");
        }else{
            System.out.println("is not");
        }

        for(int i=1900; i<year; i++){
            if(i%400==0||(i%4==0&&i%100!=0)){
                totalDays+=366;
            }else{
                totalDays+=365;
            }
        }
        // calculate the month you input

        for (int i=0; i<=month; ++i){
            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days=31;
                    break;
                case 2:
                    if(isRn){
                        days=29;
                    }else {
                        days=28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days=30;
                    break;
                default:
                    System.out.println("month input error.");
            }
            //the day number saved in the days var, but didn't add in.
            if(i!=month){
                totalDays+=days;
            }
        }

        // figure out what day is it this day.
        
    }
}
