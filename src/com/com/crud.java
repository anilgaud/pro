package com.com;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;



import com.pojo.Emp;
import com.model.b1;

@Path("/hello")
public class crud {
	Emp e=new Emp();
	b1 b=new b1();
	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
	
	
}
	@GET
	/*public Response get()
	{
		String s="hiii";
		return Response.status(200).entity(s).build();
	}*/
	@Produces({MediaType.APPLICATION_JSON})
public List<Emp> get1()
{
	List<Emp> emp=b.get();
   return emp;		
}
}
