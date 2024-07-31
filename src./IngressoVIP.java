public class IngressoVIP extends Ingresso{
    public IngressoVIP(String data, double valor) {
        super(data, valor*2);
        this.tipo = 'v';
    }
}
