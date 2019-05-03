import java.util.Objects;

public class Contacto implements Comparable<Contacto> {
    private final String nombre;
    private String numeroTelefono;

    public Contacto(String nombre, String numeroTelefono) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroTelefono() {
        return this.numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(nombre, contacto.nombre) &&
                Objects.equals(numeroTelefono, contacto.numeroTelefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numeroTelefono);
    }
    public String info(){
        return nombre;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                '}';
    }
    @Override
    public int compareTo(Contacto o) {
        return this.nombre.compareTo(o.nombre);
    }
}
