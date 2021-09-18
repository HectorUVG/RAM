//*****************************************************************************
//Imports
//*****************************************************************************

//*****************************************************************************
//Clase
//*****************************************************************************

public class Programa {
    //*************************************************************************
    //Declaracion de variables
    //*************************************************************************
    private String nombre;
    private int espacio;
    private int tiempo;
    private int divisionBloques = 0;
    private int cocienteBloques = 0;

    //*************************************************************************
    //Constructores
    //*************************************************************************
    public Programa(String nombre, int espacio, int tiempo){
        this.nombre = nombre;
        this.espacio = espacio;
        this.tiempo = tiempo;
    }
    //*************************************************************************
    //Metodos
    //*************************************************************************
    public String getNombre(){
        return nombre;
    }
    
    public int getEspacio(){
        return espacio;
    }
    
    public int getTiempo(){
        return tiempo;
    }

    public void cicloReloj(){//se ejecutara cada vez que el usuario realize un ciclo
        if(this.tiempo != 0){
            this.tiempo = this.tiempo - 1;
        }
        if(this.tiempo == 0){
            this.tiempo = 0;
        }
    }

    public void divisionBloques(){//hace la conversion de MB a bloques 
        this.divisionBloques = espacio/64;
    }

    public void cociente(){//verifica si hay un cociente, si lo hay, le suma 1 a la 
        //division, esto para crear un bloque adicional
        this.cocienteBloques = espacio % 64;
        if (this.cocienteBloques != 0){
            this.divisionBloques = divisionBloques + 1;
        }
    }

    public int bloquesQueOcupa(){//obtenemos el numero de bloques que requiere el programa
        return divisionBloques;
    }




}

