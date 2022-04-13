package com.baska.calendar.Repositories;

import com.baska.calendar.Models.ProjectStory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProjectStoryRepository extends JpaRepository<ProjectStory,String> {

}
