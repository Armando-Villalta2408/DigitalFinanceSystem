/**
 * This class defines the objects that contain a Ubicacion
 * @authors Harold, Daniel, Armando
 */
public class Ubicacion {
    // Class fields
    private String Provincia;
    private String Canton;
    private String Distrito;
    private String DireccionExacta;
    
    /**
     * Constructor for the Ubicacion class
     * @param Provincia
     * @param Canton
     * @param Distrito
     * @param DireccionExacta 
     */
    public Ubicacion(String Provincia, String Canton, String Distrito, String DireccionExacta) {
        this.Provincia = Provincia;
        this.Canton = Canton;
        this.Distrito = Distrito;
        this.DireccionExacta = DireccionExacta;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public String getCanton() {
        return Canton;
    }

    public void setCanton(String Canton) {
        this.Canton = Canton;
    }

    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }

    public String getDireccionExacta() {
        return DireccionExacta;
    }

    public void setDireccionExacta(String DireccionExacta) {
        this.DireccionExacta = DireccionExacta;
    }

}
