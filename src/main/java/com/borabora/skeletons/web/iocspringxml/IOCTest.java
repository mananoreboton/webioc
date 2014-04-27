package com.borabora.skeletons.web.iocspringxml;

/**
 * User: MRBUENO
 * Date: 08/01/14
 * Time: 01:46 PM
 */
public class IOCTest {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void inicio() {
        System.out.println(this.getClass().getCanonicalName());
    }
}
