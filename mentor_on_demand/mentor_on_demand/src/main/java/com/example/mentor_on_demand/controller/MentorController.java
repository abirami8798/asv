package com.example.mentor_on_demand.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mentor_on_demand.model.Mentor;
import com.example.mentor_on_demand.model.MentorCalendar;
import com.example.mentor_on_demand.model.MentorSkill;
import com.example.mentor_on_demand.service.MentorCalendarRepository;
import com.example.mentor_on_demand.service.MentorRepository;
import com.example.mentor_on_demand.service.MentorSkillRepository;

@CrossOrigin(origins = "http://localhost:4321")
@RestController
@RequestMapping("/api")
public class MentorController {
	@Autowired
	MentorRepository mentorRepo;

	@Autowired
	MentorSkillRepository skillRepo;

	@Autowired
	MentorCalendarRepository calendarRepo;

	@GetMapping("/getMentorDetails/{id}")
	public List getAllCustomers(@PathVariable int id) {

		List mentor = new ArrayList();
		System.out.println("Get the Mentor details...");
		Optional<MentorSkill> skillList = skillRepo.findByMentorId(id);
		Optional<Mentor> mentorDetails = mentorRepo.findById(id);
		Optional<MentorCalendar> calendarList = calendarRepo.findByMentorId(id);

		mentor.add(mentorDetails);
		mentor.add(skillList);
		mentor.add(calendarList);
		return mentor;
	}
}
