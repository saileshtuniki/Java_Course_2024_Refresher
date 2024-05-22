enum Weekdays{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}

public class EnumEx1 {
    public static void main(String[] args) {
        Weekdays week = Weekdays.SATURDAY;
        System.out.println(week.ordinal()); //5 -> (saturday)

        
        
        //System.out.println(weeks[0]);   //MONDAY
        Weekdays[] weeks = Weekdays.values();
        //forloop
        for(Weekdays w : weeks)
        {
            System.out.println(w);
            // System.out.println(w.ordinal() + "->" + w); //odinalvalue -> name
        }

    }
}
 