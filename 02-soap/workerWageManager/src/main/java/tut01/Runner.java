package tut01;
import javax.xml.ws.Endpoint;

public class Runner {
    public static void main(String[] args)
       {
        Endpoint.publish("http://127.0.0.1:8000/WorkerWageManager", new WorkerWageManagerImpl());  
       }
}
