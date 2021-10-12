import java.util.Scanner;

public class Emocoes {


	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Como está se sentindo hoje? ");
        String cd = ler.next();
        String chateado = ":-(";
        String divertido = ":-)";

         if (cd == chateado) {
            System.out.println("Chateado");
        } else if (cd == divertido) {
            System.out.println("Divertido");
        } else {
            System.out.println("Neutro");
        }
    }
}