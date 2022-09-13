package org.proyect.Modelos;

public class Departamento implements Atributo{
    private int id;
    private String nombre;
    private String descricion;
    private String area;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescricion() {
        return descricion;
    }

    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public Object ObtenerAtributo(String atributo) {
        if (atributo.equals("id")) return getId();
        if (atributo.equals("nombre")) return getNombre();
        if (atributo.equals("area")) return getArea();
        return null;
    }
}
