package com.dsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsp.model.TrainingScheduleModel;
import com.dsp.service.TrainingScheduleService;

@RestController
@RequestMapping("/trainingschedule")
public class TrainingScheduleController {

	@Autowired
	private TrainingScheduleService trainingScheduleService;
	
	@GetMapping("/getallcourses")
	public List<TrainingScheduleModel> getallcourselList(TrainingScheduleModel trainingScheduleModel){
		return trainingScheduleService.getallcources(trainingScheduleModel);
	}
	
}
