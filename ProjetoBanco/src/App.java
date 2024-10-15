import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String nome = "Guilherme Bonilha";
        String tipoConta = "Corrente";
        double saldo = 2500;
        int opcao = 0;

        System.out.println(String.format("""
                ***********************
                Dados iniciais do cliente:

                Nome: %S
                Tipo conta: %S
                Saldo inicial: R$ %.2f
                ***********************
                """, nome, tipoConta, saldo));

        String menu = """
                Operações

                1- Consultar saldos
                2- Receber valor
                3- Tranferir valor
                4- Sair

                """;

        while(opcao != 4){
            System.out.println(menu);

            System.out.println("Digite uma opção: ");
            opcao = scanner.nextInt();

            if(opcao == 1){
                System.out.println("SALDO");
                System.out.println(String.format("Seu saldo atual é de R$: %.2f", saldo));
                System.out.println();
            }else if(opcao == 2){
                System.out.println("RECEBER VALOR");
                System.out.println("Digite o valor que irá depositar: ");
                double deposito = scanner.nextDouble();
                saldo += deposito;
                System.out.println(String.format("Você depositou R$ %.2f e seu saldo atual é de R$ %.2f", deposito, saldo));
            } else if(opcao == 3){
                System.out.println("TRANFERÊNCIA");
                System.out.println("Digite o valor que irá tranferir: ");
                double transfer = scanner.nextDouble();

                if(transfer > saldo){
                    System.out.println(String.format("Infelizmente não foi possível realizar sua tranferência, pois seu saldo atual é de R$ %.2f e você tentou transferir R$ %.2f.", saldo, transfer));
                } else{
                    saldo -= transfer;
                    System.out.println(String.format("Transação realizada com sucesso! Você transferiu R$ %.2f e seu saldo atual é de R$ %.2f", transfer, saldo));
                }
            }else if(opcao == 4){
                System.out.println(String.format("%S Muito obrigado por usar nossos serviços. Até mais!", nome));
            } else{
                System.out.println("OPÇÃO INVÁLIDA! POR FAVOR, TENTE OUTRA VEZ.");
            }
        }

    }
}






