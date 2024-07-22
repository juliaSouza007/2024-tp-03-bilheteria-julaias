import java.util.Date;

public class Filme extends Evento{

    public Filme(String nome, String data, double hora, String local, double preco) {
        super(nome, data, hora, local, preco);
        super.capacidade = 200;
    }

    @Override
    public void addIngresso(Ingresso newIngresso) {
        if(ingressos.size() <= capacidade) {
            if (newIngresso.tipo != 'v') this.ingressos.add(newIngresso);
        }
    }

    @Override
    public double totalReceita() {
        double total = 0;

        for (Ingresso atual : this.ingressos) {
            if(atual != null) {
                total += atual.valor;
            }
        }
        return total;
    }

    @Override
    public void extratoReceita() {
        System.out.println("===== Extrato da Receita do Filme '" + this.getNome() + "' =====");
        for(Ingresso atual : this.ingressos) {
            if (atual != null) {
                System.out.println(atual.toString());
            }
        }
        System.out.println("=========================================================\n");

    }
}