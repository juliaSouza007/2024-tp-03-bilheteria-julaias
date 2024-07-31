public class Concerto extends Evento{

    public Concerto(String nome, String data, String hora, String local, double preco) {
        super(nome, data, hora, local, preco);
        this.capacidade = 150;
    }

    @Override
    public void addIngresso(Ingresso newIngresso) {
        if(ingressos.size() <= capacidade) {
            if (newIngresso.tipo == 'v' && ingressoVIPDisp() <= capacidade * 0.1) {
                this.ingressos.add(newIngresso);
            } else {
                this.ingressos.add(newIngresso);
            }
        }
    }
}
