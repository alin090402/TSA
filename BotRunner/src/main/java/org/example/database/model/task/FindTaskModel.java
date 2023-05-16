package org.example.database.model.task;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.database.model.enumeration.TaskType;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("FIND")
public class FindTaskModel extends TaskModel {
    @ElementCollection
    private List<String> keywords;

    private String subreddit;

    @Override
    public TaskType getTaskType() {
        return TaskType.FIND;
    }
}
