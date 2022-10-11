package questao_2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Random random = new Random();

        Queue<String> fila_ingressos = new LinkedList<>();

        Scanner ler = new Scanner(new File("c:\\Users/Marcelo/Desktop/ingressos-vendidos.txt"));
        while (ler.hasNextLine()){
            fila_ingressos.add(ler.nextLine());
        }

        for (int i=0; i < 10; i++){
            System.out.println("Entrada VIP : " + fila_ingressos.poll());
        }

        List<String> ingressos_nao_vip = new ArrayList<>(fila_ingressos);
        int pessoa_sorteada = random.nextInt(ingressos_nao_vip.size() - 1);
        
        System.out.println("-------------------------------------------------------");
        System.out.println("A pessoa sorteada para conhecer a banda foi: "+ ingressos_nao_vip.get(pessoa_sorteada));
        System.out.println("-------------------------------------------------------");

    }

}