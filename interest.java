import java.util.Scanner;
public class interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int t = sc.nextInt();
        double r = sc.nextDouble();
        try {
            totalInterest(p,t,r);
        }
        catch (ArithmeticException e) {
            System.out.println("error occur");
        }
    }

    private static void totalInterest(int p,int t, double r){
        System.out.println((p*t*r)/100);
    }



}