import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

abstract class Evento {
    private String nome;
    private Date data;
    private double hora;
    private String local;
    protected int capacidade;
    private double preco;
    public SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy"); // Para converter String para Date
    protected ArrayList<Ingresso> ingressos;

    public Evento (String nome, String data, double hora, String local, double preco) {
        this.nome = nome;
        try{ // Converte String para Date
            this.data = formatoData.parse(data);
        }catch (Exception e){
            System.out.println("<< Date Error >>");
        }
        this.hora = hora;
        this.local = local;
        this.preco = preco;
        this.ingressos = new ArrayList<>();
    }

    public abstract boolean ingressosDisp();

    public double totalVendas() {
        double total = 0;

        for (Ingresso atual : this.ingressos) {
            if(atual != null) {
                total += atual.valor;
            }
        }
        return total;
    }

    public void addIngresso(Ingresso newIngresso) {
        this.ingressos.add(newIngresso);
    }
}