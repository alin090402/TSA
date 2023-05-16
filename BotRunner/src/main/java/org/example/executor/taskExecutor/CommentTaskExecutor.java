package org.example.executor.taskExecutor;

import ca.arnah.reddit4j.RedditUserClient;
import ca.arnah.reddit4j.objects.reddit.Link;
import ca.arnah.reddit4j.objects.references.LinkReference;
import org.example.database.model.task.CommentTaskModel;
import org.example.executor.RunningData;

import java.util.List;

public class CommentTaskExecutor implements TaskExecutor{
    private final CommentTaskModel task;

    public CommentTaskExecutor(CommentTaskModel task) {
        this.task = task;
    }

    @Override
    public void execute(RunningData runningData, RedditUserClient redditUserClient) {
        List<Link> post = runningData.getPosts();
        post.forEach(link -> {
           link.getReference(redditUserClient).comment(task.getComment());
        });
    }
}
