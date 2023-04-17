/**
 * This class defines the objects that contain a Egreso
 * @authors Harold, Daniel, Armando
 */
public class Egreso {
     // Class fields
    private int ID;
    private Double Monto;
    private String Descripcion;
    private String Clasificacion;
    private String Mes;
    private String Semana;
    
    /**
     * Constructor for the Egreso class
     * @param Monto
     * @param Descripcion
     * @param Clasificacion
     * @param Mes
     * @param Semana 
     */
    public Egreso(Double Monto, String Descripcion, String Clasificacion, String Mes, String Semana) {
        this.Monto = Monto;
        this.Descripcion = Descripcion;
        this.Clasificacion = Clasificacion;
        this.Mes = Mes;
        this.Semana = Semana;
    }

    public int getID() {
        return ID;
    }

    public void setID(int id) {
        this.ID = id;
    }

    public Double getMonto() {
        return Monto;
    }

    public void setMonto(Double Monto) {
        this.Monto = Monto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public String getSemana() {
        return Semana;
    }

    public void setSemana(String Semana) {
        this.Semana = Semana;
    }

}
