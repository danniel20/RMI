package com.teste;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ServiceInterface extends Remote{
	
	String sayHello(String name) throws RemoteException;
	void addPerson(Person person) throws RemoteException;
	List<Person> listPersons() throws RemoteException;
}
