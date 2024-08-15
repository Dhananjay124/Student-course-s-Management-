package com.dsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsp.model.TrainingScheduleModel;
import com.dsp.repository.TrainingScheduleRepository;

@Service
public class TrainingScheduleServiceImpl implements TrainingScheduleService{

	@Autowired
	private TrainingScheduleRepository trainingScheduleRepository;

	@Override
	public List<TrainingScheduleModel> getallcources(TrainingScheduleModel trainingScheduleModel) {
		List<TrainingScheduleModel> courses=null;
		try {
			courses=trainingScheduleRepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return courses;
	}
	
	
	
}
