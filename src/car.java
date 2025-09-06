public class car {
    String marca;
    String modelo;
    int ano;

    public car(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void informacoes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println();
    }

    public static void main(String[] args) {
        car carro1 = new car("Toyota", "Corolla", 2020);
        car carro2 = new car("Honda", "Civic", 2022);

        System.out.println("Informações do Carro 1:");
        carro1.informacoes();

        System.out.println("Informações do Carro 2:");
        carro2.informacoes();
    }
}
