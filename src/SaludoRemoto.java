import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SaludoRemoto extends Remote {
    String saludar(String nombre) throws RemoteException;
}
