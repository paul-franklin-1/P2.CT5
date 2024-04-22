import java.util.ArrayList;
import java.util.Scanner;

public class RecursionTask {
    private static ArrayList<Integer> list = new ArrayList<>();


    public static int numsProduct(int n){
        if (n == 0) {
            return 0;
        }
        else {
            return list.get(n); //* numsProduct(n-1);

        }}




    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int first = scnr.nextInt();
        list.add(first);
        System.out.println("Enter second integer: ");
        int second = scnr.nextInt();
        list.add(second);
        System.out.println("Enter third integer: ");
        int third = scnr.nextInt();
        list.add(third);
        System.out.println("Enter fourth integer: ");
        int fourth = scnr.nextInt();
        list.add(fourth);
        System.out.println("Enter fifth integer: ");
        int fifth = scnr.nextInt();
        list.add(fifth);
        System.out.println(numsProduct(4));

    }
}