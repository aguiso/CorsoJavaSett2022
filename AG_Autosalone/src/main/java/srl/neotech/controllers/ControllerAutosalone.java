package srl.neotech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import srl.neotech.model.Automobile;
import srl.neotech.model.Autosalone;
import srl.neotech.model.EAlimentazione;
import srl.neotech.model.EColore;
import srl.neotech.model.ECostruttore;
import srl.neotech.requestresponse.CercaAutoRequest;
import srl.neotech.services.AutosaloneService;

@Controller
public class ControllerAutosalone {

	@Autowired
	Autosalone autoSalone;

	@Autowired
	AutosaloneService autosaloneService;

	   @GetMapping("/listAuto")
	    public String list(ModelMap modelMap) {
		   modelMap.addAttribute("listAuto", autoSalone.getAutomobili());
	    return "listAuto";
	    }

	    @GetMapping("/addAuto")
	    public String addAuto(ModelMap modelMap) {
	    	modelMap.addAttribute("automobili", autoSalone.getAutomobili());
	        return "addAuto";
	    }

	    @PostMapping(value="/add")
	    public String addAuto(@ModelAttribute("auto") Automobile auto) {
	    	autoSalone.getAutomobili().add(auto);
	    return "addAuto";
	    }

	    @GetMapping("/removeAuto")
	    public String remove(@RequestParam("id") String id, ModelMap modelMap) {
	    	autosaloneService.removeAuto(id);
	    	modelMap.addAttribute("listAuto", autoSalone.getAutomobili());
	        return "listAuto";
	    }

	    @GetMapping("/detailAuto")
		  public String detail(@RequestParam("id") String id, ModelMap modelMap) {
			  Automobile auto = autoSalone.getAutomobile(id);
			  modelMap.addAttribute("auto", auto);
		      modelMap.addAttribute("listaccessori", auto.getAccessori());
		  return "detailAuto";
		 }

	    @GetMapping("/searchAuto")
	    public String searchGet(@ModelAttribute("requestSearchAuto") CercaAutoRequest request, ModelMap modelMap) {
	    	modelMap.addAttribute("colore", EColore.values());
	    	modelMap.addAttribute("costruzione", ECostruttore.values());
	    	modelMap.addAttribute("alimentazione", EAlimentazione.values());
	        return "searchAuto";
	    }

	    @PostMapping("/searchAutoPost")
	    public String searchPost(@ModelAttribute("requestSearchAuto") CercaAutoRequest request, ModelMap modelMap) {

	    	List<Automobile> autoTrovate=autosaloneService.ricercaAutomobili(request);
	    	modelMap.addAttribute("listAutoTrovate", autoTrovate);
	        return "searchAuto";
	    }





}
