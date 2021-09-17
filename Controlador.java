//*****************************************************************************
//Imports
//*****************************************************************************

//*****************************************************************************
//Clase
//*****************************************************************************
public class Controlador {
    public static void main(String[] args){
        Vista vis = new Vista();
       
        int opc = 0;

        vis.menu();// imprime el menu
        // variable opcion para el menu de opciones

        opc = vis.menu();//guarda la opcion del usuario en la variable opc
        
        //bucle while para que no pare el programa a menos que el usuario quiera
        while(opc != 11){
            
           
            switch(opc){
                case 1://Crear nueva RAM
                    vis.tipoRAM();//pregunta que  tipo de ram se usara
                    if(vis.tipoRAM() == 1){//DDR

                    }
                    if(vis.tipoRAM() == 2){//SDR
                        vis.tamanioSDR();//escoger el tamanio de la memoria
                        int tamaniobloques = vis.tamanioSDR()*1024/64;//convierte GB a bloques
                        Memoria SDR = new Memoria(); 
                        SDR.setBloques(tamaniobloques);//crea el array de largo especifico
                    }
                case 2://ingresar programa nuevo
                case 3://Ver espacio total de la memoria
                case 4://Ver espacio disponible
                case 5://Ver espacio en uso
                case 6://Ver programas en ejecucion
                case 7://Ver programas en cola
                case 8://Observar cuantos bloques ocupa un programa
                case 9://Ver estado de la memoria
                case 10://Realizar ciclo de reloj
                vis.menu2();
            }
        }




    }
}
