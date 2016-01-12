/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author DTT
 */
@Path("generic")
public class Map {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Map
     */
    public Map() {
    }

    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }
    
    @GET
    @Produces({"application/xml", "application/json"})
    public String get(@PathParam("origin") String origin, @PathParam("destination") String destination) {
        return GoogleMap.getDistance(origin, destination);
    }
}
