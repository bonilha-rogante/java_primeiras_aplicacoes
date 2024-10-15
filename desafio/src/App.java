// Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

// Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
// Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
// Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
// Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
// Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = scanner.nextInt();

        if(n1 > 0){
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }
        
        
        System.out.println("Digite um número: ");
        int n2 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int n3 = scanner.nextInt();

        if(n2 == n3){
            System.out.println("Os número são iguais");
        } else if(n2 < n3){
            System.out.println(String.format("O número %d é menor que o %d", n2, n3));
        } else {
            System.out.println(String.format("O número %d é maior que o %d", n2, n3));
        }

        System.out.println();

        int escolha = 0;

        while(escolha != 3){
            System.out.println("Menu");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo.");
            System.out.println("3. Sair");
            escolha = scanner.nextInt();

            if(escolha == 1){
                System.out.println("Digite o valor de um dos lados do quadrado: ");
                double quadrado = scanner.nextDouble();
                double areaQuadrado = quadrado * quadrado;
                System.out.println(String.format("A área do quadrado é %.2f", areaQuadrado));
            } else if(escolha == 2){
                System.out.println("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println(String.format("A área do círculo é %.2f", areaCirculo));
            } else if(escolha == 3){
                System.out.println("O programa será encerrado.");
            } else{
            System.out.println("Opção inválida. Tente novamente.");
            }
        }


        System.out.println();

        System.out.println("TABUADA");

        System.out.println("Digite o número que você deseja ver a tabuada: ");
        int tabuada = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            int resultado = i * tabuada; 
            System.out.println(String.format("%d X %d = %d", i, tabuada, resultado));
        }

        System.out.println();
        System.out.println("Par ou ímpar");

        System.out.println("Digite o número que deseja verificar: ");
        int inteiro = scanner.nextInt();

        if(inteiro % 2 == 0){
            System.out.println(String.format("Você digitou o número %d e ele é PAR!", inteiro));
        } else{
            System.out.println(String.format("Você digitou o número %d e ele é ÍMPAR!", inteiro));
        }
        
        System.out.println();
        System.out.println("FATORIAL");

        System.out.println("Digite o número que deseja saber o fatorial: ");
        int numero = scanner.nextInt();
        int fatorial = 1;

        for(int i = 1; i <= numero; i++){
            fatorial *= i; 
        }

        System.out.println(String.format("O fatorial de %d é %d!", numero, fatorial));


    }
}
