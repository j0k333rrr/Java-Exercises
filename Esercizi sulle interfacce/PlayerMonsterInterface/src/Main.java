import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("Ettore", 85, 45);
        System.out.println(player1);

        List<String> prova = player1.write();
        System.out.println(prova);
        player1.read(new ArrayList<String>(List.of("Bonjour", "2", "1", "Caca")));
        System.out.println(player1);


    }
}
