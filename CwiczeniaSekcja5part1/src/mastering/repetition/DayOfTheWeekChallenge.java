package mastering.repetition;

public class DayOfTheWeekChallenge {
    public static void printDayOfTheWeek(int day){
        switch(day){
            case 0:
                System.out.println("Poniedziałek");
                break;
            case 1:
                System.out.println("Wtorek");
                break;
            case 2:
                System.out.println("Sroda");
                break;
            case 3:
                System.out.println("Czwartek");
                break;
            case 4:
                System.out.println("Piątek");
                break;
            case 5:
                System.out.println("Sobota");
                break;
            case 6:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Liczba nie odpowiada za żaden dzien tygodnia");
                break;
        }
    }
}
