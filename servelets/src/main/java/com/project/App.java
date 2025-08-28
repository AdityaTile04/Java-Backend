package com.project;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App
{
    public static void main( String[] args ) throws LifecycleException {

        Tomcat tomcat = new Tomcat();
        tomcat.setPort( 8080 );

        Context context = tomcat.addContext( "", null );
        Tomcat.addServlet( context, "MainServlet", new MainServlet() );
        context.addServletMappingDecoded( "/demo", "MainServlet" );

        tomcat.start();;
        tomcat.getServer().await();

    }
}
