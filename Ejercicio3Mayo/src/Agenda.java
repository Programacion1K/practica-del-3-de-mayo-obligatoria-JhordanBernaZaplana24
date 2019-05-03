import java.util.*;

public class Agenda{
    private final String nombre;
    Map<Contacto, List<Item>> listaContactos;

    public Agenda(String nombre) {
        this.nombre = nombre;
        listaContactos=new HashMap<>();
    }
    public void anyadeContacto(Contacto c){
        if (!listaContactos.containsKey(c)){
            listaContactos.put(c, new ArrayList<>());
        }
    }

    public void anyadeItem(Contacto c, Item dato){
        anyadeContacto(c);
        List<Item> item=listaContactos.get(c);
        item.add(dato);
    }
    public void anyadeItem(Contacto c, List<Item> dato){
        anyadeContacto(c);
        List<Item> item=listaContactos.get(c);
        item.add((Item) dato);
    }
    public List<Item> listaItems(Contacto c){
        return listaContactos.get(c);
    }
    public String mostrarListaContactos(){
        String salida="";
        for (Contacto c:listaContactos.keySet()) {
            salida+=c.info()+": ";
            for(Item i:listaItems(c)){
                salida+=i.info()+", ";
            }
            salida+="\n";
        }
        return salida;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agenda agenda = (Agenda) o;
        return Objects.equals(nombre, agenda.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public Map<Contacto, List<Item>> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(Map<Contacto, List<Item>> listaContactos) {
        this.listaContactos = listaContactos;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "nombre='" + nombre + '\'' +
                ", listaContactos=" + listaContactos +
                '}';
    }
    public void anyadirItem(Contacto persona,Item dato){
        try {
            listaContactos.get(persona).add(dato);
        }catch (NullPointerException npe){
            throw new NullPointerException("No existe el contacto");
        }
    }
    public List<Contacto> listaInformacion(String i){
        Item itemDondeEstoy=new Item(i,"");
        List<Contacto> contactosEItem=new ArrayList<>();
        for (Contacto c:listaContactos.keySet()){
            if(listaContactos.get(c).contains(itemDondeEstoy)){
                contactosEItem.add(c);
            }
        }
        return contactosEItem;
    }
}

