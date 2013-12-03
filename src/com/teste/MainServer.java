package com.teste;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MainServer {
	
	public static void main(String[] args) {
		
		try {
			
			ServiceInterface obj = new ServiceImpl();
			Registry registry = LocateRegistry.createRegistry(1099);
			registry.bind("HelloService", obj);
			
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			e.printStackTrace();
		}
	}

}
