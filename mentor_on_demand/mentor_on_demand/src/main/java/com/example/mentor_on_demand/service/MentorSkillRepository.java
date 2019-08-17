package com.example.mentor_on_demand.service;

import java.util.Optional;

import com.example.mentor_on_demand.model.MentorSkill;





public interface MentorSkillRepository {

	Optional<MentorSkill> findByMentorId(int id);





}
