public class Livro {
    private String genero;
    private String nome;
    private String isbn;
    private String autor;

    public Livro(String genero, String nome, String isbn, String autor) {
        this.genero = genero;
        this.nome = nome;
        this.isbn = isbn;
        this.autor = autor;
    }

    public void mostrarInformacoes() {
        System.out.println("Livro: " + nome);
        System.out.println("ISBN: " + isbn);
        System.out.println("Autor: " + autor);
        System.out.println("Gênero: " + genero);
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro("Ficção Científica", "O Guia do Mochileiro das Galáxias", "978-0345391803", "Douglas Adams");
        livro1.mostrarInformacoes();

        Livro livro2 = new Livro("Fantasia", "Harry Potter e a Pedra Filosofal", "978-8532530278", "J.K. Rowling");
        livro2.mostrarInformacoes();

        Livro livro3 = new Livro("Drama", "O Pequeno Príncipe", "978-8572323221", "Antoine de Saint-Exupéry");
        livro3.mostrarInformacoes();
    }
}
