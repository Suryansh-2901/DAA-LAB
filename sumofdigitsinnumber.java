import java.util.*;
public class sumofdigitsinnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer:");
        int a = sc.nextInt();
        String numberAsString = String.valueOf(a); // Convert int to String
        int n = numberAsString.length();
        int temp = 0;
        for(int i = 0;i<n;i++){
            temp = temp+Integer.valueOf(numberAsString.charAt(i));
        }
        System.out.println("The sum of Digits of the given number is: " + temp);
        System.out.println(n);
        sc.close();
    }
}
