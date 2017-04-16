import java.util.Scanner;

/**
 * Created by teo on 4/16/2017.
 */
public class helloworld {
    public static void main(String args[]){
        System.out.println("Hellow Workdl");
        int a = 0;
        int b = 5;
        int c = 10;
        int sum;
        sum = a + b + c;
        System.out.println("Tong la: " +sum);
        // Tong 2 so lay tu user
        Scanner num = new Scanner(System.in);
        int num1, num2;
        System.out.print("Please enter number 1: ");
        num1 = num.nextInt();
        System.out.print("Please enter number 2: ");
        num2 = num.nextInt();
        System.out.println("cong: " +add(num1, num2));
    }
    public static int add(int x, int y){
        int result = x + y;
        return result;
    }
    public static int div(int x, int y){
        int result = x/y;
        return result;
    }
}
