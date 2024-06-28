package org.biblioteca.modelos;

public abstract class Persona {
    private Long id;
    private String nombre;
    private String correo;
    private String clave;

    public Persona() {}

    public Persona(Long id, String nombre, String correo, String clave) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo != null && correo.contains("@")) {
            this.correo = correo;
        } else {
            throw new IllegalArgumentException("El correo no es válido");
        }
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        if (clave != null && clave.length() >= 6) {
            this.clave = clave;
        } else {
            throw new IllegalArgumentException("La clave debe tener al menos 6 caracteres");
        }
    }

    public abstract void mostrarInformacion();
}