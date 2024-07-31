import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Evento> eventos = new ArrayList<>();
        
        Evento moana = new Filme("Moana", "08/07/2024", "1:30", "Cinema", 10.0);
        Evento avengers = new Filme("Avengers", "09/07/2024", "14:00", "Cinema", 18.0);
        Evento filarmonica = new Concerto("Filarmônica", "10/07/2024", "20:00", "Teatro", 50.0);
        
        //adcionar evntos na lista 
        eventos.add(moana);
        eventos.add(avengers);
        eventos.add(filarmonica);
        
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
    }
}
