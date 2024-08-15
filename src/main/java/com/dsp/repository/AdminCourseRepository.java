package com.dsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsp.model.AdminCoursesModel;

public interface AdminCourseRepository extends JpaRepository<AdminCoursesModel, Integer> {

}
