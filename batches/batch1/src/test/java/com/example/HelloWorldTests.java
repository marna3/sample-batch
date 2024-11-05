package com.example;

import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTests {
    
    @Test
    public void testHelloWorld() throws IOException {
        // Mock HttpRequest and HttpResponse
        HttpRequest request = Mockito.mock(HttpRequest.class);
        HttpResponse response = Mockito.mock(HttpResponse.class);

        // Mock response writer
        StringWriter responseWriter = new StringWriter();
        BufferedWriter writer = new BufferedWriter(responseWriter);
        Mockito.when(response.getWriter()).thenReturn(writer);

        // Call the function
        try {
            new HelloWorld().service(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Verify the response
        writer.flush();
        assertEquals("Hello, World!", responseWriter.toString());
    }
}
