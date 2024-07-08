import java.util.Date;

public class Teatro extends Evento{

    public Teatro(String nome, String data, double hora, String local, double preco) {
        super(nome, data, hora, local, preco);
        this.qtdeIngressos = 250;
    }

}