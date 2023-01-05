package srl.neotech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import srl.neotech.model.Autosalone;

@Controller
public class ControllerAutosalone {
	
	@Autowired
	Autosalone autoSalone;
	
	   @GetMapping(value="/listAuto")
	    public String list(ModelMap modelMap) {
		   modelMap.addAttribute("listAuto", autoSalone.getAutomobili());
	    return "listAuto";
	    }
	   
	    @GetMapping(value="/addAuto")
	    public String add() {
	        return "addAuto";
	    }
	    
	    @GetMapping(value="/deleteAuto")
	    public String delete() {
	        return "deleteAuto";
	    }

	    @GetMapping(value="/searchAuto")
	    public String search() {
	        return "searchAuto";
	    }
	    
	    @GetMapping(value="/detailAuto")
	    public String detail() {
	        return "detailAuto";
	    }

}
