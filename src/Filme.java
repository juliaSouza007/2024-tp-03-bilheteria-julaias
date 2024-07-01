import java.util.Date;

public class Filme extends Evento{

    public Filme(String nome, Date data, double hora, String local, double preco) {
        super(nome, data, hora, local, preco);
        super.quantidadeIngressos = 200;
    }

}