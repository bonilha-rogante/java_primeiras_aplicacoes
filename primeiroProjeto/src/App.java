public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        // Média calculada pelas 3 notas da Jack, Paulo e Suelem
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media); 

        String sinopse = """
                            Filme de aventura com galã dos anos 80.
                            Muiito Bbom!
                            Ano de lançamento: 
                            """ + 2022;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}


