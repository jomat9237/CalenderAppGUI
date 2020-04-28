/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
    import java.util.Scanner;
/**
 *
 * @author jtmat
 */
public class FinalProject {
    
    public static void MainMenu(){
        //THE MAIN MENU OF MY PROGRAM
        System.out.println("Input number for program");
        System.out.println("1. Find out the day of the week of a date between 1700 - 2300 ");
        System.out.println("2. How many days until the end of the year ");
        System.out.println("3. Find out how long until a specific date ");
        System.out.println("4. End program");
    }
    public static int MonthNameToNum(String month){
        //CONVERTS STRING MONTH INPUT INTO INT VAL
        String [] monthsName = new String [12];
        int monthNum = 0;
        monthsName[0] = "january";
        monthsName[1] = "febuary";
        monthsName[2] = "march";        
        monthsName[3] = "april";
        monthsName[4] = "may";
        monthsName[5] = "june";
        monthsName[6] = "july";
        monthsName[7] = "august";
        monthsName[8] = "september";
        monthsName[9] = "october";
        monthsName[10] = "november";
        monthsName[11] = "december";
        if(month.equalsIgnoreCase(monthsName[0])){
            monthNum = 0;
        }else if(month.equalsIgnoreCase(monthsName[1])){
            monthNum = 1;
        }else if(month.equalsIgnoreCase(monthsName[2])){
            monthNum = 2;
        }else if(month.equalsIgnoreCase(monthsName[3])){
            monthNum = 3;
        }else if(month.equalsIgnoreCase(monthsName[4])){
            monthNum = 4;
        }else if(month.equalsIgnoreCase(monthsName[5])){
            monthNum = 5;
        }else if(month.equalsIgnoreCase(monthsName[6])){
            monthNum = 6;
        }else if(month.equalsIgnoreCase(monthsName[7])){
            monthNum = 7;
        }else if(month.equalsIgnoreCase(monthsName[8])){
            monthNum = 8;
        }else if(month.equalsIgnoreCase(monthsName[9])){
            monthNum = 9;
        }else if(month.equalsIgnoreCase(monthsName[10])){
            monthNum = 10;
        }else if(month.equalsIgnoreCase(monthsName[11])){
            monthNum = 11;
        }                                                              
        return(monthNum);        
                
    }
    public static int ExtraDay(int year){
        //determines if there is an extra day in a year
        int ExtraDay; 
        if(year%100 == 0 && year%400 == 0){
            ExtraDay = 1;
        }else if(year%100 == 0){
            ExtraDay = 0;
        }else if(year%4 == 0){
            ExtraDay = 1;
        }else{
            ExtraDay = 0;
        }
        return(ExtraDay);
    }
    public static void DAYS(int ExtraDay, int monthNumber, int day){
        //Using array of months finds out how many days until end of the year from a date
        int [] months = new int [12];
        
        int TotalDays = 0;
        
        months[0] = 31;
        months[1] = 28 + ExtraDay;
        months[2] = 31;
        months[3] = 30;
        months[4] = 31;
        months[5] = 30;
        months[6] = 31;
        months[7] = 31;
        months[8] = 30;
        months[9] = 31;
        months[10] = 30;
        months[11] = 31;
        
        for(int i = monthNumber; i <= 11; i++){
            TotalDays = months[i] + TotalDays;  
            
        }
        TotalDays = TotalDays - day;
        
        System.out.println("This many days left in the year: " + TotalDays);       
    }
    
    public static int centuryCode(int year){
        //Century code for day of week equation
        int [] centuryCodeArray = new int[6];
        int centOrder;
        int yearThouds;
        int yearHund;
        int centuryCode;
        yearThouds = year / 1000;
        yearHund = (year - (yearThouds*1000)) / 100;
    
        centOrder = (yearHund + (yearThouds*10))-17;
        
        
        
        centuryCodeArray[0] = 4;
        centuryCodeArray[1] = 2;
        centuryCodeArray[2] = 0;
        centuryCodeArray[3] = 6;
        centuryCodeArray[4] = 4;
        centuryCodeArray[5] = 2;
        
        
        centuryCode = centuryCodeArray[centOrder];
        
        return centuryCode;
    }
    public static int yearCode(int year){
       //finds year code
       int yearCode;
       int yearThouds;
       int yearHund;
       int yearTenOne;       
       yearThouds = year / 1000;
       yearHund = (year - (yearThouds*1000)) / 100;
       yearTenOne = year - ((yearHund*100) + (yearThouds*1000));
       yearCode = (yearTenOne + (yearTenOne/4))%7;
       return yearCode;
    }
    
    public static int monthCode(int monthNum){
        //finds month code
        int [] monthCode = new int [12];
        int monthCodeInt;
        monthCode[0] = 0;
        monthCode[1] = 3;
        monthCode[2] = 3;
        monthCode[3] = 6;
        monthCode[4] = 1;
        monthCode[5] = 4;
        monthCode[6] = 6;
        monthCode[7] = 2;
        monthCode[8] = 5;
        monthCode[9] = 0;
        monthCode[10] = 3;
        monthCode[11] = 5;
        monthCodeInt = monthCode[monthNum];
        return monthCodeInt;
                
    }
    
