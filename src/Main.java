public class Main {
    public static void main(String[] args) {
        Livro obj1 = new Livro("Java Programming");
        obj1.setAutor("Herbert Schildt");
        obj1.setAno("2018");

        Livro obj2 = new Livro("Python for Data Analysis");
        obj2.setAutor("Wes McKinney");
        obj2.setAno("2017");

        Livro obj3 = new Livro("Clean Code");
        obj3.setAutor("Robert C. Martin");
        obj3.setAno("2008");

        // instanciar biblioteca
        Biblioteca bib = new Biblioteca();
        bib.inserir(obj1); //inserção de cada livro na biblioteca
        bib.inserir(obj2); //inserção de cada livro na biblioteca
        bib.inserir(obj3); //inserção de cada livro na biblioteca

        bib.listarTodos(); //listar todos os livros

        System.out.println("Buscando livro");
        bib.BuscaLivros(2); // busca o livro pelo ID
        //bib.Remocao(1); // remoção do livro pelo id
        bib.listarTodos(); // listar todos os livros na biblioteca
    }
}

