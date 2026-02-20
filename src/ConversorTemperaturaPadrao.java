public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public void celsiusParaFahrenheit(double celcius){
        double conversao = celcius * 1.8 + 32;
        System.out.println("A conversão de Graus Celcius para Fahrenheit é de: " + conversao + " Graus Cecius");
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit){
        double conversao = (fahrenheit - 32) / 1.8;
        System.out.println("A conversão de Fahrenheit para Graus Celcius é de: " + conversao + " fahrenheits");
    }

}
