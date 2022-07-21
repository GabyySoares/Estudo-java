import java.util.Scanner;

public class console {

    public static void  main (String[] args){

        System.out.print("bom dia");
        System.out.print("dia!");

        System.out.println("Bom");
        System.out.println("dia");

        System.out.printf("megasena: %d %d %d %d %d %d %n"
                , 1,2,3,4,5,6);
        System.out.printf("salário: %.1f%n", 1234.5678);
        System.out.printf("nome: %s %n", "joão");

        Scanner entrada = new  Scanner (System.in);


        System.out.print("digite o seu nome:");
        String nome = entrada.nextLine();

        System.out.print("digite o seu sobrenome:");
        String sobrenome = entrada.nextLine();

        System.out.print("digite sua idade:");
        int idade = Integer.parseInt(entrada.nextLine());

        System.out.printf(" %s %s tem %d anos. %n", nome , sobrenome , idade);

        entrada.close();

    }
}
