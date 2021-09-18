
//*****************************************************************************
//Imports
//*****************************************************************************
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
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

    public int menu(){//menu principal 
        int opcion = 0;
        System.out.println("\n Seleccione una opcion");
        System.out.println("1.Crear nueva RAM ");
        System.out.println("2. Apagar computadora");
 
        opcion = scan.nextInt();
        System.out.println("");
        return opcion;
    }

    public int tipoRAM(){
        int tipo = 0;
        System.out.println("Que tipo de memoria desea usar? 1. DDR  2. SDR");
        tipo = scan.nextInt();
        System.out.println("");
        return tipo;
    }

    public int tamanioSDR(){
        int tamanio = 0;
        System.out.println("Seleccione el tamanio deseado de la memoria SDR(unicamente el numero de GB):");
        System.out.println("4GB  8GB 12GB 16GB 32GB 64GB ");
       
        tamanio = scan.nextInt();
        System.out.println("");
        return tamanio;
    }

    public int menu2(){//menu que se despliega luego de seleccionar la opcion 1 en el menu principal
        //esto para que no exista la opcion de crear otra ram a menos que se apague la compu
        int opcion = 0;
        System.out.println("Seleccione una opcion");
        System.out.println("1. ingresar programa nuevo");
        System.out.println("2. Ver espacio total de la memoria");
        System.out.println("3. Ver espacio disponible ");
        System.out.println("4. Ver espacio en uso");
        System.out.println("5. Ver programas en ejecucion");
        System.out.println("6. Ver programas en cola");
        System.out.println("7. Observar cuantos bloques ocupa un programa");
        System.out.println("8. Ver estado de la memoria");
        System.out.println("9. Realizar ciclo de reloj");
        System.out.println("10. Apagar computadora");


        opcion = scan.nextInt();
        System.out.println("");
        return opcion;
    }

    public String nombrePrograma(){
        String nombre = "";
        System.out.println("Escriba el nombre del programa: ");
        nombre = scan.next();
        System.out.println("");
        return nombre;
    }

    public int tamanioPrograma(){
        int tamanio = 0;
        System.out.println("Escriba el tamanio (MB) del programa: ");
        tamanio = scan.nextInt();
        System.out.println("");
        return tamanio;
    }
    
    public int ciclosPrograma(){
        int ciclos = 0;
        System.out.println("Escriba cuantos ciclos de reloj dura el programa: ");
        ciclos = scan.nextInt();
        System.out.println("");
        return ciclos;
    }
    
    public void RAMTotal(int tamanio){
        System.out.println ("El tamanio de su memoria es de: " + tamanio + " GB");
        System.out.println("");
    }
    
    public void RAMOcupada(Float tamanio){
        System.out.println("El espacio ocupado (GB) es de: " + tamanio + " GB" );
        System.out.println("");
    }

    public void RAMDisponible(Float disponible){
        System.out.println("El espacio disponible (GB) es de: " + disponible + " GB" );
        System.out.println("");
    }

    public void enEjecucion(List<String> pro){
        System.out.println("Los programas en ejecucion son: " );
        System.out.println(pro);
        System.out.println("");
    }

    public void estadoMemoria(List<String> mem){
        System.out.println("Este es el estado de la memoria: " );
        System.out.println(mem);
        System.out.println("");
    }

    public String freqPrograma(){
        System.out.println("Escriba el programa del cual quiere conocer el espacio que ocupa: ");
        String prog = scan.next();
        System.out.println("");
        return prog;
    }

    public void freqPrograma2(String nombreProg, int freq){
        System.out.println( nombreProg + " ocupa " + freq + " bloques de memoria");
        System.out.println("");
    }
    
    //*********************************************************
    //pruebas
    //************************************************************
    
    public void pruevaDivisBloques(int bloquesqueocupa){
        System.out.println(bloquesqueocupa);
        System.out.println("");
    }

    public void sizeBloques(int bloquesfreq){
        System.out.println(bloquesfreq);
        System.out.println("");
    }

    public void imprimirString (String x){
        System.out.println(x);
        System.out.println("");
    }

}
