package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeleteAuto {
	
	  //Rotta per la home
    @GetMapping(value="/deleteAuto")
    public String delete() {
        return "deleteAuto";
    }

}
