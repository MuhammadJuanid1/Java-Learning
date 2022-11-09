import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b){
            System.out.println("Equal");
        } else if (a < b){
            System.out.println("a is a lesser");        
        } else {
            System.out.println("a is greater");
        }

        int sum = a+b;
        System.out.println(sum);
        int subtract = a-b;
        System.out.println(subtract);
        int mul = a*b;
        System.out.println(mul);
        int divide = a/b;
        System.out.println(divide);
        int modulo = a%b;
        System.out.println(modulo);
        
        // Question03
        int button = sc.nextInt();
        switch (button) {
            case 1:System.out.println("January");
            break;
            case 2:System.out.println("February");
            break;
            case 3:System.out.println("March");
            break;
            case 4:System.out.println("April");
            break;
            case 5:System.out.println("May");
            break;
            case 6:System.out.println("June");
            break;
            case 7:System.out.println("July");
            break;
            case 8:System.out.println("August");
            break;
            case 9:System.out.println("September");
            break;
            case 10:System.out.println("October");
            break;
            case 11:System.out.println("November");
            break;
            case 12:System.out.println("December");
                
              
        }
        // Question01
        System.out.println("*\n**\n***\n****");
        // Queston02
        
        switch (button){
            case 1:System.out.println("Monday");
            break;
            case 2:System.out.println("Tuesday");
            break;
            case 3:System.out.println("Wednesady");
            break;
            case 4:System.out.println("Thursday");
            break;
            case 5:System.out.println("Friday");
            break;
            case 6:System.out.println("Saturday");
            break;
            default:System.out.println("Sunday");
        }
    
    }
}
    
