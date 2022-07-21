package fundamentos;

public class TipoSpring {

    public  static void main (String[] args) {
        System.out.println("Ola pessoal".charAt (2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase().equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "pedro";
        var sobrenome = "santos";
        var idade = 33;
        var salario = 12345.987;

        System.out.println("Nome:" + nome + "\nSobrenome:" + sobrenome
                + sobrenome + "\nIdade:" + idade +
                "\nSalario:" + salario + idade + "\n\n");
        System.out.println();

        String frase = String.format("\n senhor %s %s tem %d anos e ganha R$%.2f. ",
                nome, sobrenome , idade , salario);
        System.out.println(frase);

        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("frase qualquer".indexOf("qual"));
        System.out.println("frase qualquer".indexOf("qual"));
        System.out.println("frase qualquer".substring(6));
        System.out.println("frase qualquer".substring(6 , 10));




    }
}
