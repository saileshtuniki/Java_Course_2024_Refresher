enum Weekdays{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}
public class EnumEx2 {
    public static void main(String[] args) {
        Weekdays w = Weekdays.FRIDAY;

        switch (w) {
            case THURSDAY:
                System.out.println("More one day");
                break;
            case FRIDAY:
                System.out.println("End of the week");
                break;
            case SATURDAY:
                System.out.println("What is the plan!..");
            default:
                System.out.println("Done");
                break;
        }

        if(w == Weekdays.WEDNESDAY)
            System.out.println("More 2 Days for Weekend");
        else if(w == Weekdays.FRIDAY)
            System.out.println("Yay its all most over");
        else
            System.out.println(" Done ");
        
    }
}
