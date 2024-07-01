import java.util.Date;

abstract class Evento {
    private String nome;
    private Date data;
    private double hora;
    private String local;
    protected int quantidadeIngressos;
    private double preco;

    public Evento (String nome, Date data, double hora, String local, double preco) {
        this.nome = nome;
        this.data = data;
        this.hora = hora;
        this.local = local;
        this.preco = preco;
    }

}