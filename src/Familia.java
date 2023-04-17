
import java.util.ArrayList;

/**
 * This class defines the objects that contain a family
 * @authors Harold, Daniel, Armando
 */
public class Familia {
    
    // Class fields
    private String Apellido;
    private String ClasificasionSocial;
    private Ubicacion Ubicacion;
    public ArrayList<Persona> Personas = new ArrayList();
    
    /**
     * Constructor for the Familia class
     * @param Apellido 
     */
    public Familia(String Apellido) {
        this.Apellido = Apellido;
    }
    
    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
    public String getClasificasionSocial() {
        return ClasificasionSocial;
    }

    public void setClasificasionSocial(String ClasificasionSocial) {
        this.ClasificasionSocial = ClasificasionSocial;
    }
    
    public Ubicacion getUbicacion() {
        return Ubicacion;
    }
    
    public void setUbicacion(Ubicacion Ubi) {
        this.Ubicacion = Ubi;
    }
    
    /**
     * Method for calculating total Ingreso for Familia 
     * @return A variable with total of Ingreso
     */
    public Double calcularIngresoTotal() {
        int cont = 0;
        Double MontoT = 0.0;
        while (cont < Personas.size()) {
            MontoT = MontoT + Personas.get(cont).calcularIngresoTotal();
            cont = cont + 1;
        }
        return MontoT;
    }
    
    /**
     * Method for calculating total Egreso for Familia 
     * @return A variable with total of Egreso
     */
    public Double calcularEgresoTotal() {
        int cont = 0;
        Double MontoT = 0.0;
        while (cont < Personas.size()) {
            MontoT = MontoT + Personas.get(cont).calcularEgresoTotal();
            cont = cont + 1;
        }
        return MontoT;
    }
    
    /**
     * Method for calculating total save up for Familia 
     * @return A variable with total of save up
     */
    public Double calcularAhorroTotal() {
        Double auxI = calcularIngresoTotal();
        Double auxE = calcularEgresoTotal();
        Double ahorro = auxI - auxE;
        if (ahorro < 0) {
            return 0.0;
        } else {
            return ahorro;
        }
    }
    /**
     * Method to add a Persona to the Familia
     * @param persona 
     */
    public void addPersona(Persona persona) {
        this.Personas.add(persona);
    }
}
