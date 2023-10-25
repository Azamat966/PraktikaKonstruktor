import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){

        Scanner scanner = new Scanner(System.in);
        Enomal [] enomal = new Enomal[10];
        Random random = new Random();
            for (int i = 0; i < 10; i++) {

            }
        for (int i = 1 ; i <10 ; i++) {

            System.out.println("Введите Имена"+i);
            int a = random.nextInt(1,10);
            enomal [i] = new Enomal(scanner.nextLine(), a);
        }
        for (Enomal b: enomal) {
            System.out.println(b);
        }

    break;}
}
    }











