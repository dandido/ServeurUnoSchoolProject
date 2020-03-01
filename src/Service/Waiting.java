package Service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import javafx.scene.text.Text;

public interface Waiting extends Remote {

	// tt les methode throw RemoteException
	public void changeValue(String string)throws RemoteException;
}