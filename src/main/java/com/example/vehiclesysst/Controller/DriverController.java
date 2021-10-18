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

import com.example.vehiclesysst.Domain.Driver;
import com.example.vehiclesysst.Domain.Registration;
import com.example.vehiclesysst.Service.DriverService;
import com.example.vehiclesysst.Service.RegistrationService;

@Controller
@RequestMapping("/Driver")
public class DriverController {
	 @Autowired
	    private DriverService service;
	@Autowired
	private RegistrationService services;
	 
	    @GetMapping("/adddriver")
	    public String add(Model model) {
	     List<Driver> listdriver = service.listAll();
	     List<Registration> listregistration = services.listAll();
	    model.addAttribute("listregistration", listregistration);
	        model.addAttribute("listdriver", listdriver);
	        model.addAttribute("driver", new Driver());
	        return "adddriver";
	    }
	    
	    
	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String saveDriver(@ModelAttribute("driver") Driver std)
	    {
	        service.save(std);
	        return "redirect:/driver";
	    }
	    
	 
	    @RequestMapping("/edit/{id}")
	    public ModelAndView showEditDriverPage(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("adddriver");
	        List<Registration> listregistration = services.listAll();
	        Driver std = service.get(id);
	        mav.addObject("driver", std);
	        return mav;
	        
	    }
	    @RequestMapping("/delete/{id}")
	    public String deleteDriverPage(@PathVariable(name = "id") int id) {
	        service.delete(id);
	        return "driver";
	    }
	 
}
