public class Main {
    public static void main(String[] args) {
        Evento moana = new Filme("Moana", "08/07/2024", 1.30, "Cinema", 10.0);

        moana.ingressos.add(new Ingresso("08/07/2024", 10));
        moana.ingressos.add(new IngressoVIP("08/07/2024", 10));
        moana.ingressos.add(new Ingresso("08/07/2024", 10));
        moana.ingressos.add(new IngressoMeiaEntrada("08/07/2024", 10));
    }
}
