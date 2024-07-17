public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Четные числа в массиве:");
        for (int a : array) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }
    }
}