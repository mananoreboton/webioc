package com.borabora.skeletons.web.iocspringxml;

import com.borabora.skeletons.web.iocspringxml.IOCTest;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * User: MRBUENO
 * Date: 08/01/14
 * Time: 01:50 PM
 */
public class IOCTestHandler implements HttpRequestHandler {
    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println(iocTest.getName());
    }



    private IOCTest iocTest;

    public IOCTest getIocTest() {
        return iocTest;
    }

    public void setIocTest(IOCTest iocTest) {
        this.iocTest = iocTest;
    }

    public void inicio() {
        System.out.println(this.getClass().getCanonicalName());
    }

}
