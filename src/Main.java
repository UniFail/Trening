import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s = sc.next();
            int s2 = sc.nextInt();
            System.out.printf("%-15s%03d%n",s,s2);
            //Complete this line
        }
        System.out.println("================================");

    }
}