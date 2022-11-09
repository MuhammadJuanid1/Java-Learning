import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
        int subtract = a-b;
        System.out.println(subtract);
        int mul = a*b;
        System.out.println(mul);
        int divide = a/b;
        System.out.println(divide);

    }
}
