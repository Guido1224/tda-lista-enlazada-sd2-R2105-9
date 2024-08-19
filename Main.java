public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        // Insertar elementos
        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        System.out.println("Elementos en la lista después de insertar:");
        lista.recorrer(); // Debería mostrar: 10 20 30 

        // Buscar un elemento
        int buscar = 20;
        System.out.println("¿El elemento " + buscar + " está en la lista? " + lista.buscar(buscar));

        // Eliminar un elemento
        lista.eliminar(20);
        System.out.println("Elementos en la lista después de eliminar 20:");
        lista.recorrer(); // Debería mostrar: 10 30 

        // Comprobar si la lista está vacía
        System.out.println("¿La lista está vacía? " + lista.estaVacia());

        // Eliminar todos los elementos
        lista.eliminar(10);
        lista.eliminar(30);
        System.out.println("Elementos en la lista después de eliminar todos:");
        lista.recorrer(); // Debería no mostrar nada
        System.out.println("¿La lista está vacía? " + lista.estaVacia());
    }
}