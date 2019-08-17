package com.example.mentor_on_demand.service;

import java.util.Optional;

import com.example.mentor_on_demand.model.Mentor;

public interface MentorRepository {

	Optional<Mentor> findById(int id);

}
