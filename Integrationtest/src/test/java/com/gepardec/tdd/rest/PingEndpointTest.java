package com.gepardec.tdd.rest;

import static org.junit.Assert.assertEquals;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

public class PingEndpointTest extends JerseyTest {
    @Override
    protected Application configure() {
        return new ResourceConfig(PingEndpoint.class);
    }

    @Test
    public void testPing() {
        Response response = target("ping").request().get();
    
        assertEquals("Http Response should be 200: ", Status.OK.getStatusCode(), response.getStatus());
        assertEquals("Http Content-Type should be: ", MediaType.TEXT_HTML, response.getHeaderString(HttpHeaders.CONTENT_TYPE));
    
        String content = response.readEntity(String.class);
        assertEquals("Content of ressponse is: ", "pong", content);
    }
}