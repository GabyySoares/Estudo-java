package fundamentos;

public class Tiposprimitivos {

    public static void main (String[] args) {
         // Informação do funcionario

        //Tipos numéricos inteiros
        byte anosDeEmpresa= 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L;
        // quanto ultrapassar o numero usar o L para dizer que não é mais inteiro

        //Tipos numéricos reais
        float salario = 11_445_44F;
        // ussar F para  para indicar que é um literal float não double
        double vendasAcumuladas= 2_991_797_103.1;

        //tipo booleano
        boolean estaDeFerias = false; //true

        //tipo caracter
        char status = 'A';//ativo

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //Número de viagens
        System.out.println(2);

        //Pontos por real
        System.out.println(pontosAcumulados/vendasAcumuladas);

        System.out.println(id+ ": ganha ->"+ salario );
        System.out.println("Férias?" + estaDeFerias);
        System.out.println("status:" + status);

    }
}
