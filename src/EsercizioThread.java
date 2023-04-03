import java.util.InputMismatchException;
import java.util.Scanner;
public class EsercizioThread {
    public static void main(String[] args) throws InterruptedException {

        try (Scanner input = new Scanner(System.in)) {

            System.out.println("inserisci n: ");
            int n = input.nextInt();

            System.out.println("inserisci k: ");
            int k = input.nextInt();

            Fattoriale f1 = new Fattoriale("n!", n);
            Fattoriale f2 = new Fattoriale("k!", k);
            Fattoriale f3 = new Fattoriale("(n-k)!", n-k);
            
            f1.start();
            f2.start();
            f3.start();
            f1.join();
            f2.join();
            f3.join();

            System.out.println("cobinazione (n k): " + (f1.getVal() / (f2.getVal() * f3.getVal())));

        } catch (InputMismatchException e) {
            System.out.println("errore di inserimento");
        }
    }   
}