public class Entrada {
    private String nombre_del_evento;
    private double precio_entrada;

    public Entrada(String nombre_del_evento, Double precio_entrada){
        this.nombre_del_evento = nombre_del_evento;
        this.precio_entrada = precio_entrada;
    }

    public void mostrarInformacion(){
        System.out.println("Evento: " + nombre_del_evento + " | Precio: " + precio_entrada);
    }
}