    public static String DayOfWeek(int DayNumber){
        //takes the final number from the day of week equation and converts to day of week
        String [] WeekDays = new String [7];
        String DayOfWeek;
        
        
        
        WeekDays[0] = "Sunday";
        WeekDays[1] = "Monday";
        WeekDays[2] = "Tuesday";
        WeekDays[3] = "Wednesday";
        WeekDays[4] = "Thursday";
        WeekDays[5] = "Friday";
        WeekDays[6] = "Saturday";
        DayOfWeek = WeekDays[DayNumber];
        return DayOfWeek;
    }
    
    public static int DayNumber(int centCode, int monthCode, int yearCode, int day, int leap){
        //takes all the codes and does equation to get number which correspondes to a day of week
        int DayNumber;
        DayNumber = (yearCode + monthCode + centCode + day - leap)%7;
        return DayNumber;
    }
    public static int leapMonth(int year, String month){
        //determines if there is an extra day in the 
        int leap = 0;
        if(month.equalsIgnoreCase("january") || month.equalsIgnoreCase("febuary")){
        if(year%100 == 0 && year%400 == 0){
            leap = 1;
        }else if(year%100 == 0){
            leap = 0;
        }else if(year%4 == 0){
            leap = 1;
        }else{
            leap = 0;
        }
        }
        
        return leap;
    }
    
    public static void DaysUntil(int monthNumber, int monthNumberTWO, int yearONE, int yearTWO, int dayONE, int dayTWO){
        int [] months = new int [12];
        
        int TotalDays = 0;
        int monthCounter = monthNumber;
        int MonthsINT;
        int ExtraDay = 0;
        int yearExtra = yearONE;
        
        months[0] = 31;
        months[1] = 28;
        months[2] = 31;
        months[3] = 30;
        months[4] = 31;
        months[5] = 30;
        months[6] = 31;
        months[7] = 31;
        months[8] = 30;
        months[9] = 31;
        months[10] = 30;
        months[11] = 31;
        
        if (monthNumber >= 1){
            yearExtra = yearONE + 1;
        }
        System.out.println("YEARS ="+  yearONE + " "+ yearExtra);
       
        for(int i = 2021; i <= 2089; i = i +1){
            if(ExtraDay(i) == 1){
                ExtraDay = ExtraDay + 1;
            }
        }
        System.out.println("ExtraDay = " + ExtraDay);
        System.out.println("Months " + monthNumber + monthNumberTWO);
        MonthsINT = ((yearTWO-yearONE)*12) + monthNumberTWO - monthNumber;
        System.out.println(MonthsINT);
        
        for(int i = 0; i <= MonthsINT; i++){
            if(monthCounter > 11){
                monthCounter = 0;
            }
            TotalDays = months[monthCounter] + TotalDays; 
           
            
            monthCounter ++;
        }
        
        System.out.println(TotalDays);
        TotalDays = TotalDays - dayONE;
        TotalDays = TotalDays - (months[monthNumberTWO] - dayTWO);
        TotalDays = TotalDays + ExtraDay;
        System.out.println(TotalDays + " Until the second date");
    }
    

    
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        //variables used throughout all programs
        int input = 0;
        int year;
        int monthNum;
        int day; 
        int DayNumber;
        String DayOfWeek;
        String month;
        
        do{
            MainMenu();
            input = keyedInput.nextInt();        
            if(input == 1){
                System.out.println("Enter the year: ");
                year = keyedInput.nextInt();
                System.out.println("Enter the month: ");
                month = keyedInput.next(); 
                monthNum = MonthNameToNum(month);
        
                System.out.println("Enter the day of the month: ");
                day = keyedInput.nextInt();
                //OUTPUT FOR TROUBLESHOOTING
                //System.out.println("cent" + centuryCode(year) + "month" + monthCode(monthNum)+ "monthNUm" + monthNum+ "year" + yearCode(year) + "day" + day + "+/-" + leapMonth(year, month));
        
                DayNumber = DayNumber(centuryCode(year), monthCode(monthNum), yearCode(year), day, leapMonth(year, month));
        
                DayOfWeek = DayOfWeek(DayNumber);
        
                System.out.println("The day of the week on that date is: " + DayOfWeek);
                
            }else if (input == 2){
                System.out.println("Enter year: ");
                year = keyedInput.nextInt();
                ExtraDay(year);
                System.out.println("Enter the month: ");
                month = keyedInput.next();
                monthNum = MonthNameToNum(month);
                System.out.println("Enter day of month: ");
                day = keyedInput.nextInt();
                DAYS(ExtraDay(year), monthNum, day);
            }else if(input == 3){
                int dayONE ;
                int dayTWO ;
                int yearONE ;
                int yearTWO ;
                int monthNumTWO;
                String monthTWO;
                
                System.out.println("Enter current year: ");
                yearONE = keyedInput.nextInt();
                System.out.println("Enter current month: ");
                month = keyedInput.next();
                monthNum = MonthNameToNum(month);
                
                System.out.println("Enter Current day: ");
                dayONE = keyedInput.nextInt();
                System.out.println("Enter future date, year: ");
                yearTWO = keyedInput.nextInt();
                System.out.println("month: ");
                monthTWO = keyedInput.next();
                monthNumTWO = MonthNameToNum(monthTWO);
                System.out.println("day: ");
                dayTWO = keyedInput.nextInt();
                
                
                
                DaysUntil(monthNum, monthNumTWO, yearONE, yearTWO, dayONE, dayTWO);
                
                
            }
            
            
        }while(input != 4);{
            System.out.println("OVER");
        }

    }
}
