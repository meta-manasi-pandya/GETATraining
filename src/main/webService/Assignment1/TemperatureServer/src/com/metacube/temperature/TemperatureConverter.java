package com.metacube.temperature;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class TemperatureConverter {
	@WebMethod
	public double changeFahrenheitToCelsius(double fahrenheit) {
		double celsius = ((fahrenheit - 32)*5)/9;
		return celsius;
	}
}
