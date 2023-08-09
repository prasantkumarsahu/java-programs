public class EnumInSwitchCase {
    enum Day{
        SUN,
        MON,
        TUE,
        WED,
        THU,
        FRI,
        SAT
    }
    public static void main(String[] args) {
        Day[] DayNow = Day.values();
        for(Day now : DayNow){
            switch (now){
                case SUN:
                    System.out.println("Sunday");
                    break;
                case MON:
                    System.out.println("Monday");
                    break;
                case TUE:
                    System.out.println("Tuesday");
                    break;
                case WED:
                    System.out.println("Wednesday");
                    break;
                case THU:
                    System.out.println("Thursday");
                    break;
                case FRI:
                    System.out.println("Friday");
                    break;
                case SAT:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Invalid Day!");
            }
        }
    }
}
