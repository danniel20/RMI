package com.teste;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ServiceImpl extends UnicastRemoteObject implements ServiceInterface{

	private static final long serialVersionUID = -2226221178343917532L;
	
	private List<Person> persons = new ArrayList<Person>();
	
	public ServiceImpl() throws RemoteException{}

	@Override
	public String sayHello(String name) throws RemoteException {
		return "Olá " + name;
	}

	@Override
	public void addPerson(Person person) throws RemoteException {
		persons.add(person);	
	}

	@Override
	public List<Person> listPersons() throws RemoteException {
		return persons;
	}
	
}
