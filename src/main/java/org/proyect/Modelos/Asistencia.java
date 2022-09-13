package org.proyect.Modelos;
import java.util.Date;

public class Asistencia implements Atributo{
    private int id;
    private String empleado;
    private Date fecha;
    private String hora;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public Object ObtenerAtributo(String atributo) {
        if (atributo.equals("id")) return getId();
        if (atributo.equals("empleado")) return getEmpleado();
        if (atributo.equals("fecha")) return getFecha();
        return null;
    }
}
