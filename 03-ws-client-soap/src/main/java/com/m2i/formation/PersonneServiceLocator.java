/**
 * PersonneServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.m2i.formation;

public class PersonneServiceLocator extends org.apache.axis.client.Service implements com.m2i.formation.PersonneService {

    public PersonneServiceLocator() {
    }


    public PersonneServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PersonneServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Personne
    private java.lang.String Personne_address = "http://10.150.1.30:8080/1-ws-soap/services/Personne";

    public java.lang.String getPersonneAddress() {
        return Personne_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PersonneWSDDServiceName = "Personne";

    public java.lang.String getPersonneWSDDServiceName() {
        return PersonneWSDDServiceName;
    }

    public void setPersonneWSDDServiceName(java.lang.String name) {
        PersonneWSDDServiceName = name;
    }

    public com.m2i.formation.Personne getPersonne() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Personne_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPersonne(endpoint);
    }

    public com.m2i.formation.Personne getPersonne(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.m2i.formation.PersonneSoapBindingStub _stub = new com.m2i.formation.PersonneSoapBindingStub(portAddress, this);
            _stub.setPortName(getPersonneWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPersonneEndpointAddress(java.lang.String address) {
        Personne_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.m2i.formation.Personne.class.isAssignableFrom(serviceEndpointInterface)) {
                com.m2i.formation.PersonneSoapBindingStub _stub = new com.m2i.formation.PersonneSoapBindingStub(new java.net.URL(Personne_address), this);
                _stub.setPortName(getPersonneWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Personne".equals(inputPortName)) {
            return getPersonne();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://formation.m2i.com", "PersonneService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://formation.m2i.com", "Personne"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Personne".equals(portName)) {
            setPersonneEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
