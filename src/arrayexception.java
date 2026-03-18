import java.util.Scanner;

class ArrayDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];

        try {
            System.out.println("Enter the numbers");
            for (int i = 0; i <= 4; i++) {
                arr[i] = sc.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}