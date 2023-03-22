import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o menor número: ");
        final int smaller = sc.nextInt();

        System.out.println("Digite o maior número: ");
        final int bigger = sc.nextInt();

        if (smaller > bigger) {
            System.out.println("Primeiro número deve ser menor!");
        } else if (smaller < 1) {
            System.out.println("O número menor não pode ser menor '1'");
        } else {
            for (int i = smaller; i <= bigger; i++) {
                String line = "";
                for (int j = 1; j <= i; j++) {
                    line += i;
                }
                System.out.println(line);
            }
        }
    }
}
