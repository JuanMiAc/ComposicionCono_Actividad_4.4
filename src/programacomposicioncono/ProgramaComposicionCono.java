
package programacomposicioncono;
/**
 *
 * @author jumia Es el autor
 */
public class ProgramaComposicionCono {
    /**
     * Esta funcion nos sirve para imprimir resultados en pantalla.
     * @param datos Es el objeto de tipo String que vamos a mostrar.
     */
    private static void imprimir (Object datos) { 
    System.out.println(datos); 
    }
    /**
     * Es el main, de donde iniciaremos el codigo.
     * @param args los parametros de la funcion.
     */
    public static void main (String[] args) {
        java.util.Random aleatorio = new java.util.Random();
        for (int i=1; i<=5; i++) {
            int radio = aleatorio.nextInt(9)+1;
             Cono cono = new Cono(0, 0, radio, i, "Azul");
                cono.imprimir();
            }
        }
     }
  
    

