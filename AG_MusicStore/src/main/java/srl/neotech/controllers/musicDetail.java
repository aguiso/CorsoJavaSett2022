package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class musicDetail {
	
		@GetMapping(value="musicDetail")
		public String paginaMusicDetail() {
			return "musicDetail";
		}
}
