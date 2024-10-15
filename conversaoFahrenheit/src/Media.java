public class Media {
    public static void main(String[] args){
        //Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double nota1 = 5.5;
        double nota2 = 6.2;

        double media = (nota1 + nota2) / 2;
        System.out.println(String.format("A média entre %.2f e %.2f é de %.2f", nota1, nota2, media));

        //Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
        double valor = 6.8;
        int valorInt = (int) valor;
        System.out.println(String.format("Casting de %f é %d", valor, valorInt));

        //Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
        char letra = 'O';
        String palavra = "Guilherme";

        System.out.println(String.format("%s %s", letra, palavra));

        //Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor toal multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
        double precoProduto = 15.67;
        int quantidade = 10;

        double total = (10 * 15.67);
        
        System.out.println(String.format("Total: %.2f", total));

        //Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
        double valorEmDolares = 156.74;
        double dolar = 4.94;

        double conversao = valorEmDolares / dolar;

        System.out.println(String.format("O valor de $%.2f convertido em Reais é de R$%.2f", valorEmDolares, conversao));

        //Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

        double precoOriginal = 42.56;
        double percentualDesconto = 10.0;

        double desconto = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal - desconto;

        System.out.println(String.format("O produto de R$%.2f com o descnto de %.2f fica R$%.2f", precoOriginal, percentualDesconto, novoPreco));

    }
}
