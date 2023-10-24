public class Funcionario {
    private String nome;
    private String dataAdmissao;
    private double salario;
    private static int identificador = 0;

    public Funcionario(String nome, String dataAdmissao, double salario) {
        this.nome = nome;
        setDataAdmissao(dataAdmissao);
        setSalario(salario);
        identificador++;
    }

    public static int getIdentificador() {
        return identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        // Adicione validação para data no futuro aqui, se necessário
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        // Adicione validação para salário mínimo aqui
        if (salario >= 700.00) {
            this.salario = salario;
        } else {
            System.out.println("Erro: Salário inferior a R$ 700,00 não permitido.");
        }
    }
}
