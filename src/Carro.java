public class Carro {
    private String marca;
    private int ano;
    private double valor;
    private String cor;
    private int portas;
    private int velocidade;

    public Carro(String marca, int ano, double valor, String cor, int portas) {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
        this.cor = cor;
        this.portas = portas;
        this.velocidade = 0;
    }

    public void iniciarMotor() {
        System.out.println("Iniciando o motor... minha velocidade está em " + velocidade + " km/h");
    }

    public void frear() {
        velocidade -= 5;
        System.out.println("Freando... minha velocidade está em " + velocidade + " km/h");
    }

    public void acelerar() {
        velocidade += 10;
        System.out.println("Acelerando... minha velocidade está em " + velocidade + " km/h");
    }

    public static void main(String[] args) {
        Carro renault = new Carro("Renault", 2022, 35000, "Prata", 4);
        renault.iniciarMotor();
        renault.acelerar();
        renault.frear();

        Carro fiat = new Carro("Fiat", 2023, 30000, "Vermelho", 2);
        fiat.iniciarMotor();
        fiat.acelerar();
        fiat.frear();

        Carro hyundai = new Carro("Hyundai", 2021, 40000, "Azul", 4);
        hyundai.iniciarMotor();
        hyundai.acelerar();
        hyundai.frear();
    }
}
