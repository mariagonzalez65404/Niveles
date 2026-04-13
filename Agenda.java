import java.util.ArrayList;

class Contacto {
    private String nombre;
    private String telefono;
    private String correo;

    public Contacto(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
    public String getCorreo() { return correo; }
}

class Agenda {
    private ArrayList<Contacto> contactos;

    public Agenda() {
        contactos = new ArrayList<>();
    }

    public void agregarContacto(Contacto c) {
        contactos.add(c);
    }

    public void eliminarContacto(String nombre) {
        contactos.removeIf(c -> c.getNombre().equalsIgnoreCase(nombre));
    }

    public Contacto buscarContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }

    public void listarContactos() {
        for (Contacto c : contactos) {
            System.out.println(c.getNombre() + " - " + c.getTelefono() + " - " + c.getCorreo());
        }
    }
}
