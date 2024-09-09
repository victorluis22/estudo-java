class Autor {
    String nome;
    String cpf;

    public void mostrarDetalhes () {
        System.out.println("Nome do autor do livro: " + nome);
        System.out.println("CPF do autor do livro: " + cpf);
    }
}

class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    public boolean temAutor (){
        return autor != null;
    }

    public void aplicaDesconto (double porcentagem){
        valor -= valor * porcentagem;
    }

    public void mostrarDetalhes () {
        System.out.println("Nome do livro: " + nome);
        System.out.println("Descricao do livro: " + descricao);
        System.out.println("Valor do livro: " + valor);
        System.out.println("ISBN do livro: " + isbn);
        
        if (temAutor()){
            autor.mostrarDetalhes();
        }

        System.out.println("---\n");
    }
}

public class CadastroDeLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        Autor autor = new Autor();

        autor.nome = "Victor Luis Teixeira Reis";
        autor.cpf = "000.000.000-00";

        livro.nome = "A Sutil Arte de Ligar o Fodase";
        livro.descricao = "Livro que descreve a sutil arte de ligar o fodase";
        livro.valor = 45.90;
        livro.isbn = "1321392183102";
        livro.autor = autor;

        livro.mostrarDetalhes();

        livro.aplicaDesconto(0.1);

        livro.mostrarDetalhes();
    }
}


