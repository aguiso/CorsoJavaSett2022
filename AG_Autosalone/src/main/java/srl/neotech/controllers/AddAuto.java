package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddAuto {
	
	  //Rotta per la home
    @GetMapping(value="/addAuto")
    public String add() {
        return "addAuto";
    }

}
