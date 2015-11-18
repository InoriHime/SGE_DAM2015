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
 * @author nonek
 */
public class Conexion {
    
    Session s;
    
    public Conexion()
    {
        s=NewHibernateUtil.getSessionFactory().openSession();
    }
    
    public Session openSession()
    {
        s=NewHibernateUtil.getSessionFactory().openSession();
        return s;
    }
    
    public Session getCurrentSession()
    {
        s=NewHibernateUtil.getSessionFactory().getCurrentSession();
        return s;
    }
    
    public Session getSession()
    {
        return s;
    }
    
    public void clearSession()
    {
        s.clear();
    }
    
    public void closeSession()
    {
        s.close();
    }
    
}
