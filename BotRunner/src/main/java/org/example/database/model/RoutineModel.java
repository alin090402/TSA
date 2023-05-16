package org.example.database.model;

import jakarta.persistence.*;
import lombok.Data;
import org.example.database.model.task.TaskModel;

import java.util.List;

@Entity
@Data
public class RoutineModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "bot_id")
    private BotModel bot;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @OrderColumn(name="task_index")
    private List<TaskModel> tasks;

    @Column(name = "`repeatable`")
    private boolean repeatable;

    @Column(name = "`interval`")
    private Interval interval;


}
