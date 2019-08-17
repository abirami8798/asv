package com.example.mentor_on_demand.service;

import java.util.List;
import java.util.Optional;

import com.example.mentor_on_demand.model.Trainings;

public interface TrainingsRepository {
	
	public List<Trainings> findByStatus(String status);

	public Optional<Trainings> findById(long id);

	public List<Trainings> findByUserId(long userId);

	public List<Trainings> findByAmountReceived(String amountReceived); 

}
