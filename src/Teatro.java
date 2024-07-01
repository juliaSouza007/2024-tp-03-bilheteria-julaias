import java.util.Date;

public class Teatro extends Evento{

    public Teatro(String nome, Date data, double hora, String local, double preco) {
        super(nome, data, hora, local, preco);
        this.quantidadeIngressos = 250;
    }

}