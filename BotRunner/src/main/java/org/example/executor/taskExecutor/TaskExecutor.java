package org.example.executor.taskExecutor;

import ca.arnah.reddit4j.RedditUserClient;
import org.example.executor.RunningData;

public interface TaskExecutor {
    void execute(RunningData runningData, RedditUserClient redditUserClient);
}
