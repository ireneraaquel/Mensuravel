public class Velodromo implements Mensuravel{
    private String nome;
    private double raioMaior;
    private double raioMenor;

    public Velodromo(String nome, double raioMaior, double raioMenor){
        this.nome = nome;
        this.raioMaior = raioMaior;
        this.raioMenor = raioMenor;
    }
    @Override
    public String getNome(){
        return this.nome;
    }

    @Override
    public double calcularArea(){
        return Math.PI * raioMaior * raioMenor;
    }

    @Override
    public double calcularPerimetro(){
        return Math.PI * (3*(raioMaior + raioMenor) - 0.5 *(( 3 * raioMaior + raioMenor ) * (raioMaior + 3 * raioMenor)));
    }

    @Override
    public String toString() {
        return "Velodromo{" +
                "nome='" + nome + '\'' +
                ", raioMaior=" + raioMaior +
                ", raioMenor=" + raioMenor +
                '}';
    }
}
