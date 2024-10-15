public class App {
    public static void main(String[] args) throws Exception {
        
       double celsius = 32;

       double fahrenheit = (celsius * 1.8) + 32;

       System.out.println(String.format("%.2fº em Fahrenheit é %.2fº", celsius, fahrenheit));

       int fahrenheitInteiro = (int) fahrenheit;
       System.out.println(String.format("E essa temperatura sem casas decimais é %d", fahrenheitInteiro));

    }
}
