//*****************************************************************************
//Imports
//*****************************************************************************

//*****************************************************************************
//Clase
//*****************************************************************************
public class Controlador {
    public static void main(String[] args){
        Vista vis = new Vista();
       
        int opc = 0; // variable opcion para el menu de opciones
        int menu2 = 0;

        //bucle while para que no pare el programa a menos que el usuario quiera
        while(opc != 2){
           
    
            opc = vis.menu();//guarda la opcion del usuario en la variable opc e imprime el menu
           //(NOTA: al igualar una variable a un metodo, esta ejecuta el metodo y guarda el valor de retorno a la vez, no hau
           //que colocar el metodo antes, esto puede generar bugs)
            switch(opc){
                case 1://Crear nueva RAM
                    int tipo = vis.tipoRAM();//pregunta que  tipo de ram se usara y guarda la opcion
                    switch(tipo){
                        case 1://DDR

                            break;
                        case 2://SDR
                            int tamaniobloques = vis.tamanioSDR()*1024/64;//convierte GB a bloques
                            Memoria SDR = new Memoria(); 
                            SDR.setBloques(tamaniobloques);//crea el array de largo especifico

                            while(menu2 != 10){

                                menu2 =  vis.menu2();

                                switch(menu2){
                                    case 1://ingresar programa nuevo
                                        String nombre = vis.nombrePrograma();//se guarda el nombre 
                                        int tamanioPrograma = vis.tamanioPrograma();//se guarda el tamanio
                                        int ciclosPrograma = vis.ciclosPrograma();//se guarda el numero de ciclos 

                                        Programa prog = new Programa(nombre, tamanioPrograma, ciclosPrograma);//se crea un nuevo objeto de tipo programa

                                        int cantBloques = prog.bloquesQueOcupa();//guarda la cantidad de bloques que ocupa en el array bloques en la variable cantBloques
                                        String nom = prog.getNombre();//obtiene el nombre del programa mediante un getter

                                        SDR.aniadirPrograma(prog);//ejecuta el metodo aniadir programa y mete el programa al array
                                        SDR.ocuparBloques(prog, cantBloques, nom);//realiza lo descrito en el metodo en su clase para ingresar el nombre en el arraylist bloques

                                        break;

                                    case 2://Ver espacio total de la memoria
                                        vis.RAMTotal(tamaniobloques*64/1024);
                                        break;
                                    case 3://Ver espacio disponible

                                        break;
                                    case 4://Ver espacio en uso
                                        vis.RAMOcupada(SDR.espacioEnGB());//multiplica el tamanio del arraylist bloques por 64 y lo divide entre 1024 
                                        break;
                                    case 5://Ver programas en ejecucion
                                        //for(Programa i; i < Programa.length;  )
                                        break;
                                    case 6://Ver programas en cola

                                        break;
                                    case 7://Observar cuantos bloques ocupa un programa

                                        break;
                                    case 8://Ver estado de la memoria
                                        vis.estadoMemoria(SDR.getbloques());
                                        break;
                                    case 9://Realizar ciclo de reloj

                                        break;
                                }
                        
                            }

                            break;
                    }
                case 2://apagar compu

                    break;
            }
        }




    }
}
