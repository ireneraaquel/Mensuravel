public class Quadrado implements Mensuravel {

    private String nome;
    private double lado;

    public Quadrado(String nome, double lado){
            this.nome = nome;
            this.lado = lado;
    }

    @Override
    public String getNome(){
        return nome;
    }

    @Override
    public double calcularArea(){
        return lado * lado;
    }

    @Override
    public double calcularPerimetro(){
        return 4 * lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "nome='" + nome + '\'' +
                ", lado=" + lado +
                '}';
    }
}
