package com.revature.hydra.curriculum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.hydra.curriculum.bean.Curriculum;
import com.revature.hydra.curriculum.bean.CurriculumSubtopic;

@Repository
public interface CurriculumSubtopicRepository extends JpaRepository<CurriculumSubtopic, Integer> {
	public List<CurriculumSubtopic> findAll();
	public List<CurriculumSubtopic> findByCurriculum(Curriculum c);
}
