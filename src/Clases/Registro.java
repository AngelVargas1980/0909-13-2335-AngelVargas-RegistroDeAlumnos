package Clases;

import java.io.IOException;
import java.util.List;
import java.util.Random;

public class Registro {
    //Creamos nuestra variable de tipo Array Multidimencional de Alumnos
    static Alumnos alumnos[]= null;
    static int contador = 0;
    int size = 0;

    public void sizeAlumno() throws IOException{
        //Variable para la cantidad de nuestra Lista
        System.out.println("******Ingrese la cantidad de Alumnos a Registrar******");
        size = ScannerText.datosInt();
        alumnos = new Alumnos[size];
        System.out.println("******Okey,la cantidad de alumnos a registrar sera de: "+size);
    }

    public void ingresarAlumno() throws IOException {
        //Atributos Locales
        String ID;
        int carnet = 0;
        String DPI;
        String name;
        String lastName;
        String email;
        int cel;

        if(contador < size){

        System.out.println("");
        System.out.println("******REGISTRO******");
        System.out.println("");

        System.out.println("ID: ");
        ID = ScannerText.dato();

        Random aleatorio = new Random();
        carnet = aleatorio.nextInt( 515552);
        System.out.println("Carnet: 0909-" + carnet);

        System.out.println("DPI: ");
        DPI = ScannerText.dato();

        System.out.println("Nombre: ");
        name = ScannerText.dato();

        System.out.println("Apellido: ");
        lastName = ScannerText.dato();

        System.out.println("Email: ");
        email = ScannerText.dato();

        System.out.println("No. Celular: ");
        cel = ScannerText.datosInt();

        //Ahora lo agregamos a nuesta lista:
            alumnos[contador] = new Alumnos(ID,carnet,DPI,name,lastName,email,cel);
            contador++;
            System.out.println("El alumno fue agregado Exitosamente.");
        }else {
            System.out.println("Mi bro no hay espacios.");
        }

    }


    //Agregamos al Alumno.
    public static void editarAlumno() throws IOException {
        String ID;
        int posicion = -1;
        int opcion2 = 0;

        System.out.println("Ingrese el ID: ");
        ID = ScannerText.dato();

        posicion = buscarAlumno(ID);

        if (posicion >= 0) {

            System.out.println("Datos: " + alumnos[posicion].toString());

            //creamos otro menú para Modificar o Eliminar.
            System.out.println("\n\n");
            System.out.println("1) Modificar Datos.");
            System.out.println("2) Eliminar Datos.");
            System.out.println("Ingrese su Opción: ");
            opcion2 = ScannerText.datosInt();

            switch (opcion2) {
                case 1:
                    modificarAlumno(posicion);
                    break;
                case 2:
                    eliminarAlumno(posicion);
                    break;
                default:
                    System.out.println("Opcion no valida...");
            }
        }else{
            System.out.println("El ID no existe.");
        }

    }


    //Buscamos al Alumno.
    public static int buscarAlumno(String ID) throws IOException {
        int posicion = -1;

        for(int i = 0;i < contador; i++){
            if(alumnos[i].getID().equals(ID)){
                System.out.println("Registro Encontrado");
                posicion = i;
            }
        }

        return posicion;
    }


    //Moficamos al Alumno.
    public static void modificarAlumno(int posicion) throws IOException {
        //Atributos Locales
        String DPI;
        String name;
        String lastName;
        String email;
        int cel;
        int opcion3 = 0;
        int continuar = 0;


        while(continuar != 2){
            System.out.println("******MENU******");
            System.out.println("****************");
            System.out.println("1). Modificar DPI.");
            System.out.println("2). Modificar Nombre.");
            System.out.println("3). Modificar Apellido.");
            System.out.println("4). Modificar Email.");
            System.out.println("5). Modificar No. Celular.");
            System.out.println("Ingrese su Opción: ");
            opcion3 = ScannerText.datosInt();

            //Manejo de datos

            switch (opcion3) {
                case 1:
                    System.out.println("Ingrese el DPI: ");
                    DPI = ScannerText.dato();
                    alumnos[posicion].setDPI(DPI);
                    break;
                case 2:
                    System.out.println("Ingrese el Nombre: ");
                    name = ScannerText.dato();
                    alumnos[posicion].setName(name);
                    break;
                case 3:
                    System.out.println("Ingrese el Apellido: ");
                    lastName = ScannerText.dato();
                    alumnos[posicion].setName(lastName);
                    break;
                case 4:
                    System.out.println("Ingrese el Email: ");
                    email = ScannerText.dato();
                    alumnos[posicion].setEmail(email);
                    break;
                case 5:
                    System.out.println("Ingrese el No. Celular: ");
                    cel = ScannerText.datosInt();
                    alumnos[posicion].setCel(cel);
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
            System.out.println("1) ¿Desea seguir Modificando?");
            System.out.println("2) Salir.");
            System.out.println("Ingrese su Opción: ");
            continuar = ScannerText.datosInt();

        }


    }


    //Eliminar al Alumno.
    public static void eliminarAlumno(int posicion) throws IOException{
        for(int i = posicion; i < contador; i++){
            alumnos[i] = alumnos[i+1];
        }
        System.out.println("Registro de Alumno Eliminado: ");
        contador--;
    }


    public static void MostrarAlumno() throws IOException {
        for(int i = 0; i < contador; i++){
            System.out.println("\n\n\nRegistro de Alumno: \n");
            System.out.println(alumnos[i].toString());
        }
    }



}


 /*
    a,b,c,d,e
    a,b,c,d,e
    a,b,c,d,e
    a,b,c,d,e
    a,b,c,d,e

    */
