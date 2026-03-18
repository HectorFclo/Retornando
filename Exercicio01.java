public class Exercicio01 {

  public static void converterCelsiusParaFahrenheit(double celsius) {
 double fahrenheit = (celsius * 9/5) + 32;

System.out.println(celsius + "°C equivale a " + fahrenheit + "°F");

}

    public static void main(String[] args) {
        converterCelsiusParaFahrenheit(10.0);
        converterCelsiusParaFahrenheit(30.0);

    }
}