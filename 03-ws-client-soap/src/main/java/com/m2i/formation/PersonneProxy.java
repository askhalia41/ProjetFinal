package com.m2i.formation;

public class PersonneProxy implements com.m2i.formation.Personne {
  private String _endpoint = null;
  private com.m2i.formation.Personne personne = null;
  
  public PersonneProxy() {
    _initPersonneProxy();
  }
  
  public PersonneProxy(String endpoint) {
    _endpoint = endpoint;
    _initPersonneProxy();
  }
  
  private void _initPersonneProxy() {
    try {
      personne = (new com.m2i.formation.PersonneServiceLocator()).getPersonne();
      if (personne != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)personne)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)personne)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (personne != null)
      ((javax.xml.rpc.Stub)personne)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.m2i.formation.Personne getPersonne() {
    if (personne == null)
      _initPersonneProxy();
    return personne;
  }
  
  public double poidsIdealH(java.lang.String who, double taille) throws java.rmi.RemoteException{
    if (personne == null)
      _initPersonneProxy();
    return personne.poidsIdealH(who, taille);
  }
  
  public double poidsIdealF(java.lang.String who, double taille) throws java.rmi.RemoteException{
    if (personne == null)
      _initPersonneProxy();
    return personne.poidsIdealF(who, taille);
  }
  
  
}