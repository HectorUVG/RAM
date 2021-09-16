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
    List<Programa> bloques = new ArrayList<>(largoArray);
    //arreglo de elementos tipo Programa de largo igual al numero asignado a largoArray



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
    
    public int getBloques(){
        //sirve para devolver el tamanio RAM
        return bloques.size();
    }
    
    public int espacioOcupado(){
        /**Esta funcion recorre todo el arraylist en busca de espacios sin
         * ningun string !!!!!!! creo que se pone "" cuando esta vacio
        * y devuelve el numero de espacios que no estan vacios*/
        for(int i = 0; i < bloques.size(); i++){
            if(bloques.get(i) != null){
                espaciosOcupados = espaciosOcupados + 1;
            }
        }

        return espaciosOcupados;
    }

    public int espacioDisponible(){
        /**
         * Se le resta el espacio ocupado al espacio total para obtener 
         * el espacio disponible
         */
        espaciosDisponibles = bloques.size() - espaciosOcupados;
        return espaciosDisponibles;
    }
}   

