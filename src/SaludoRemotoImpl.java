import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SaludoRemotoImpl extends UnicastRemoteObject implements SaludoRemoto {
    protected SaludoRemotoImpl() throws RemoteException {
        super();
    }

    @Override
    public String saludar(String nombre) throws RemoteException {
        return "¡Hola, " + nombre + "desde el servidor remoto!";
    }
}
