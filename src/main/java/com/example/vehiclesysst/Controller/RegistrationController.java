package com.example.vehiclesysst.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.vehiclesysst.Domain.Registration;
import com.example.vehiclesysst.Service.RegistrationService;

@Controller
@RequestMapping("/Registration")
public class RegistrationController {
	@Autowired
	  private RegistrationService service;
	 
	    
	    @GetMapping("/addregistration")
	    public String add(Model model) {
	    	 List<Registration> listregistration = service.listAll();
	        model.addAttribute("listregistration", listregistration);
	        model.addAttribute("registration", new Registration());
	       return "addregistration" ;
	    }
	    
	    
	    
	    
	    
	    
	    
	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String saveRegistration(@ModelAttribute("registration") Registration registration) {
	        service.save(registration);
	        return "redirect:/registration";
	    }
	 
	    @RequestMapping("/edit/{id}")
	    public ModelAndView showEditRegistrationPage(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("addregistration");
	        Registration registration = service.get(id);
	        mav.addObject("registration", registration);
	        return mav;
	        
	    }
	    @RequestMapping("/delete/{id}")
	    public String deleteRegistrationPage(@PathVariable(name = "id") int id) {
	        service.delete(id);
	        return "redirect:/registration";
	    }
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
