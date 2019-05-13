package padresfamilia;
import java.util.Scanner;
/**
 * //   \    >   =  < 
 * @author Sant Garcia
 */
public class PadresFamilia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nombres = "";
        String impresion = "";
        String impresion2 = "";
        String impresion3 = "";
        String impresion4 = "";
        String impresionF = "";
        String verificacion;
        boolean opcion = true;
        int c = 0;
        int hijos;
        double sueldo, pasaje, bar, salida;
        double Tpasaje = 0, Tbar = 0, Tsalida = 0, Total = 0;
        
        System.out.println("____________________________________");
        System.out.println("REPORTE GASTOS DE PADRES DE FAMILIA");
        System.out.println("____________________________________");
        
        // Se establece un condicional booleano que indicara cuando el usuario 
        // desea escribir informacion y cuando desea parar
        while(opcion == true){
            
            // Se usa un contador para los padres de familia que empieza con uno
            // y se sumará cada vez que el usuario ingrese un nuevo padre
            c = c + 1;
            
            // Se empieza digitando los datos del padre de familia
            System.out.println("Padre de familia "+c+"\n"+"Ingrese los Nombres "
                             + "y Apellidos:");
            nombres = entrada.nextLine();
            System.out.println("Ingrese el sueldo semanal:");
            sueldo = entrada.nextDouble();
            System.out.println("Ingrese la cantidad de hijos que posee:");
            hijos = entrada.nextInt();
            
            
            // Se usa una impresion para indicar las transcripciones similares 
            // del programa en forma de un ciclo FOR
            for (int i = 1; i <= 1; i++) {
                impresion = String.format("%s\n\n%s%d\n\n%s%s\n%s%s\n%s%d\n\n%s"
                  + "\n%s\t\t%s\t\t%s\t\t%s", impresion,"Reporte ", c, 
                    "Nombre de Padre de Familia: ", nombres,"Sueldo Semanal: $",
                    sueldo, "Número de Hijos: ", hijos,"Reporte de Gastos", 
                    "Persona", "Pasaje", "Bar", "Salidas");
                
                // Se usa un segundo FOR para indicar los abonos de cada padre 
                // hacia sus X cantidad de hijos 
                for (int j = 1; j <= hijos; j++) {
                    // Se pide la informacion 
                    System.out.println("___________________________");
                    System.out.println("Ingrese los datos del hijo "+j);
                    System.out.println("___________________________");
                    System.out.printf("Abonos de Pasajes:");
                    pasaje = entrada.nextDouble();
                    System.out.printf("Abonos de Bares:");
                    bar = entrada.nextDouble();
                    System.out.printf("Abonos de Salidas:");
                    salida = entrada.nextDouble();
                     System.out.println("___________________________");
                    
                    // Se establece la suma total de los gastos de un padre con 
                    // respecto a su cantidad de hijos y distribucion 
                    Tpasaje = Tpasaje + pasaje;
                    Tbar = Tbar + bar;
                    Tsalida = Tsalida + salida;
                    Total = Total + Tsalida + Tbar + Tpasaje; 
                    
                    // La impresion2 determina los valores que conlleva cada 
                    // hijo con respecto a su padre
                    // dividido en categorias(pasaje, bar , salidas)
                    impresion2 = String.format("%s%s%s\t\t%s\t\t%s\t\t%s\n", 
                            impresion2, "Hijo", j, pasaje, bar, salida);
                    
                }
                // La impresion3 es la linea acerca de totales que requiere el 
                // programa como sumas de pasajes bares y salidas de los X hijos
                // de un padre de familia 
                impresion3 = String.format("%s%s\t\t%s\t\t%s\t\t%s",impresion3,
                        "Totales", Tpasaje, Tbar, Tsalida);
                
                // La impresion4 es el total para comparar acerca de si alcanza
                // el gasto semanal al padre de familia y su salida final
                if (Total <= sueldo) {
                    // Totales
                    impresion4 = String.format("%s%s%s%s%s", impresion4, 
                        "El padre de familia ", nombres, " le alcanza el dinero"
                       + " semanal, para sus gastos\n\nFin reporte ", c);
                }else{
                    impresion4 = String.format("%s%s%s%s%s", impresion4, "El "
                       + "padre de familia ", nombres, " le falta el dinero "
                       + "semanal, para sus gastos\n\nFin reporte ", c);
                }  
            }
           // Se crea una variable total, esta contendra todas las impresiones 
           // anteriores para evitar un semibucle con la misma información 
           impresionF = String.format("%s%s\n%s%s\n%s", impresionF, impresion, 
                   impresion2, impresion3, impresion4);
           
           // Se realiza una limpieza de las impresiones y los datos ya que se 
           // genera un semibucle con la informacion
           impresion = "";
           impresion2 = "";
           impresion3 = "";
           impresion4 = "";
           sueldo = 0;
           hijos = 0;
           
           // Se establece la condicion acerca de si el usuario desea ingresar 
           // más datos acerca de otro padre de familia
           System.out.printf("¿Desea ingresar mas datos de padres de familia?\n"
                            + "Escriba (si) para continuar o (no) para terminar"
                            + "\n");
                            verificacion = entrada.next();
                           
                            if (verificacion.equals("si")) {
                               opcion = true;
                            } else {
                               opcion = false;
                            }
                            // Se coloca un limpiador del buffer para que el 
                            // programa funcione correctamente, especialmente 
                            // con el error de nextLine
                            entrada.nextLine();
        }
        System.out.println("Reporte Gastos de Padres de Familia");
        System.out.println(impresionF);
    }
    
}
