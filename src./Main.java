import java.util.ArrayList;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Evento> eventos = new ArrayList<>();
        
        Evento moana = new Filme("Moana", "08/07/2024", "1:30", "Cinema", 10.0);
        Evento avengers = new Filme("Avengers", "09/07/2024", "14:00", "Cinema", 18.0);
        Evento filarmonica = new Concerto("Filarmônica", "10/07/2024", "20:00", "Auditório", 50.0);
        Evento hamlet = new Teatro("Hamlet", "11/07/2024", "18:00", "Teatro", 100);
        Evento peterPan = new Teatro("Peter Pan", "12/07/2024", "16:00", "Teatro", 30);
        
        //adcionar evntos na lista - NÃO ESQUECER DE ADCIONAR EVENTO NA LISTA!!
        eventos.add(moana);
        eventos.add(avengers);
        eventos.add(filarmonica);
        eventos.add(hamlet);
        eventos.add(peterPan);

        moana.addIngresso(new Ingresso("08/07/2024", moana.getPreco()));
        moana.addIngresso(new IngressoVIP("08/07/2024", moana.getPreco()));
        moana.addIngresso(new Ingresso("08/07/2024", moana.getPreco()));
        moana.addIngresso(new IngressoMeiaEntrada("08/07/2024", moana.getPreco()));
        
        avengers.addIngresso(new Ingresso("09/07/2024", avengers.getPreco()));
        avengers.addIngresso(new Ingresso("09/07/2024", avengers.getPreco()));
        avengers.addIngresso(new IngressoMeiaEntrada("09/07/2024", avengers.getPreco()));
        
        filarmonica.addIngresso(new Ingresso("10/07/2024", filarmonica.getPreco()));
        filarmonica.addIngresso(new IngressoVIP("10/07/2024", filarmonica.getPreco()));
        

        System.out.println("Normal: " + moana.ingressoNormalDisp());
        System.out.println("Meia: " + moana.ingressoMeiaDisp());
        System.out.println("VIP: " + moana.ingressoVIPDisp());

        System.out.println("Lugares: " + moana.lugaresDisp());

        System.out.println("Venda: " + moana.totalVendas());
        
        System.out.println(avengers.toString());
        
        moana.extratoReceita();
        avengers.extratoReceita();
        filarmonica.extratoReceita();
        
        moana.getIngresso(1).extratoReceita();
        
        double receitaTotalAcumulada = Evento.receitaTotalAcumulada(eventos);
        System.out.println("\nReceita Total Acumulada de Todos os Eventos: R$ " + receitaTotalAcumulada);
        
        moana.ingressosVendidos();

        //dialogos para adquirir um ingresso com jOptionPane
        String[] nomesEventos = {moana.getNome(), avengers.getNome(), filarmonica.getNome(), hamlet.getNome(), peterPan.getNome()};

        String nomeEvento = (String) JOptionPane.showInputDialog(null,
                "<< COMPRA DE INGRESSO >>",
                "Seleção de Evento",
                JOptionPane.PLAIN_MESSAGE,
                null,
                nomesEventos,
                nomesEventos[0]);

        //encontra o evento selecionado
        Evento eventoSelecionado = null;
        for (Evento evento : eventos) {
            if (evento.getNome().equals(nomeEvento)) {
                eventoSelecionado = evento;
                break;
            }
        }

        if (eventoSelecionado != null) {
            //tipos de ingresso
            Object[] opcoesIngressos = {"Normal", "VIP", "Meia Entrada"};

            String tipoIngresso = (String) JOptionPane.showInputDialog(null,
                    "<< TIPO DO INGRESSO>>",
                    "Seleção de Ingresso",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opcoesIngressos,
                    "Normal");

            //adiciona o ingresso selecionado ao evento
            Ingresso ingresso = null;
            switch (tipoIngresso) {
                case "Normal":
                    eventoSelecionado.addIngresso(new Ingresso("08/07/2024", eventoSelecionado.getPreco()));
                    break;
                case "VIP":
                    eventoSelecionado.addIngresso(new IngressoVIP("08/07/2024", eventoSelecionado.getPreco()));
                    break;
                case "Meia Entrada":
                    eventoSelecionado.addIngresso(new IngressoMeiaEntrada("08/07/2024", eventoSelecionado.getPreco()));
                    break;
            }
        }

        //teste de funcionalidade - tudo certo!!
        receitaTotalAcumulada = Evento.receitaTotalAcumulada(eventos);
        System.out.println("\nReceita Total Acumulada de Todos os Eventos: R$ " + receitaTotalAcumulada);
    }
}
