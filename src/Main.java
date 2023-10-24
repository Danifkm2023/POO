//Após a sua formação no Catalisa, o pessoal te redirecionou para o cliente
//chamado ICarros.


public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", "2023-01-15", 1000.00);
        Funcionario funcionario2 = new Funcionario("Maria", "2022-05-20", 800.00);
        Funcionario funcionario3 = new Funcionario("Carlos", "2023-08-10", 900.00);

        System.out.println("Identificador Funcionário 1: " + funcionario1.getIdentificador());
        System.out.println("Identificador Funcionário 2: " + funcionario2.getIdentificador());
        System.out.println("Identificador Funcionário 3: " + funcionario3.getIdentificador());
    }
}