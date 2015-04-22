package p2p;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Vector;

public class ServerIImpl extends UnicastRemoteObject implements ServerI{
	
	String SYSTEM_PASSWORD = "distsys";
	
	Vector<ClientI> connectedClients;
	Vector<GlobalFileInfo> files;
	
	
	public ServerIImpl() throws RemoteException
	{
		files = new Vector<GlobalFileInfo>();
		connectedClients = new Vector<ClientI>();
	}

	public boolean login(String username, String passwd, ClientI client)
			throws RemoteException {
		
		if (passwd.equals(SYSTEM_PASSWORD)) {
			
			connectedClients.add(client); //check if users is already logged on is ignored here!
			
			System.out.println(username + " connected");
			
			
			/*TODO: create GlobalFileInfo objects from the LocalFileInfo objects
			        and store them in the files vector!
			*/
			
			return true;
		} else {
			System.out.println(username + " entered wrong password!");
			return false;
		}
	}

	@Override
	public GlobalFileInfo[] query(String keyword) throws RemoteException{
		return new GlobalFileInfo[0];
	}

	@Override
	public void logout(ClientI client) throws RemoteException{

	}


	//TODO: implement the logout() method here!


	//TODO: implement the query() method here!


}
