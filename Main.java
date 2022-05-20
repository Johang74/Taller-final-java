import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       boolean salir = false;
        int opc;
       Scanner entrada = new Scanner (System.in);


       System.out.println("Calculadora");
       System.out.println("===================================");
       System.out.println("Escribe un numero: ");
       double numero = entrada.nextDouble();
       Calculadora calculadora =  new Calculadora(numero);

        while (!salir) {
            System.out.println("===================================");
            System.out.println("Selecciona una opcion");
            System.out.println("1) Sumar +");
            System.out.println("2) Restar -");
            System.out.println("3) Multiplicar X");
            System.out.println("4) Dividir /");
            System.out.println("5) Modulo %");
            System.out.println("6) Reestablecer calculadora 0");
            System.out.println("7) Salir de la calculadora **");
            opc = entrada.nextInt();
            
            
            switch (opc) {
                case 1:
                    numero = pedirNumero();
                    calculadora.sumar(numero);
                    System.out.println("===================================");
                    System.out.println("Resultado = "+ calculadora.resultado);
                    break;
                case 2:
                    numero = pedirNumero();
                    calculadora.restar(numero);
                    System.out.println("===================================");
                    System.out.println("Resultado = "+ calculadora.resultado);
                    break;
                case 3:
                    numero = pedirNumero();
                    calculadora.multiplicar(numero);
                    System.out.println("===================================");
                    System.out.println("Resultado = "+ calculadora.resultado);
                    break;
                case 4:
                    numero = pedirNumero();
                    calculadora.dividir(numero);
                    System.out.println("===================================");
                    System.out.println("Resultado = "+ calculadora.resultado);
                    break;
                case 5:
                    numero = pedirNumero();
                    calculadora.modulo(numero);
                    System.out.println("===================================");
                    System.out.println("Resultado = "+ calculadora.resultado);
                    break;
                case 6:
                    System.out.println("CASO 6");
                    calculadora.resultado = 0;
                    System.out.println("===================================");
                    System.out.println("Resultado = "+ calculadora.resultado);
                    break;
                case 7:
                    System.out.println("===================================");
                    System.out.println("Resultado = "+ calculadora.resultado);
                    System.out.println("===================================");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
   }
   /**
    * Pide el numero que se va a usar para hacer el calculo
    * @return Retorna el numero solicitado al usuario
    */
   public static double pedirNumero() {
        double numero;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Escribe un numero: ");
        numero = entrada.nextDouble();
        return numero;
       
   }
    
}