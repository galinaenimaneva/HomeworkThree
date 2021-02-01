public class Main {
    public static void main(String[] args){
        getNameOfTheWeekday( 8);

    }

    public static void getNameOfTheWeekday(int number) {
        String Weekday;
        int dayNumber;
        switch (number) {
            case 1:
                Weekday = "Monday";
                System.out.println("The weekday is: " + Weekday);
                break;
            case 2:
                Weekday = "Tuesday";
                System.out.println("The weekday is: " + Weekday);
                break;
            case 3:
                Weekday = "Wednesday";
                System.out.println("The weekday is: " + Weekday);
                break;
            case 4:
                Weekday = "Thursday";
                System.out.println("The weekday is: " + Weekday);
                break;
            case 5:
                Weekday = "Friday";
                System.out.println("The weekday is: " + Weekday);
                break;

            case 6:
                Weekday = "Saturday";
                System.out.println("The weekday is: " + Weekday);
                break;
            case 7:
                Weekday = "Sunday";
                System.out.println("The weekday is: " + Weekday);
                break;
            default:
                System.out.println("Not valid number!");
        }

    }
}
