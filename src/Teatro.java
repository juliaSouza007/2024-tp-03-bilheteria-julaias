import java.util.Date;

public class Teatro extends Evento{

    public Teatro(String nome, String data, double hora, String local, double preco) {
        super(nome, data, hora, local, preco);
        this.capacidade = 250;
    }

    public boolean ingressosDisp() {
        if (ingressos.size() > capacidade) {
            System.out.println("< Ingressos indisponíveis >");
            return false;
        }

        int ingressosVip = 0;

        for (Ingresso atual : this.ingressos) {
            if(atual != null && atual.tipo == 'v') {
                ingressosVip++;
            }
        }

        if (ingressosVip > capacidade*0.1) {
            System.out.println("< Ingressos VIPs indisponíveis >");
            return false;
        }

        return true;
    }
}