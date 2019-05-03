import java.util.Objects;

public class Contacto {
    private String nombre;
    private String numeroTelefono;

    public Contacto() {
        this.nombre= nombre;
        this.numeroTelefono= numeroTelefono;
    }
    public Contacto(String nombre, String numeroTelefono) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                '}';
    }
}
