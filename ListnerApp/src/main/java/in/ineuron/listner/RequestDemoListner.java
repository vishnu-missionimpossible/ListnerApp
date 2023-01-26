package in.ineuron.listner;

import java.util.Date;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class RequestDemoListner
 *
 */
@WebListener
public class RequestDemoListner implements ServletRequestListener {
     
	public static int count=0;
    
  
    public void requestDestroyed(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
    	System.out.println("Request Object got destroyed at: "+new Date());
    }
    public void requestInitialized(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
    	count++;
    	System.out.println("Request Object got created at: "+new Date());
    }
	
}
