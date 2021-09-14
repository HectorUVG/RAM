
//*****************************************************************************
//Imports
//*****************************************************************************
import java.util.Scanner;
//*****************************************************************************
//Clase
//*****************************************************************************
public class Vista {
     //*************************************************************************
    //Declaracion de variables
    //*************************************************************************
    private Scanner scan;

    //*************************************************************************
    //Constructores
    //*************************************************************************
    
    public Vista(){
        scan = new Scanner(System.in);
    }
    //*************************************************************************
    //Metodos
    //*************************************************************************

    public int menu(){
        int opcion = 0;
        System.out.println("Seleccione una opcion");
        System.out.println("1.Crear nueva RAM ");
        System.out.println("2. ingresar programa nuevo");
        System.out.println("3. Ver espacio total de la memoria");
        System.out.println("4. Ver espacio disponible ");
        System.out.println("5. Ver espacio en uso");
        System.out.println("6. Ver programas en ejecucion");
        System.out.println("7. Ver programas en cola");
        System.out.println("8. Observar cuantos bloques ocupa un programa");
        System.out.println("9. Ver estado de la memoria");
        System.out.println("10. Realizar ciclo de reloj");

        opcion = scan.nextInt();
        return opcion;
    }

    public int tipoRAM(){
        int tipo = 0;
        System.out.println("Que tipo de memoria desea usar? 1. DDR  2. SDR");
        tipo = scan.nextInt();
        return tipo;
    }

    public int tamanioSDR(){
        int tamanio = 0;
        System.out.println("Seleccione el tamanio deseado de la memoria SDR:");
        System.out.println("1)4GB  2)8GB 3)12GB 4)16GB 5)32GB 6)64GB ");
        tamanio = scan.nextInt();
        return tamanio;
    }

    public int cantidadProgramas(){
        int cantidad = 0;
        System.out.println("Escriba la cantidad de programas que desea ingresar:");
        cantidad = scan.nextInt();
        return cantidad;
    }

    public String nombrePrograma(){
        String nombre = "";
        System.out.println("Escriba el nombre del programa: ");
        nombre = scan.next();
        return nombre;
    }

    public int tamanioPrograma(){
        int tamanio = 0;
        System.out.println("Escriba el tamanio del programa: ");
        tamanio = scan.nextInt();
        return tamanio;
    }
    
    public int ciclosPrograma(){
        int ciclos = 0;
        System.out.println("Escriba cuantos ciclos de reloj dura el programa: ");
        ciclos = scan.nextInt();
        return ciclos;
    }

    
    
    
}
