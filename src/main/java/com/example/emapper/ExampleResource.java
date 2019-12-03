package com.example.emapper;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("emapper")
public class ExampleResource {
	
  @GET
  @Path("{anydata}")
  public Response test(@PathParam("anydata") @ValidToken String token) {
			return Response.ok().build(); 
  }
  
  
}
