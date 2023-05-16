package org.example.database.model.task;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.database.model.enumeration.TaskType;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("COMMENT")
public class CommentTaskModel extends TaskModel {
    private String comment;
    @Transient
    @Override
    public TaskType getTaskType() {
        return TaskType.COMMENT;
    }
}
