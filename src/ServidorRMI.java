import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServidorRMI {
    public static void main(String[] args) {
        try {
            SaludoRemoto saludoRemoto = new SaludoRemotoImpl();
            Registry registry = LocateRegistry.createRegistry(1099); // Puerto por defecto para RMI
            registry.rebind("SaludoRemoto", saludoRemoto);

            System.out.println("Servidor Remoto Iniciado");
        } catch (Exception e) {
            System.err.println("Error en el servidor RMI: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
