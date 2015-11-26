/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Hibernate.NewHibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Noneking, Inno, MrDrulix
 */
public class Conexion {
    
    Session s;
    
    //Creamos la conexion
    public Conexion()
    {
        s=NewHibernateUtil.getSessionFactory().openSession();
    }
    
    //Creamos la conexion y nos la devuelve
    public Session openSession()
    {
        s=NewHibernateUtil.getSessionFactory().openSession();
        return s;
    }
    
    //Nos devuelve el objeto que contiene la session actual
    public Session getCurrentSession()
    {
        s=NewHibernateUtil.getSessionFactory().getCurrentSession();
        return s;
    }
    
    //Obtiene el objeto con la conexion
    public Session getSession()
    {
        return s;
    }
    
    //Limpia la conexion
    public void clearSession()
    {
        s.clear();
    }
    
    //Cierra la conexion
    public void closeSession()
    {
        s.close();
    }
    
}
