package Service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerUnoInterface extends Remote {

	public boolean connect() throws RemoteException;
}
