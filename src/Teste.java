public class Teste extends ConversorTemperaturaPadrao{
    public static void main(String[] args) {

        ConversorTemperaturaPadrao conversao = new ConversorTemperaturaPadrao();

        conversao.celsiusParaFahrenheit(20);
        conversao.fahrenheitParaCelsius(40);

    }
}
