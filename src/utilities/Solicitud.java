package utilities;

public class Solicitud {
    
    private String id;
    private String titulo;
    private String estado;

    public Solicitud(String id, String titulo, String estado) {
        this.id = id;
        this.titulo = titulo;
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEstado() {
        return estado;
    }
    
}
