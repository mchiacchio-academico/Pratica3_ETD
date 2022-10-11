package questao_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner;
        Stack stack = new Stack();
        String top10 [] = new String [10];
        scanner = new Scanner(new File("c:\\Users/Marcelo/Desktop/frases.txt"));
        while (scanner.hasNextLine()){
            stack.push(scanner.nextLine());
        }
        for (int i = 0; i < 10; i++) {
            top10[i] = (String) stack.pop();
            System.out.println("Top "+(i+1)+" mais buscado: '"+top10[i]+"'");
        }
        System.out.printf("\n-------------------------------------------------\n");
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}