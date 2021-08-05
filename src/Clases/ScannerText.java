
package Clases;

import java.io.*; //Importamos nuestra libreria de errores.

public class ScannerText {

    //Utilizaremos esta clase que remplaza a escanere y manejamos los Errores.

    //Cadenas de entradas String
    public static String dato(){
        String datos = null;

        try{
            BufferedReader entrada =  new BufferedReader(new InputStreamReader(System.in));
            datos = entrada.readLine();
        }catch(IOException e){
            System.out.print("Error: "+e.getMessage());
        }
        return datos;
    }



    public static int datosInt(){

        try{
            return (Integer.parseInt(dato()));

        }catch(NumberFormatException error){

            return (Integer.MIN_VALUE);
        }


    }


}
