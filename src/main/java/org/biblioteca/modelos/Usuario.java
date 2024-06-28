package org.biblioteca.modelos;

public class Usuario extends Persona {
    private String docIdentidad;
    private String telefono;
    private String facultad;
    private String codigoUnico;

    public Usuario() {
        super(); 
    }

    public Usuario(Long id, String nombre, String correo, String clave,
                   String docIdentidad, String telefono, String facultad, String codigoUnico) {
        super(id, nombre, correo, clave); 
        this.docIdentidad = docIdentidad;
        this.telefono = telefono;
        this.facultad = facultad;
        this.codigoUnico = codigoUnico;
    }

    public String getDocIdentidad() {
        return docIdentidad;
    }

    public void setDocIdentidad(String docIdentidad) {
        this.docIdentidad = docIdentidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public void solicitarPrestamo(String libro) {
        System.out.println("Solicitando préstamo del libro: " + libro);
    }

    public Boolean consultarListaEspera() {
        System.out.println("Consultando lista de espera...");
        return true; 
    }

    public Boolean pagarMulta(Float valor) {
        System.out.println("Pagando multa de: $" + valor);
        return true; 
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Documento de Identidad: " + docIdentidad);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Facultad: " + facultad);
        System.out.println("Código Único: " + codigoUnico);
    }
}
