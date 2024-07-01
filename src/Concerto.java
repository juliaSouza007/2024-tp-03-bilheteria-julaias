import java.util.Date;

public class Concerto extends Evento{

    public Concerto(String nome, Date data, double hora, String local, double preco) {
        super(nome, data, hora, local, preco);
        this.quantidadeIngressos = 150;
    }

}
