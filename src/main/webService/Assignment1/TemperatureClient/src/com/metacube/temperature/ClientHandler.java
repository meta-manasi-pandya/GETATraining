package com.metacube.temperature;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class ClientHandler {
	public static void main(String [] args) throws RemoteException, ServiceException {
		TemperatureConverterServiceLocator serviceLocator = new TemperatureConverterServiceLocator();
		double celsius = serviceLocator.getTemperatureConverter().changeFahrenheitToCelsius(45);
		System.out.println(celsius);
	}
}
