package org.example.database.repository;

import org.example.database.model.task.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TaskRepository  extends JpaRepository<TaskModel, Long> {

}
