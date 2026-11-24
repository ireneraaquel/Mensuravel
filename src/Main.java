import java.util.ArrayList;

public class Main{
    public static void Main(String[] args){
     ArrayList<Mensuravel> formas = new ArrayList<>();
     Mensuravel v1 = new Velodromo("Velodromo 1", 5, 5);
     Mensuravel q1 = new Quadrado("Quadrado 1", 4);

     formas.add(v1);
     formas.add(q1);

     for(Mensuravel forma : formas){
         System.out.println(forma.toString());
     }

    }
}