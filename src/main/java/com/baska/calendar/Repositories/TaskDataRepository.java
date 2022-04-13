package com.baska.calendar.Repositories;

import com.baska.calendar.Models.TaskData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskDataRepository extends JpaRepository<TaskData,String> {
}
