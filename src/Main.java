// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int k = 1; k <= (i + 2); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}