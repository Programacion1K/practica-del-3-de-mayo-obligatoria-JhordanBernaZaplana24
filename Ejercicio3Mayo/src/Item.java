import java.util.Objects;

public class Item {
    private String nombreItem;
    private String dato;

    Item(String nombreDelItem,String dato){
        this.nombreItem=nombreItem;
        this.dato=dato;
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public void setNombreItem(String nombreItem) {
        this.nombreItem = nombreItem;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(nombreItem, item.nombreItem) &&
                Objects.equals(dato, item.dato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreItem, dato);
    }

    @Override
    public String toString() {
        return "Item{" +
                "nombreItem='" + nombreItem + '\'' +
                ", dato='" + dato + '\'' +
                '}';
    }
    public String info(){
        return nombreItem+": "+dato;
    }
}
