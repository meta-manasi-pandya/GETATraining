package com.metacube.temperature;

public class TemperatureConverterProxy implements com.metacube.temperature.TemperatureConverter {
  private String _endpoint = null;
  private com.metacube.temperature.TemperatureConverter temperatureConverter = null;
  
  public TemperatureConverterProxy() {
    _initTemperatureConverterProxy();
  }
  
  public TemperatureConverterProxy(String endpoint) {
    _endpoint = endpoint;
    _initTemperatureConverterProxy();
  }
  
  private void _initTemperatureConverterProxy() {
    try {
      temperatureConverter = (new com.metacube.temperature.TemperatureConverterServiceLocator()).getTemperatureConverter();
      if (temperatureConverter != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)temperatureConverter)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)temperatureConverter)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (temperatureConverter != null)
      ((javax.xml.rpc.Stub)temperatureConverter)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.metacube.temperature.TemperatureConverter getTemperatureConverter() {
    if (temperatureConverter == null)
      _initTemperatureConverterProxy();
    return temperatureConverter;
  }
  
  public double changeFahrenheitToCelsius(double fahrenheit) throws java.rmi.RemoteException{
    if (temperatureConverter == null)
      _initTemperatureConverterProxy();
    return temperatureConverter.changeFahrenheitToCelsius(fahrenheit);
  }
  
  
}