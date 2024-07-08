import java.util.Date;

public class Filme extends Evento{

    public Filme(String nome, String data, double hora, String local, double preco) {
        super(nome, data, hora, local, preco);
        super.qtdeIngressos = 200;
    }

}