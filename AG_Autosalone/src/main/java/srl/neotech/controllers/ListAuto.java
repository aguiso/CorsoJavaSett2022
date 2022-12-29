package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListAuto {
	
	  //Rotta per la home
    @GetMapping(value="/listAuto")
    public String list() {
        return "listAuto";
    }

}
