package com.dsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsp.model.TrainingScheduleModel;

public interface TrainingScheduleRepository extends JpaRepository<TrainingScheduleModel, Integer> {

}
