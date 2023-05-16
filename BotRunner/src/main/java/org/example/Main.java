package org.example;


import ca.arnah.reddit4j.RedditUserClient;
import ca.arnah.reddit4j.config.RedditClientConfig;
import ca.arnah.reddit4j.config.ScriptClientConfig;
import ca.arnah.reddit4j.objects.app.script.Credentials;
import ca.arnah.reddit4j.objects.app.script.PersonalUseScript;
import ca.arnah.reddit4j.objects.app.script.UserAgent;
import ca.arnah.reddit4j.objects.reddit.SubredditSort;
import lombok.RequiredArgsConstructor;
import org.example.config.ConfigLoader;
import org.example.database.service.BotService;

import java.util.Properties;

@RequiredArgsConstructor
public class Main {

    public static void main(String[] args) {
//        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
//        String botConfigPath = rootPath + "botAccount.properties";
//        Properties botProp = ConfigLoader.getInstance().getBotProp();
//        System.out.println("username: " + botProp.getProperty("username"));
//        System.out.println("password: " + botProp.getProperty("password"));
//        System.out.println("client_id: " + botProp.getProperty("client_id"));
//        System.out.println("client_secret: " + botProp.getProperty("client_secret"));
//
//        RedditClientConfig redditClientConfig = new ScriptClientConfig(
//                new PersonalUseScript(botProp.getProperty("client_id"), botProp.getProperty("client_secret")),
//                new UserAgent("TSAA", "1.0", "tsaaaaaaaa"),
//                new Credentials(botProp.getProperty("username"), botProp.getProperty("password"))
//        );
//        RedditUserClient redditUserClient = new RedditUserClient(redditClientConfig);
//        var subredditPaginator = redditUserClient.subreddit("tsaa").posts().sorting(SubredditSort.New).limit(100).build();
//        for (var post : subredditPaginator.next()) {
//            System.out.println(post.getTitle());
//        }


    }
}