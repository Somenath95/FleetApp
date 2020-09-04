package io.example.fleetapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.example.fleetapp.models.State;
import io.example.fleetapp.services.StateService;

@Controller
public class StateController {

	@Autowired
	private StateService stateService;
	
	@GetMapping("/states")
	public String getStates(Model model) {
		
		List<State> stateList = stateService.getStates();
		model.addAttribute("states", stateList);
		
		return "state";
	}
	
	@PostMapping("/states/addNew")
	public String addNew(State state) {
		stateService.saveState(state);
		return "redirect:/states";
	}
	
	@RequestMapping("states/findById")
	@ResponseBody
	public Optional<State> findById(int id) {
		return stateService.findById(id);
	}
	
	@RequestMapping(value="/states/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String updateState(State state) {
		stateService.saveState(state);
		return "redirect:/states";
	}
	
	@RequestMapping(value="/states/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String deleteState(int id) {
		stateService.delete(id);
		return "redirect:/states";
	}

}
