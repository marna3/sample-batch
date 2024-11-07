package com.example;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
// import sample.sharedlib.SampleMessage;

public class HelloWorld implements HttpFunction {
    @Override
    public void service(HttpRequest request, HttpResponse response) throws Exception {
        // SampleMessage message = new SampleMessage("Test Message");
        // response.getWriter().write("Hello, World!" + message.getMessage());
        response.getWriter().write("Hello, World!");
    }
}