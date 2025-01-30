import java.util.Scanner;

public class Fasctorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        if (n==1){
            System.out.print("The series is: " +a);
        } else if (n==2) {
            System.out.print("The series is: " +a+ " " +b);
        }
        else {
            System.out.print("The series is: " +a+ " " +b+ " ") ;
            for (int i = 0; i < n-2; i++) {
                int result = a + b;
                a = b;
                b = result;
                System.out.print( result +" ");
            }
        }
    }
}
