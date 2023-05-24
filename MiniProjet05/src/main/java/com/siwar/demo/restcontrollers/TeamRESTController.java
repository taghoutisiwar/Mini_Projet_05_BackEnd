package com.siwar.demo.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.siwar.demo.entities.Team;
import com.siwar.demo.repos.TeamRepository;


@RestController
@RequestMapping("/api/te")
@CrossOrigin("*")
public class TeamRESTController {
	
	@Autowired
	TeamRepository teamRepository;

	@RequestMapping(method = RequestMethod.GET)
	public List<Team> getAllTeams() {
		return teamRepository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Team getTeamById(@PathVariable("id") Long id) {
		return teamRepository.findById(id).get();
	}
}
