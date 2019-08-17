package com.example.mentor_on_demand.service;

import java.util.Optional;

import com.example.mentor_on_demand.model.MentorCalendar;

public interface MentorCalendarRepository {

	Optional<MentorCalendar> findByMentorId(int id);

}
