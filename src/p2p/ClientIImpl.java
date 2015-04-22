package p2p;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ClientIImpl extends UnicastRemoteObject implements ClientI {

	String filepath;
	String username;
	
	public ClientIImpl(String filepath, String username) throws RemoteException {
		super();
		this.filepath = filepath;
		this.username = username;
	}

	
	//TODO: implement the getFile(String abspath) method here
	
	

	public LocalFileInfo[] getFileList() throws RemoteException {
	
		//TODO: return the list of shared files 
		//      as an array of LocalFileInfo objects
		return null;
		
	}

	public String getUsername() throws RemoteException {
		return username;
	}

	@Override
	public RemoteFISI getFile(String abspath) {
		return null;
	}


	public String getFilepath() {
		return filepath;
	}
}
