package org.example.executor.taskExecutor;

import ca.arnah.reddit4j.RedditUserClient;
import org.example.database.model.task.FindTaskModel;
import org.example.executor.RunningData;

public class FindTaskExecutor implements TaskExecutor {

    private final FindTaskModel task;

    public FindTaskExecutor(FindTaskModel task) {
        this.task = task;
    }

    @Override
    public void execute(RunningData runningData, RedditUserClient redditUserClient){
        var lastPosts = redditUserClient.subreddit(task.getSubreddit()).posts().limit(100).build().next();
        lastPosts.forEach(post -> {
            runningData.getPosts().add(post);
        });
    }
}
