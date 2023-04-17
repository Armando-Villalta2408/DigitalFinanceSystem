/**
 * This class defines the objects that contain a Ingreso
 * @authors Harold, Daniel, Armando
 */
public class Ingreso {
    // Class fields
    private int ID;
    private Double Monto;
    private String Descripcion;
    private String Comentario;
    private String Mes;
    private String Semana;
    
    /**
     * Constructor for the Ingreso class
     * @param Monto
     * @param Descripcion
     * @param Comentario
     * @param Mes
     * @param Semana 
     */
    public Ingreso(Double Monto, String Descripcion, String Comentario, String Mes, String Semana) {
        this.Monto = Monto;
        this.Descripcion = Descripcion;
        this.Comentario = Comentario;
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

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
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
