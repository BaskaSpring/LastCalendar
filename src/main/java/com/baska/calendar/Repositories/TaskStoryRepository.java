package com.baska.calendar.Repositories;

import com.baska.calendar.Models.TaskStory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskStoryRepository extends JpaRepository<TaskStory,String> {

}
