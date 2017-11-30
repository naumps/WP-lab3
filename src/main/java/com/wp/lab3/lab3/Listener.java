package com.wp.lab3.lab3;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class Listener implements HttpSessionAttributeListener,HttpSessionListener, ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Povik do: "+sre.toString());
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Inicijalizacija na povik do servlet: "+ sre.toString());
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        System.out.println("Dodaden sesiski atribut: "+ se.getName());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        System.out.println("Izbrisan sesiski atribut:" + se.getName());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        System.out.println("Sesiski atribut zamenet so: "+se.getName());
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Kreirana e sesija:"+se.toString());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Sesijata e unistena:"+se.toString());
    }
}
