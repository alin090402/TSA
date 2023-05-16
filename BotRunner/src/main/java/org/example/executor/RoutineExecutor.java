package org.example.executor;

import ca.arnah.reddit4j.RedditUserClient;
import org.example.database.model.RoutineModel;
import org.example.database.model.task.TaskModel;
import org.example.executor.taskExecutor.TaskExecutor;
import org.example.executor.taskExecutor.TaskExecutorFactory;

import java.util.List;

public class RoutineExecutor {
    private final RunningData runningData;
    private final RoutineModel routine;
    private final RedditUserClient redditUserClient;
    private List<TaskExecutor> taskExecutors;


    public RoutineExecutor(RoutineModel routine, RedditUserClient redditUserClient) {
        this.routine = routine;
        this.runningData = new RunningData();
        this.redditUserClient = redditUserClient;
    }
    public RoutineExecutor(RunningData runningData, RoutineModel routine, RedditUserClient redditUserClient) {
        this.runningData = runningData;
        this.routine = routine;
        this.redditUserClient = redditUserClient;
    }

    public void execute() {
        for (TaskExecutor taskExecutor : taskExecutors) {
            taskExecutor.execute(runningData, redditUserClient);
        }
    }

    private void prepare(){
        for(TaskModel task : routine.getTasks()){
            taskExecutors.add(TaskExecutorFactory.createTaskExecutor(task));
        }
    }

}
