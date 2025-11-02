import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        int n = sc.nextInt();

        Number num = new Number(n);

        num.display();
    }
}
