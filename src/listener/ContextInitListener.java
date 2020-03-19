package listener;


import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextInitListener implements ServletContextListener {

    public ContextInitListener() {
        System.out.println("난 서버 시작할때 호출됨~");
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	ServletContext sc = sce.getServletContext();
    	String contextConfigLocation = sc.getInitParameter("contextConfigLocation");
    	System.out.println(contextConfigLocation);
    	sc.setAttribute("name", "홍길동");
    	System.out.println("생성자 호출뒤 호출됨~");
    }
	
}
