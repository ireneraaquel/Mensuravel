public class Lote implements Mensuravel{

    private String nome;
    private double frente;
    private double lado;


    public Lote(String nome, double lado, double frente){
        this.nome =  nome;
        this.lado = lado;
        this.frente = frente;
    }

    @Override
    public String getNome(){
        return nome;
    }

    @Override
    public double calcularArea(){
        return lado * frente;
    }

    @Override
    public double calcularPerimetro(){
        return 2 * lado + 2 * frente;
    }

    @Override
    public String toString() {
        return "Lote{" +
                "nome='" + nome + '\'' +
                ", frente=" + frente +
                ", lado=" + lado +
                '}';
    }
}
