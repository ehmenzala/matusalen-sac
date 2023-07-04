package utilities;

public class Solicitud {
    
    private int id;
    private String titulo;
    private String estado;
    private String dni;

    public Solicitud(int id, String titulo, String estado, String dni) {
        this.id = id;
        this.titulo = titulo;
        this.estado = estado;
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEstado() {
        return estado;
    }
    
    public String getDNI() {
        return dni;
    }
}
