import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner resposta = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100);
        int contador = 1;

        while(contador < 6) {
            System.out.println("Tente descobrir o número entre 1 - 100");
            System.out.println(String.format("%dª Tentativa!", contador));
            System.out.println();
            System.out.println("Digite seu número: ");
            int tentativa = resposta.nextInt();

            if(tentativa > numeroSecreto) {
                System.out.println(String.format("Você digitou o número %d e ele é maior do que o número secreto!", tentativa));
                System.out.println();
            } else if (tentativa < numeroSecreto) {
                System.out.println(String.format("Você digitou o número %d e ele é menor do que o número secreto!", tentativa));
                System.out.println();
            } else {
                System.out.println(String.format("PARABÉNS! O NÚMERO SECRETO É %d. VOCÊ ACERTOU!!!", tentativa));
                System.out.println();
                break;
            }

            if(contador == 6 && tentativa != numeroSecreto){
                System.out.println(String.format("Você não conseguiu acertar o número em 5 tentativas. O número secreto era %d.", tentativa));

            }

            contador ++;

        }
    }
}
