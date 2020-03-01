package Service;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class ServerUnoInterfaceImplemtation extends UnicastRemoteObject implements ServerUnoInterface {
	//change data
	protected ServerUnoInterfaceImplemtation() throws RemoteException {super();}
	Waiting stub;
	int playeNumber = 1;
	
	@Override
	public boolean connect() throws RemoteException
	{ 
		 try {
			  stub = (Waiting)Naming.lookup("rmi://localhost:1098/P1");
			} catch (MalformedURLException | RemoteException | NotBoundException e) {
				e.printStackTrace();}
		if (playeNumber < 4) {
			playeNumber++;		  
			stub.changeValue( "Wating for the player "+ playeNumber);
			System.out.print("Server : Wating for the player");

		 return true;
		}
		stub.changeValue( "Starting the game");
		System.out.print("Server : Starting the game");

		return false;
	}
	
}
