// import java.time.MonthDay;

import java.util.*;
public class SwitchBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int button = sc.nextInt();
        switch (button){
            case 1 : System.out.println("Month");
            break;
            case 2 : System.out.println("Tuesday");
            break;
            case 3 : System.out.println("Wednesday");
            break;
            case 4 : System.out.println("Thursday");
            break;
            case 5 : System.out.println("Friday");
            break;
            case 6 : System.out.println("Saturday");
            break;
            default : System.out.println("Sunday");
                
        }
    }
}
