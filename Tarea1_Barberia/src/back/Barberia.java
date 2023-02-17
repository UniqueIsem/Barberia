package back;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class Barberia {
    Queue<Integer> colaClientes = new LinkedList();
    private int clientes;
    private int barberos;
    private String fila;

    public int getClientes() {
        return clientes;
    }

    public void setClientes(int clientes) {
        this.clientes = clientes;
    }

    public int getBarberos() {
        return barberos;
    }

    public void setBarberos(int barberos) {
        this.barberos = barberos;
    }
    
    public int maxBarberos(){
        if (barberos > 3 || barberos <= 0) {
            return 1;
        }
        return 0;
    }
    
    public int maxClientes(){
        if (clientes > 20 || clientes <= 0) {
            return 1;
        }
        return 0;
    }
    
    public void crearCola(){
        for (int i = 0 ; i < clientes ; i++) {
            colaClientes.offer(i +1);
        }
        clientes++;
    }
    
    public void agregarElemento(){
        colaClientes.offer(clientes++);
    }
    
    public void quitarElemento(){
        colaClientes.remove();
    }
    
    public int mostrarPrimeroEnFila(){
        if (colaClientes.peek() == null) {
            return 0;
        }
        return colaClientes.peek();
    }
    
    public int cantidadDeCronometros(){
        if (barberos == 1) {
            return 1;
        } else if (barberos == 2) {
            return 2;
        } else {
            return 3;
        }
    }
    
    public String mostrarFila(){
        String fila = "";
        fila += colaClientes;
        return fila;
    }
    
    public boolean colaVacia(){
        if (colaClientes.isEmpty()) {
            return true;
        }
        return false;
    }
    
}
