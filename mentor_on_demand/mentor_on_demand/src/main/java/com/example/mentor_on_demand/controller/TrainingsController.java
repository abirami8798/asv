package com.example.mentor_on_demand.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mentor_on_demand.model.Trainings;
import com.example.mentor_on_demand.service.TrainingsRepository;

@CrossOrigin(origins = "http://localhost:4321")
@RestController
@RequestMapping("/api")
public class TrainingsController {

	@Autowired
	TrainingsRepository trainingRepo;

	@GetMapping("/getTrainingDetails/{id}")
	public Optional<Trainings> getAllCustomers(@PathVariable int id) {
		System.out.println("Get all trainings details...");
		Optional<Trainings> trainings = trainingRepo.findById(id);
		return trainings;
	}
	@GetMapping(value = "getCompletedTrainings/{status}")
	public List<Trainings> findByStatus(@PathVariable String status) {
		List<Trainings> trainings = trainingRepo.findByStatus(status);
		return trainings;
	}

	@GetMapping(value = "getUnderProgressTrainings/{userId}")
	public List<Trainings> findByProgress(@PathVariable int userId) {
		List<Trainings> trainings = trainingRepo.findByUserId(userId);
		List<Trainings> trainingList = new ArrayList();
		Iterator itr = trainings.iterator();
		while (itr.hasNext()) {
			Trainings training = (Trainings) itr.next();
			if (training.getStatus().equals("inprogress")) {
				trainingList.add(training);
			}

		}
		return trainingList;
	}

	@GetMapping(value = "proposedTrainings/{userId}")
	public List<Trainings> findByProposal(@PathVariable int userId) {
		List<Trainings> trainings = trainingRepo.findByUserId(userId);
		List<Trainings> trainingList = new ArrayList();
		Iterator itr = trainings.iterator();
		while (itr.hasNext()) {
			Trainings training = (Trainings) itr.next();
			if (training.getStatus().equals("proposed")) {
				training.setStatus("approved");
				trainingList.add(training);
			}
		}
		return trainingList;
	}

	@GetMapping(value = "finalizeTraining/amount/{amountReceived}")
	public List<Trainings> findByPayment(@PathVariable String amountReceived) {
		List<Trainings> trainings = trainingRepo.findByAmountReceived(amountReceived);
		return trainings;
	}
}
