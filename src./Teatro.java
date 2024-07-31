import java.util.Date;

public class Teatro extends Evento{

    public Teatro(String nome, String data, String hora, String local, double preco) {
        super(nome, data, hora, local, preco);
        this.capacidade = 250;
    }

    @Override
    public void addIngresso(Ingresso newIngresso) {
        if(ingressos.size() <= capacidade) {
            if (newIngresso.tipo == 'm' && ingressoMeiaDisp() <= capacidade * 0.2) {
                this.ingressos.add(newIngresso);
            } else {
                this.ingressos.add(newIngresso);
            }
        }
    }
}