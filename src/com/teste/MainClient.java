package com.teste;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

public class MainClient {
	
	public static void main(String[] args) {
		
		try {
			Registry registry = LocateRegistry.getRegistry("localhost");
			ServiceInterface stub = (ServiceInterface) registry.lookup("HelloService");
			
			String response = stub.sayHello("Danniel");
			System.out.println("Response: " + response);
			
			Person p = new Person();
			p.setNome("Francisco José");
			p.setIdade(29);
			
			stub.addPerson(p);
			
			List<Person> lista = stub.listPersons();
			for (Person person : lista) {
				System.out.println(person);
			}
			
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
}
