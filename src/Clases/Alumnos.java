package Clases;

public class Alumnos {

    //Atributos
    private String ID;
    private int carnet;
    private String DPI;
    private String name;
    private String lastName;
    private String email;
    private int cel;


    //Constructores
    public Alumnos() {

    }

    public Alumnos(String ID, int carnet, String DPI, String name, String lastName, String email, int cel) {
        this.ID = ID;
        this.carnet = carnet;
        this.DPI = DPI;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.cel = cel;
    }


    //Set and Get

    public String getID() {
        return ID;
    }


    public void setDPI(String DPI) {
        this.DPI = DPI;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setCel(int cel) {
        this.cel = cel;
    }


    //Mostrar Datos
    @Override
    public String toString() {
        return "\nAlumno: " +
                "\nID: " + ID +
                "\nCarnet: 0909-" + carnet +
                "\nDPI: " + DPI +
                "\nNombre: " + name +
                "\nApellido: " + lastName +
                "\nEmail: " + email +
                "\nCel. " + cel;
    }
}
