public class IngressoMeiaEntrada extends Ingresso{
    public IngressoMeiaEntrada(String data, double valor) {
        super(data, valor/2);
        this.tipo = 'm';
    }
}
