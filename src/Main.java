public class Main {
    public static void main(String[] args) {
        Evento moana = new Filme("Moana", "08/07/2024", 1.30, "Cinema", 10.0);
        
        moana.addIngresso(new Ingresso("08/07/2024", moana.getPreco()));
        moana.addIngresso(new IngressoVIP("08/07/2024", moana.getPreco()));
        moana.addIngresso(new Ingresso("08/07/2024", moana.getPreco()));
        moana.addIngresso(new IngressoMeiaEntrada("08/07/2024", moana.getPreco()));

        System.out.println("Normal: " + moana.ingressoNormalDisp());
        System.out.println("Meia: " + moana.ingressoMeiaDisp());
        System.out.println("VIP: " + moana.ingressoVIPDisp());

        System.out.println("Lugares: " + moana.lugaresDisp());

        System.out.println("Venda: " + moana.totalVendas());
        
        moana.extratoReceita();
    }
}
