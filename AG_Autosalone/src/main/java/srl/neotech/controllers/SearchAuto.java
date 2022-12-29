package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SearchAuto {
	
	  //Rotta per la home
    @GetMapping(value="/searchAuto")
    public String search() {
        return "searchAuto";
    }

}
