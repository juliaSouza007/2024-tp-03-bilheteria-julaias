import java.util.Date;

public class Teatro extends Evento{

    public Teatro(String nome, String data, double hora, String local, double preco) {
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
        System.out.println("===== Extrato da Receita do Teatro '" + this.getNome() + "' =====");
        for(Ingresso atual : this.ingressos) {
            if (atual != null) {
                System.out.println(atual.toString());
            }
        }
        System.out.println("==========================================================\n");

    }
}