package com.example.demo;

import org.apache.catalina.Context;
import org.apache.catalina.Host;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.core.StandardHost;
import org.apache.catalina.startup.Tomcat;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class Main {

    @Configuration
    public static class MyAppConfig{
        @Bean
        public TomcatLauncher tomcatLauncher(){
            return new TomcatLauncher();
        }
    }
    public static void main(String[] args) throws LifecycleException {
        System.out.println("Hello me");

        AnnotationConfigApplicationContext()
        /*//http://localhost:8081/context/
        Tomcat tomcat = new Tomcat();
        Host host = new StandardHost();
        host.setName("ac");
        tomcat.setHost(host);
        tomcat.setPort(8081);
        tomcat.start();
        //entry pint
        Context context = tomcat.addContext("",null); //dispatcher servlet
        tomcat.addServlet(context,"helloServlet", new HelloServlet());
        context.addServletMappingDecoded("/","helloServlet");
*/

    }
}
