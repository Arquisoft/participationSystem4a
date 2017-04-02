package hello.controllers;

import hello.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created by pelay on 02/04/2017.
 */
@Controller
@Scope("session")
public class AdminController {


    private SystemServices systemService;

    @Autowired
    public void setSystemService(SystemServices systemService) {
        this.systemService = systemService;
    }
}



