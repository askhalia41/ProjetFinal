/**
 * PersonneService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.m2i.formation;

public interface PersonneService extends javax.xml.rpc.Service {
    public java.lang.String getPersonneAddress();

    public com.m2i.formation.Personne getPersonne() throws javax.xml.rpc.ServiceException;

    public com.m2i.formation.Personne getPersonne(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
