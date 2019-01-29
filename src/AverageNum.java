import java.util.Scanner;

public class AverageNum {
    public static void main(String[] args){
        double a,b,c,d,e,f,g,h,i,j;
        double sum;
        double average;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter number 1: ");
        a = keyboard.nextInt();
        Scanner keyboard1 = new Scanner(System.in);
        System.out.print("Please enter number 2: ");
        b = keyboard1.nextInt();
        Scanner keyboard2 = new Scanner(System.in);
        System.out.print("Please enter number 3: ");
        c = keyboard2.nextInt();
        Scanner keyboard3 = new Scanner(System.in);
        System.out.print("Please enter number 4: ");
        d = keyboard3.nextInt();
        Scanner keyboard4 = new Scanner(System.in);
        System.out.print("Please enter number 5: ");
        e = keyboard4.nextInt();
        Scanner keyboard5 = new Scanner(System.in);
        System.out.print("Please enter number 6: ");
        f = keyboard5.nextInt();
        Scanner keyboard6 = new Scanner(System.in);
        System.out.print("Please enter number 7: ");
        g = keyboard6.nextInt();
        Scanner keyboard7 = new Scanner(System.in);
        System.out.print("Please enter number 8: ");
        h = keyboard7.nextInt();
        Scanner keyboard8 = new Scanner(System.in);
        System.out.print("Please enter number 9: ");
        i = keyboard8.nextInt();
        Scanner keyboard9 = new Scanner(System.in);
        System.out.print("Please enter number 10: ");
        j = keyboard9.nextInt();
        sum = a + b + c + d + e + f + g + h + i + j;
        average = sum/10;
        System.out.println("Our average is " + average);
    }
}
