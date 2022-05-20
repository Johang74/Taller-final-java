/**
 * Descripcion de la clase
 * 
 * Clase Calculadora, contiene los metodos sumar, restar, multiplicar,
 * dividir y modulo, ademas del atributo resultado, el cual, almacena
 * el resultado parcial de la calculadora.
 * @author Johan Gomez <johang0297@gmailcom>
 * @version 1.0.0
 */


public class  Calculadora {
    /**
     * Resultado parcial de las operaciones.
     */
    double resultado;

    public Calculadora( double numero){
        this.resultado = numero;
    }

    /**
     * Suma el resultado parcial y el numero ingresado
     * Pongo este como ejemplo, los demas estan sin documentar ya que
     * se explican ellos mismos a partir de esta descripcion y de sus
     * respectivos nombres
     * @param numero numero que ingresa el usuario en la consola
     * @since 1.0.0
     */

    public void sumar(double numero) {
        this.resultado = this.resultado + numero;
    }

    public void restar(double numero) {
        this.resultado = this.resultado - numero;
    }

    public void multiplicar(double numero) {
        this.resultado = this.resultado * numero;
    }

    public void dividir(double numero) {
        if (numero == 0) {
            System.out.println("===================================");
            System.out.println("No se puede dividir entre cero");
        } else {
            this.resultado = this.resultado / numero;
        }
        
    }

    public void modulo(double numero) {
        if (numero == 0) {
            System.out.println("===================================");
            System.out.println("No se puede dividir entre cero");
        } else {
            this.resultado = this.resultado % numero;
        }
        
    }
}
