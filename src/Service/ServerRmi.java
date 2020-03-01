package Service;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.RemoteServer;

public class ServerRmi {

	public static void main(String[] args) {
				try {
				LocateRegistry.createRegistry(1099);
				ServerUnoInterfaceImplemtation ob= new ServerUnoInterfaceImplemtation();
				System.out.println(ob.toString());
				Naming.rebind("rmi://localhost:1099/Uno", ob);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}

