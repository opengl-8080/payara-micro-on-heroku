package sample.heroku.webapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloResource {
    
    @GET
    public String hello() {
        return "<h1>Hello Payara Micro on Heroku!!</h1>";
    }
}
