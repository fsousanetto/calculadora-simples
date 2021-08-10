package operacoes;
import java.util.Scanner;


public class Calc {
    
    public static void main(String[] args) {
        
        short operacao;
        double valor1, valor2;
        Scanner input = new Scanner(System.in);
        
    
    
        do{
            System.out.println("Escolha a operação: ");
            System.out.println(" 1. Soma");
            System.out.println(" 2. Subtração");
            System.out.println(" 3. Multiplicação");
            System.out.println(" 4. Divisão");
            System.out.println(" 0. Sair");
            System.out.println("Operação: ");
            operacao = input.nextShort();
    
            if (operacao == 0) {
                
                System.out.println("Até mais");
                break;
    
            } 
            if (!OperacaoExiste(operacao)) {

                continue;
                
            }
    
            System.out.println("Digite o primeiro valor: ");
            valor1 = input.nextDouble();

            System.out.println("Digite o segundo valor: ");
            valor2 = input.nextDouble();

            if (!ValidaDadosDeEntrada(operacao, valor1, valor2)){
                
                continue;
            }

            System.out.println("Resultado: O valor da operação " + getNomeOperacao(operacao) + " é " + Calcular(operacao, valor1, valor2) + "\n");


        }while(operacao != 0);
        
        input.close();
    }
    
    static double Calcular (short operacao, double valor1, double valor2) {
    
        double resultado = 0;
    
        switch(operacao){
    
            case 1: //soma
                    resultado = valor1 + valor2;
                    break;
                case 2: //substração
                    resultado = valor1 - valor2;
                    break;
                case 3: //multiplicação
                    resultado = valor1 * valor2;
                    break;
                case 4: //divisão
                    resultado = valor1 / valor2;
                    break;
    
        }
    
        return resultado;
    
    }
    
    static boolean OperacaoExiste (short operacao){
    
        boolean retorno = true;
    
        if(operacao > 4){
    
            System.out.println("Erro!: Operação inválida!");
            
            retorno = false;
        }
    
        return retorno;
    }
    
    static boolean ValidaDadosDeEntrada (short operacao, double valor1, double valor2) {
    
        boolean retorno = true;
         if (operacao == 4 & valor2 == 0){
    
            System.out.println("Erro! Divisor não pode ser 0!");
    
            retorno = false;
    
         }
    
        return retorno;
    
    }
    
    static String getNomeOperacao(short operacao) {
    
        switch (operacao) {
    
            case 1: 
            return "Soma";
    
            case 2: 
            return "Subtração";
    
            case 3: 
            return "Multiplicação";
    
            case 4: 
            return "Divisão";
    
            default: 
            return "Undefined";
        }

    }    
}