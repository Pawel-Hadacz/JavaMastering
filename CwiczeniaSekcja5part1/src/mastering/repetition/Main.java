package mastering.repetition;

public class Main {

    public static void main(String[] args) {
	   /* DayOfTheWeekChallenge.printDayOfTheWeek(-1);
        DayOfTheWeekChallenge.printDayOfTheWeek(0);
        DayOfTheWeekChallenge.printDayOfTheWeek(1);
        DayOfTheWeekChallenge.printDayOfTheWeek(2);
        DayOfTheWeekChallenge.printDayOfTheWeek(3);
        DayOfTheWeekChallenge.printDayOfTheWeek(4);
        DayOfTheWeekChallenge.printDayOfTheWeek(5);
        DayOfTheWeekChallenge.printDayOfTheWeek(6);
        DayOfTheWeekChallenge.printDayOfTheWeek(7);*/
      //  NumberInWord.printNumberInWord(10);
        System.out.println(NumberOfDaysInMonth.isLeapYear(-1600));
        System.out.println(NumberOfDaysInMonth.isLeapYear(1600));
        System.out.println(NumberOfDaysInMonth.isLeapYear(2017));
        System.out.println(NumberOfDaysInMonth.isLeapYear(2000));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2018));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,-2020));
    }
}
