package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DetailAuto {
	
	  //Rotta per la home
    @GetMapping(value="/detailAuto")
    public String detail() {
        return "detailAuto";
    }

}
