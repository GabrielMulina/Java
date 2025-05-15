package Calculadora;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Soma sm = new Soma();
        Multiplicacao mm = new Multiplicacao();
        Subtracao sb = new Subtracao();
        Divisao dv = new Divisao();

        float n1, n2;
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        while(continuar){
            System.out.println("===CALCULADORA===");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Divisao");
            System.out.println("4 - Multiplicacao");
            System.out.println("0 - SAIR");

            int opcao = sc.nextInt();
            if (opcao == 0){
                System.out.println("Encerrando a CALCULADORA");
                break;
            }

            System.out.println("Digite o primeiro numero: ");
            n1 = sc.nextFloat();

            System.out.println("Digite o segundo numero: ");
            n2 = sc.nextFloat();

            float resultado;


            switch(opcao){
                case 1:
                    resultado = sm.calcularSoma(n1, n2);
                    System.out.println("Resultado:  " + resultado);

                    break;
                case 2:
                    resultado = sb.calcularSubtracao(n1, n2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = dv.calcularDivisao(n1, n2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    resultado = mm.calcularMultiplicacao(n1,n2);
                    System.out.println("Resultado: " + resultado);
                    break;
            }


        }

        sc.close();
    }
}
