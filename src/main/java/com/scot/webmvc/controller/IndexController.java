package com.scot.webmvc.controller;

import com.oracle.ozark.core.Models;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Controller
@Path("hello")
public class IndexController {

    @Inject
    Models models;

    @GET
    public String sayHello(@QueryParam("name") String name) {
        this.models.put("text", "Hello " + name);
        return "/WEB-INF/jsp/hello.jsp";
    }

}