
package programacomposicioncono;
/**
 *
 * @author jumia Este soy yo, el creador.
 */
public class Cono {
    private Circulo base;
    private float altura;
    private String color;
    
    public Cono (float cX, float cY, float r, float h, String color) { // Constructor de la clase Cono.
        this.base = new Circulo(cX, cY, r);
        this.altura = h;
        this.color = color;
     }
    /**
     * Recoge datos de la base.
     * @return nos devuelve el dato.
     */
    public Circulo getBase() {
        return base;
    }
    /**
     * Actualizamos la base.
     * @param base es el dato actualizado.
     */
    public void setBase(Circulo base) {
        this.base = base;
    }
    /**
     * Recoge datos de altura.
     * @return nos devuelve el dato.
     */
    public float getAltura() {
        return altura;
    }
    /**
     * Actualizamos la altura.
     * @param altura es el dato actualizado.
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Recoge el color del cono.
     * @return nos devuelve el color.
     */
    public String getColor() {
        return color;
    }
    /**
     * Configuramos el color del cono.
     * @param color es elactualizado.
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Funcion imprimir declarada.
     * 
     */
    public void imprimir () {
        base.imprimir(); 
        System.out.println(" h=" + altura + " c=" + color);
    }      
}
