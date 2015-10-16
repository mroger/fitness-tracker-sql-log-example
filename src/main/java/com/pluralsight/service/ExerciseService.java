package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Exercise;

public interface ExerciseService {

	List<Activity> findAllActivities();

	Exercise save(Exercise exercise);

}