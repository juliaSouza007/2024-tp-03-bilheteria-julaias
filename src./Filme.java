import java.util.Date;

public class Filme extends Evento{

    public Filme(String nome, String data, String hora, String local, double preco) {
        super(nome, data, hora, local, preco);
        super.capacidade = 200;
    }

    @Override
    public void addIngresso(Ingresso newIngresso) {
        if(ingressos.size() <= capacidade) {
            if (newIngresso.tipo != 'v') this.ingressos.add(newIngresso);
        }
    }
}