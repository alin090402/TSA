package org.example.database.model.task;

import jakarta.persistence.*;
import lombok.Data;
import org.example.database.model.RoutineModel;
import org.example.database.model.enumeration.TaskType;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type")
public abstract class TaskModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "routine_id")
    private RoutineModel routine;

    @Transient
    public abstract TaskType getTaskType();
}
