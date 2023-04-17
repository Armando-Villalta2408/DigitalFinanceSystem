import java.util.ArrayList;

/**
 * This class defines the objects that contain a Persona
 * @authors Harold, Daniel, Armando
 */
public class Persona {
    // Class fields
    private int ID;
    private String Nombre;
    private String Apellido;
    private int Edad;
    private String Trabajo;
    private String Genero;
    private String GradoEscolaridad;
    public ArrayList<Ingreso> Ingresos = new ArrayList();
    public ArrayList<Egreso> Egresos = new ArrayList();
    
    /**
     * Constructor for the Persona class
     * @param ID
     * @param Nombre
     * @param Apellido
     * @param Edad
     * @param Trabajo
     * @param Genero
     * @param GradoEscolaridad 
     */
    public Persona(int ID, String Nombre, String Apellido, int Edad, String Trabajo, String Genero, String GradoEscolaridad) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Trabajo = Trabajo;
        this.Genero = Genero;
        this.GradoEscolaridad = GradoEscolaridad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getTrabajo() {
        return Trabajo;
    }

    public void setTrabajo(String Trabajo) {
        this.Trabajo = Trabajo;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getGradoEscolaridad() {
        return GradoEscolaridad;
    }

    public void setGradoEscolaridad(String GradoEscolaridad) {
        this.GradoEscolaridad = GradoEscolaridad;
    }

    /**
     * Method for calculating total Ingreso for Persona
     *
     * @return A variable with total of Ingreso
     */
    public Double calcularIngresoTotal() {
        int cont = 0;
        double MontoT = 0;
        while (cont < Ingresos.size()) {
            MontoT = MontoT + Ingresos.get(cont).getMonto();
            cont = cont + 1;
        }
        return MontoT;
    }
    /**
     * Method for calculating total Egreso for Persona
     *
     * @return A variable with total of Egreso
     */
    public Double calcularEgresoTotal() {
        int cont = 0;
        double MontoT = 0;
        while (cont < Egresos.size()) {
            MontoT = MontoT + Egresos.get(cont).getMonto();
            cont = cont + 1;
        }
        return MontoT;
    }
    /**
     * Method for calculating total save up for Familia 
     * @return A variable with total of save up
     */
    public Double calcularAhorroTotal() {
        double auxI = calcularIngresoTotal();
        double auxE = calcularEgresoTotal();
        double ahorro = auxI - auxE;
        if (ahorro < 0) {
            return 0.0;
        } else {
            return ahorro;
        }
    }
    
    /**
     * Method to add a Ingreso to the Persona
     * @param Ingreso
     */
    public void addIngreso(Ingreso Ingreso) {
        this.Ingresos.add(Ingreso);
    }
    
    /**
     * Method to add a Egreso to the Persona
     * @param Egreso
     */
    public void addEgreso(Egreso Egreso) {
        this.Egresos.add(Egreso);
    }
    
    /**
     * Method of obtaining a specific Ingreso
     * @param idI
     * @return An Ingreso
     */
    public Ingreso getIngreso(int idI) {
        int cont = 0;
        while(cont < Ingresos.size()){
            if (Ingresos.get(cont).getID() == idI){
                return Ingresos.get(cont);
            }
            cont = cont + 1;
        }
        return null;
    }
    /**
     * Method of obtaining a specific Egreso
     * @param idE
     * @return An Egreso
     */
    public Egreso getEgreso(int idE) {
        int cont = 0;
        while(cont < Egresos.size()){
            if (Egresos.get(cont).getID() == idE){
                return Egresos.get(cont);
            }
            cont = cont + 1;
        }
        return null;
    }
    
}
