//*****************************************************************************
//Imports
//*****************************************************************************
import java.util.ArrayList;
import java.util.List;
//*****************************************************************************
//Clase
//*****************************************************************************

public class Memoria {
    //*************************************************************************
    //Declaracion de variables
    //*************************************************************************
    private int largoArray = 0;
    private int espaciosOcupados = 0;
    private int espaciosDisponibles = 0;
    //private String[] bloques = new String[largoArray];
    List<Programa> programasEnEjecucion = new ArrayList<>(largoArray);
    //arreglo de elementos tipo Programa de largo igual al numero asignado a largoArray

    List<String> bloques = new ArrayList<>(largoArray);//sirve para llenar, con el nombre
    //del programa, la cantidad de bloques equivalente al espacio que ocupa en MB



    //*************************************************************************
    //Constructores
    //*************************************************************************

    //*************************************************************************
    //Metodos
    //*************************************************************************
    public void setBloques( int largo){
        //sirve para determinar el tamanio inicial de la RAM
        this.largoArray = largo;
    } 
    
    public int getEspacioOcupado(){
        //sirve para devolver el tamanio RAM
        return bloques.size();
    }
    
    public float espacioEnGB(){
        //sirve para devolver el tamanio RAM en GB
        float occupiedSize = getEspacioOcupado();
        float espacioGB = occupiedSize*64/1024;
        return espacioGB;
        
    }

/*
    public int espacioOcupado(){
        //Esta funcion recorre todo el arraylist en busca de espacios sin
        // ningun string !!!!!!! creo que se pone "" cuando esta vacio
        //y devuelve el numero de espacios que no estan vacios

        for(int i = 0; i < programasEnEjecucion.size(); i++){
            if(programasEnEjecucion.get(i) != null){
                espaciosOcupados = espaciosOcupados + 1;
            }
        }

        return espaciosOcupados;
    }*/

    public int espacioDisponible(){
        /**
         * Se le resta el espacio ocupado al espacio total para obtener 
         * el espacio disponible
         */
        espaciosDisponibles = programasEnEjecucion.size() - espaciosOcupados;
        return espaciosDisponibles;
    }

    public void aniadirPrograma(Programa prog){//aniade prog al array de programas en ejecucion
       
        programasEnEjecucion.add(prog);
    }

    public void ocuparBloques(Programa progra, int tamanio, String nombre){
        /**
         * Esta funcion llena el array bloques de la siguiente manera. Si el programa prog existe
         * en el arraylist programasEnEjecucion, aniade un string nombre(debe colocarse una variable con el nombre
         * del programa) en el arraylist bloques hasta que cont sea igual a tamanio, siendo tamanio la cantidad
         * de bloques que ocupa.
         */
        if(programasEnEjecucion.contains(progra)){
            int cont = 0;
            while(cont != tamanio){
                bloques.add(nombre);
                cont = cont + 1;
            }
        }
    }

    public List <String> getbloques(){
        return this.bloques;
    }

}   

