package service;

import javax.ws.rs.POST;  
import javax.ws.rs.Path;  
import javax.ws.rs.FormParam;  
import javax.ws.rs.core.Response;  
@Path("/product")  

public class HelloService {
    @POST  
    @Path("/add")  
    public Response addUser(  
    		@FormParam("name") String name,  
            @FormParam("grade") float grade) {  
       
            return Response.status(200)  
                .entity(" Grade added successfuly!<br>"+ "<br> Name: " + name +"<br> Grade: "+ grade)  
                .build();  
    }  
}
