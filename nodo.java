class nodo {
    int dato; 
    nodo siguiente;

    public nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

class ListaEnlazada {
    private nodo cabeza;

    // Inicialización o creación
    public ListaEnlazada() {
        this.cabeza = null;
    }

    // Insertar elementos en la lista
    public void insertar(int dato) {
        nodo nuevoNodo = new nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    // Eliminar elementos de la lista
    public void eliminar(int dato) {
        if (cabeza == null) return;

        if (cabeza.dato == dato) {
            cabeza = cabeza.siguiente;
            return;
        }

        nodo temp = cabeza;
        while (temp.siguiente != null && temp.siguiente.dato != dato) {
            temp = temp.siguiente;
        }

        if (temp.siguiente != null) {
            temp.siguiente = temp.siguiente.siguiente;
        }
    }

    // Buscar elementos de la lista
    public boolean buscar(int dato) {
        nodo temp = cabeza;
        while (temp != null) {
            if (temp.dato == dato) {
                return true;
            }
            temp = temp.siguiente;
        }
        return false;
    }

    // Recorrer la lista enlazada
    public void recorrer() {
        nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.dato + " ");
            temp = temp.siguiente;
        }
        System.out.println();
    }

    // Comprobar si la lista está vacía
    public boolean estaVacia() {
        return cabeza == null;
    }
}