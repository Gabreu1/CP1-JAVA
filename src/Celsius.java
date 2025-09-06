public class Celsius {
    public static double Conversor(double fahrenheit){
        return  (fahrenheit - 32) * 5 / 9;
    }
    public static void main(String[] args) {
        double fahrenheit = 98.6;
        double celsius = Conversor(fahrenheit);

        System.out.printf(fahrenheit + " fahrenheit é equivalente a " + celsius + " celsius\n");
    }
}
