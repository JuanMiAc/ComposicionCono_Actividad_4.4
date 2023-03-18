/*Vamos a hacer un commit nuevo*/
package programacomposicioncono;
/**
 *
 * @author jumia
 */
public class Circulo {
   
    private float x, y;
    private float radio;
   
    public Circulo (float cX, float cY, float r) { // Constructor de la clase Circulo.
        this.x = cX;
        this.y = cY;
        this.radio = r;
    }
     /**
     * Obtener valor x.
     * @return nos devuelve el valor de x.
     */
    public float getX() { return x; } //Obtener x
   /**
    * Configurar el valor x.
    * @param x ya configuirado.
    */
    public void setX(float x) { this.x = x; } //Obtener y
    /**
     * Obtener valor y.
     * @return nos devuelve el valor de y.
     */
    public float getY() { return y; } //Obtener x
    /**
     * Obtener valor y.
     * @param y ya configurado. 
     */
    public void setY(float y) { this.y = y; } //Obtener x
    /**
     * Obtener valor del radio.
     * @return nos devuelve el radio.
     */
    public float getRadio() { return radio; } //Obtener x
    /**
     * Configurar valor del radio.
     * @param radio el radio configurado.
     */
    public void setRadio(float radio) { this.radio = radio; }
    /**
     * Calcular el area del circulo.
     * @return 
     */
    public float area() { return (float)Math.PI*radio*radio; }
    
     /**
     * Funcion para imprimir datos el circulo.
     * 
     */
    public void imprimir () {
        System.out.print(" x=" + x);
        System.out.print(" y=" + y);
        System.out.print(" r=" + radio);
        System.out.print(" A=" + area());
    }
}/*AÑADIMOS UN TEXTO*/
